package utilidades;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import launcheruniversae.MainWindow;

/**
 *
 * @author Víctor Arroyo
 */
public class Utilidades extends javax.swing.JFrame {

    public Utilidades() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1013, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método [1] para mostrar paneles (Page1,2,3,etc) dentro de un panel contenedor [content]
    public static void showPanel(JPanel pagina, JPanel content) {
        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(content);
        if (window instanceof MainWindow) {
            MainWindow main = (MainWindow) window;
            JPanel contentPanel = main.getContentPanel();
            if (content != contentPanel) {
                content = contentPanel;
            }
        }
        pagina.setSize(content.getSize());
        pagina.setLocation(0, 0);

        content.removeAll();
        content.add(pagina, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    //    Metodo [2-3]  para asignar imageen a un label
    public static void setLabelImage(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        labelName.repaint();
    }

//    Metodo [2-3] sobrecargado para asignar imageen a un label, con la opcion booleana de conerbar las proporciones de tamaño
    public static void setLabelImage(JLabel labelName, String root, boolean keepProportions) {
        ImageIcon image = new ImageIcon(root);

        if (labelName.getWidth() == 0 || labelName.getHeight() == 0) {
            SwingUtilities.invokeLater(() -> setLabelImage(labelName, root, keepProportions));
            return;
        }
        Image originalImage = image.getImage();

        int labelWidth = labelName.getWidth();
        int labelHeight = labelName.getHeight();

        int newWidth = labelWidth;
        int newHeight = labelHeight;

        if (keepProportions) {
            int originalWidth = originalImage.getWidth(null);
            int originalHeight = originalImage.getHeight(null);

            double aspectRatio = (double) originalWidth / originalHeight;

            if (labelWidth / (double) labelHeight > aspectRatio) {
                newWidth = (int) (labelHeight * aspectRatio);
            } else {
                newHeight = (int) (labelWidth / aspectRatio);
            }
        }
        Icon icon = new ImageIcon(originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        labelName.repaint();
    }

//    Metodo [2-3] sobrecargado para asignar imageen a un label, añadiendo el tamaño del tamaño de la imagen en el interior del label a tipo de porcentaje (0.9 -> 90% tamaño del label)
    public static void setLabelImage(JLabel labelName, String root, boolean keepProportions, double escala) {
        ImageIcon image = new ImageIcon(root);

        if (labelName.getWidth() == 0 || labelName.getHeight() == 0) {
            SwingUtilities.invokeLater(() -> setLabelImage(labelName, root, keepProportions, escala));
            return;
        }
        if (keepProportions) {
            double imageWidth = image.getIconWidth();
            double imageHeight = image.getIconHeight();
            double labelWidth = labelName.getWidth();
            double labelHeight = labelName.getHeight();

            double scale = Math.min(labelWidth / imageWidth, labelHeight / imageHeight);
            int newWidth = (int) (imageWidth * scale);
            int newHeight = (int) (imageHeight * scale);

            Icon icon = new ImageIcon(image.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
        } else {
            Icon icon = new ImageIcon(image.getImage().getScaledInstance((int) (labelName.getWidth() * escala), (int) (labelName.getHeight() * escala), Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
        }
    }

    //Metodo [2-3] sobrecargado para asignar imageen a un label, con la opcion booleana de conerbar las proporciones de tamaño --> Aqui el tamaño sera indicado con [Dimension newDimension = new Dimension(width, height);]
    public static void setLabelImage(JLabel labelName, String root, boolean keepProportions, Dimension dimension) {
        ImageIcon image = new ImageIcon(root);
        Image originalImage = image.getImage();

        if (labelName.getWidth() == 0 || labelName.getHeight() == 0) {
            SwingUtilities.invokeLater(() -> setLabelImage(labelName, root, keepProportions, dimension));
            return;
        }

        int newWidth = dimension.width;
        int newHeight = dimension.height;

        if (keepProportions) {
            int originalWidth = originalImage.getWidth(null);
            int originalHeight = originalImage.getHeight(null);

            double aspectRatio = (double) originalWidth / originalHeight;

            if (newWidth / (double) newHeight > aspectRatio) {
                newWidth = (int) (newHeight * aspectRatio);
            } else {
                newHeight = (int) (newWidth / aspectRatio);
            }
        }

        Icon icon = new ImageIcon(originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        labelName.repaint();
    }

    //Metodo [4] Generar listas con rutas de archivos con el mismo nombre y un numero de foto (src/ruta/foto1.jpg, src/ruta/foto2.jpg, etc)
    public static ArrayList<String> createStringList(String root, String name, String fileType, int listSize) {
        ArrayList<String> array = new ArrayList<>();
        if (!root.endsWith("/")) { //por si acaso el input de la ruta es sin barra final
            root += "/";
        }
        if (!fileType.startsWith(".")) {
            fileType = "." + fileType;
        }
        for (int i = 0; i <= listSize; i++) {
            array.add(root + name + i + fileType);

        }
        return array;
    }

    //Metodo [5] Leer un archivo mediante una ruta por string y mostrar su contenido por cadena de texto por output
    public static String readTextFile(String root) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(root))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return content.toString();
    }

    //Metodo [6] Hilo asincrono para ejecución en el tiempo
    public static void executeAsync(long waitTime, Runnable asyncFunction) { //executeAsync(1000, () -> {System.out.println("2");});
        new Thread(() -> {
            try {
                Thread.sleep(waitTime);
                asyncFunction.run();
            } catch (InterruptedException e) {
                System.err.println("Error en el hilo asíncrono: " + e.getMessage());
            }
        }).start();
    }

    // Método [7] para agregar efecto HOVER
    public static void addHoverEffect(JLabel label, String imagePath, double escala) {

        if (label.getWidth() == 0 || label.getHeight() == 0) {
            SwingUtilities.invokeLater(() -> addHoverEffect(label, imagePath, escala));
            return;
        }

        final ImageIcon originalIcon = new ImageIcon(imagePath);
        int labelWidth = label.getWidth();
        int labelHeight = label.getHeight();
        double baseScale = escala;
        int baseWidth = (int) (labelWidth * baseScale);
        int baseHeight = (int) (labelHeight * baseScale);
        final ImageIcon baseScaledIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(baseWidth, baseHeight, Image.SCALE_SMOOTH));

        // 100% del tamaño del label
        final ImageIcon fullScaledIcon = new ImageIcon(
                originalIcon.getImage().getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH));

        label.setIcon(baseScaledIcon);

        label.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                label.setIcon(fullScaledIcon);
                label.revalidate();
                label.repaint();
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                label.setIcon(baseScaledIcon);
                label.revalidate();
                label.repaint();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
