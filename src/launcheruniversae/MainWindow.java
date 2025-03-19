package launcheruniversae;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import utilidades.Utilidades;
import launcheruniversae.Page1;

/**
 *
 * @author Víctor Arroyo
 */
public class MainWindow extends javax.swing.JFrame {

    private Page1 pagina1 = new Page1();
    
    public MainWindow() {
        initComponents();
//        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        Utilidades.setLabelImage(labelBgImage, "src/launcheruniversae/img/Fondo base.png", true);
        Utilidades.showPanel(pagina1, contenedorPaginas);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        labelBgImage = new javax.swing.JLabel();
        contenedorPaginas = new javax.swing.JPanel();

        setTitle("Universae");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        content.setBackground(new java.awt.Color(10, 38, 72));
        content.setMaximumSize(new java.awt.Dimension(1920, 1080));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBgImage.setBackground(new java.awt.Color(10, 38, 72));
        labelBgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/Fondo base.png"))); // NOI18N
        content.add(labelBgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1090));

        contenedorPaginas.setBackground(new java.awt.Color(10, 38, 72));

        javax.swing.GroupLayout contenedorPaginasLayout = new javax.swing.GroupLayout(contenedorPaginas);
        contenedorPaginas.setLayout(contenedorPaginasLayout);
        contenedorPaginasLayout.setHorizontalGroup(
            contenedorPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1430, Short.MAX_VALUE)
        );
        contenedorPaginasLayout.setVerticalGroup(
            contenedorPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        content.add(contenedorPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 1430, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 1087, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("Launcher Universae");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPaginas;
    private javax.swing.JPanel content;
    private javax.swing.JLabel labelBgImage;
    // End of variables declaration//GEN-END:variables
}
