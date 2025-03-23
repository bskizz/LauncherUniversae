package launcheruniversae;

import java.util.ArrayList;
import javax.swing.JLabel;
import utilidades.Utilidades;

/**
 *
 * @author Victor Arroyo
 */
public class VistaGame extends javax.swing.JPanel {

    private ArrayList<String> listaRutasImagenesCarrusel;
    private ArrayList<JLabel> listaLabelBolas = new ArrayList();
    int pos = 0; // posicion carrusel 0 -- 4
    private int carruselSeleccionado; // 0 -- 5 (depende del boton que presionamos en la ventana home)
    private javax.swing.Timer timer;

    public VistaGame(int carruselAMostrar) {
        initComponents();
        listaLabelBolas = createLabelListExistentes(imgBolaCarrusel0, imgBolaCarrusel1, imgBolaCarrusel2, imgBolaCarrusel3, imgBolaCarrusel4);
        carruselSeleccionado = carruselAMostrar;
        actualizarCarrusel();
        rellenarBola(pos);
        iniciarCarruselAutomatico();
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder()); //para el borde de la descripcion, que desde modo grafico no se deshabilita
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorEmbDesembHelic = new javax.swing.JPanel();
        imgMainCarrusel = new javax.swing.JLabel();
        imgCarruselFondoDerecha = new javax.swing.JLabel();
        imgCarruselFondoIzquierda = new javax.swing.JLabel();
        PanelIndiceImagenes = new javax.swing.JPanel();
        imgBolaCarrusel0 = new javax.swing.JLabel();
        imgBolaCarrusel1 = new javax.swing.JLabel();
        imgBolaCarrusel2 = new javax.swing.JLabel();
        imgBolaCarrusel3 = new javax.swing.JLabel();
        imgBolaCarrusel4 = new javax.swing.JLabel();
        imgComenzar = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        botonIzquierdaCarrusel = new javax.swing.JLabel();
        botonDerechaCarrusel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1430, 730));
        setMinimumSize(new java.awt.Dimension(1430, 730));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1430, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedorEmbDesembHelic.setMaximumSize(new java.awt.Dimension(1430, 730));
        contenedorEmbDesembHelic.setMinimumSize(new java.awt.Dimension(1430, 730));
        contenedorEmbDesembHelic.setName(""); // NOI18N
        contenedorEmbDesembHelic.setOpaque(false);
        contenedorEmbDesembHelic.setPreferredSize(new java.awt.Dimension(1430, 730));
        contenedorEmbDesembHelic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgMainCarrusel.setBackground(new java.awt.Color(51, 51, 51));
        imgMainCarrusel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMainCarrusel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/Embarque0.png"))); // NOI18N
        imgMainCarrusel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgMainCarrusel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgMainCarrusel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMainCarruselMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMainCarruselMouseExited(evt);
            }
        });
        contenedorEmbDesembHelic.add(imgMainCarrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 860, 490));

        imgCarruselFondoDerecha.setBackground(new java.awt.Color(102, 102, 102));
        imgCarruselFondoDerecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        imgCarruselFondoDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/Cuadrado fondo enfocado.png"))); // NOI18N
        imgCarruselFondoDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgCarruselFondoDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCarruselFondoDerechaMouseClicked(evt);
            }
        });
        contenedorEmbDesembHelic.add(imgCarruselFondoDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 40, 130, 420));

        imgCarruselFondoIzquierda.setBackground(new java.awt.Color(102, 102, 102));
        imgCarruselFondoIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/Cuadrado fondo enfocado.png"))); // NOI18N
        imgCarruselFondoIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgCarruselFondoIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCarruselFondoIzquierdaMouseClicked(evt);
            }
        });
        contenedorEmbDesembHelic.add(imgCarruselFondoIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 140, 420));

        PanelIndiceImagenes.setOpaque(false);

        imgBolaCarrusel0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/PuntoCarruselEmpty.png"))); // NOI18N
        imgBolaCarrusel0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBolaCarrusel0.setDisabledIcon(null);
        imgBolaCarrusel0.setMaximumSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel0.setMinimumSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel0.setPreferredSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBolaCarrusel0MouseClicked(evt);
            }
        });
        PanelIndiceImagenes.add(imgBolaCarrusel0);

        imgBolaCarrusel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/PuntoCarruselEmpty.png"))); // NOI18N
        imgBolaCarrusel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBolaCarrusel1.setDisabledIcon(null);
        imgBolaCarrusel1.setMaximumSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel1.setMinimumSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel1.setPreferredSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBolaCarrusel1MouseClicked(evt);
            }
        });
        PanelIndiceImagenes.add(imgBolaCarrusel1);

        imgBolaCarrusel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/PuntoCarruselEmpty.png"))); // NOI18N
        imgBolaCarrusel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBolaCarrusel2.setDisabledIcon(null);
        imgBolaCarrusel2.setMaximumSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel2.setMinimumSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel2.setPreferredSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBolaCarrusel2MouseClicked(evt);
            }
        });
        imgBolaCarrusel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imgBolaCarrusel2KeyPressed(evt);
            }
        });
        PanelIndiceImagenes.add(imgBolaCarrusel2);

        imgBolaCarrusel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/PuntoCarruselEmpty.png"))); // NOI18N
        imgBolaCarrusel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBolaCarrusel3.setDisabledIcon(null);
        imgBolaCarrusel3.setMaximumSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel3.setMinimumSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel3.setPreferredSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBolaCarrusel3MouseClicked(evt);
            }
        });
        PanelIndiceImagenes.add(imgBolaCarrusel3);

        imgBolaCarrusel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/PuntoCarruselEmpty.png"))); // NOI18N
        imgBolaCarrusel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBolaCarrusel4.setDisabledIcon(null);
        imgBolaCarrusel4.setMaximumSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel4.setMinimumSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel4.setPreferredSize(new java.awt.Dimension(15, 15));
        imgBolaCarrusel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBolaCarrusel4MouseClicked(evt);
            }
        });
        PanelIndiceImagenes.add(imgBolaCarrusel4);

        contenedorEmbDesembHelic.add(PanelIndiceImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 110, -1));

        imgComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/Comenzar.png"))); // NOI18N
        imgComenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contenedorEmbDesembHelic.add(imgComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1284, 806, 260, 50));

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Embarque y desembarque en helicoptero");
        labelTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        labelTitulo.setVerifyInputWhenFocusTarget(false);
        contenedorEmbDesembHelic.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 750, 40));

        jScrollPane1.setBorder(null);
        jScrollPane1.setWheelScrollingEnabled(false);

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(8);
        txtDescripcion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \n\nDuis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum\n");
        txtDescripcion.setAutoscrolls(false);
        txtDescripcion.setBorder(null);
        txtDescripcion.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDescripcion.setOpaque(false);
        txtDescripcion.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtDescripcion.setBorder(null);
        jScrollPane1.setViewportView(txtDescripcion);
        jScrollPane1.setViewportView(txtDescripcion);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);

        contenedorEmbDesembHelic.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 760, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/Barrita aislada descripción.png"))); // NOI18N
        contenedorEmbDesembHelic.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 10, 40));

        botonIzquierdaCarrusel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonIzquierdaCarrusel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/Flecha izquierda.png"))); // NOI18N
        botonIzquierdaCarrusel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIzquierdaCarrusel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIzquierdaCarruselMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonIzquierdaCarruselMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIzquierdaCarruselMouseExited(evt);
            }
        });
        contenedorEmbDesembHelic.add(botonIzquierdaCarrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 30, 50));

        botonDerechaCarrusel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonDerechaCarrusel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/launcheruniversae/img/PageCarruselGame/Flecha derecha.png"))); // NOI18N
        botonDerechaCarrusel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDerechaCarrusel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDerechaCarruselMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonDerechaCarruselMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonDerechaCarruselMouseExited(evt);
            }
        });
        contenedorEmbDesembHelic.add(botonDerechaCarrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 230, 30, 50));

        add(contenedorEmbDesembHelic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 870));
        contenedorEmbDesembHelic.getAccessibleContext().setAccessibleName("");
        contenedorEmbDesembHelic.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void imgCarruselFondoDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCarruselFondoDerechaMouseClicked
        pos += 1;
        actualizarCarrusel();
        timer.restart();
    }//GEN-LAST:event_imgCarruselFondoDerechaMouseClicked

    private void botonDerechaCarruselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDerechaCarruselMouseClicked
        pos += 1;
        actualizarCarrusel();
        timer.restart();
    }//GEN-LAST:event_botonDerechaCarruselMouseClicked

    private void imgCarruselFondoIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCarruselFondoIzquierdaMouseClicked
        pos -= 1;
        actualizarCarrusel();
        timer.restart();
    }//GEN-LAST:event_imgCarruselFondoIzquierdaMouseClicked

    private void botonIzquierdaCarruselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIzquierdaCarruselMouseClicked
        pos -= 1;
        actualizarCarrusel();
        timer.restart();
    }//GEN-LAST:event_botonIzquierdaCarruselMouseClicked

    private void imgBolaCarrusel0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBolaCarrusel0MouseClicked
        pos = 0;
        actualizarCarrusel();
        timer.restart();
    }//GEN-LAST:event_imgBolaCarrusel0MouseClicked

    private void imgBolaCarrusel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBolaCarrusel1MouseClicked
        pos = 1;
        actualizarCarrusel();
        timer.restart();
    }//GEN-LAST:event_imgBolaCarrusel1MouseClicked

    private void imgBolaCarrusel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBolaCarrusel3MouseClicked
        pos = 3;
        actualizarCarrusel();
        timer.restart();
    }//GEN-LAST:event_imgBolaCarrusel3MouseClicked

    private void imgBolaCarrusel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBolaCarrusel4MouseClicked
        pos = 4;
        actualizarCarrusel();
        timer.restart();
    }//GEN-LAST:event_imgBolaCarrusel4MouseClicked

    private void imgBolaCarrusel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imgBolaCarrusel2KeyPressed
        //Nada
    }//GEN-LAST:event_imgBolaCarrusel2KeyPressed

    private void imgBolaCarrusel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBolaCarrusel2MouseClicked
        pos = 2;
        actualizarCarrusel();
        timer.restart();
    }//GEN-LAST:event_imgBolaCarrusel2MouseClicked

    private void imgMainCarruselMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMainCarruselMouseEntered
        timer.stop();
    }//GEN-LAST:event_imgMainCarruselMouseEntered

    private void imgMainCarruselMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMainCarruselMouseExited
        timer.restart();
    }//GEN-LAST:event_imgMainCarruselMouseExited

    private void botonDerechaCarruselMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDerechaCarruselMouseEntered
        Utilidades.setLabelImage(botonDerechaCarrusel, "src/launcheruniversae/img/PageCarruselGame/Flecha derecha.png", false, 1);
    }//GEN-LAST:event_botonDerechaCarruselMouseEntered

    private void botonDerechaCarruselMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDerechaCarruselMouseExited
        Utilidades.setLabelImage(botonDerechaCarrusel, "src/launcheruniversae/img/PageCarruselGame/Flecha derecha.png", false, 0.7);
    }//GEN-LAST:event_botonDerechaCarruselMouseExited

    private void botonIzquierdaCarruselMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIzquierdaCarruselMouseEntered
        Utilidades.setLabelImage(botonIzquierdaCarrusel, "src/launcheruniversae/img/PageCarruselGame/Flecha izquierda.png", false, 1);
    }//GEN-LAST:event_botonIzquierdaCarruselMouseEntered

    private void botonIzquierdaCarruselMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIzquierdaCarruselMouseExited
        Utilidades.setLabelImage(botonIzquierdaCarrusel, "src/launcheruniversae/img/PageCarruselGame/Flecha izquierda.png", false, 0.7);
    }//GEN-LAST:event_botonIzquierdaCarruselMouseExited

    private void actualizarCarrusel() {
        crearListaRutasCarruselSeleccionado();

        if (listaRutasImagenesCarrusel == null || listaRutasImagenesCarrusel.isEmpty()) {
            System.out.println("No hay imágenes para mostrar");
            return;
        }

        if (pos < 0) {
            pos = listaRutasImagenesCarrusel.size() - 1;
        } else if (pos >= listaRutasImagenesCarrusel.size()) {
            pos = 0;
        }

        String rutaImagen = listaRutasImagenesCarrusel.get(pos);
        Utilidades.setLabelImage(imgMainCarrusel, rutaImagen, true);

        rellenarBola(pos);

        System.out.println("Mostrando imagen " + (pos + 1) + " de " + listaRutasImagenesCarrusel.size());
    }

    // Crea una lista con las rutas de las imagenes segun el juego que hayamos seleccionado
    private void crearListaRutasCarruselSeleccionado() {
        switch (carruselSeleccionado) {
            case 1:
                listaRutasImagenesCarrusel = Utilidades.createStringList("src/launcheruniversae/img/PageCarruselGame/", "Embarque", ".png", 4);
                labelTitulo.setText("Embarque y desembarque en helicoptero");
                txtDescripcion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \n" + "\n"
                        + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
                break;
            case 2:
                listaRutasImagenesCarrusel = Utilidades.createStringList("src/launcheruniversae/img/PageCarruselGame/", "Hemorragia", ".png", 4);
                labelTitulo.setText("Protocolo ante una hemorragia externa");
                txtDescripcion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \n" + "\n"
                        + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
                break;
            case 3:
                listaRutasImagenesCarrusel = Utilidades.createStringList("src/launcheruniversae/img/PageCarruselGame/", "Extincion", ".png", 4);
                labelTitulo.setText("Maniobras de extinción según la instalación");
                txtDescripcion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \n" + "\n"
                        + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
                break;
            case 4:
                listaRutasImagenesCarrusel = Utilidades.createStringList("src/launcheruniversae/img/PageCarruselGame/", "EPIS", ".png", 4);
                labelTitulo.setText("Tipología y características de los EPIs");
                txtDescripcion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \n" + "\n"
                        + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
                break;
            case 5:
                listaRutasImagenesCarrusel = Utilidades.createStringList("src/launcheruniversae/img/PageCarruselGame/", "Helicoptero", ".png", 4);
                labelTitulo.setText("Señalización a helicoptero desde tierra");
                txtDescripcion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \n" + "\n"
                        + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
                break;
            case 6:
                listaRutasImagenesCarrusel = Utilidades.createStringList("src/launcheruniversae/img/PageCarruselGame/", "Ascensor", ".png", 4);
                labelTitulo.setText("Rescate en ascensor");
                txtDescripcion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \n" + "\n"
                        + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
                break;
            default:
                listaRutasImagenesCarrusel = new ArrayList<>();
                break;
        }
    }

    private void rellenarBola(int pos) {
        for (int i = 0; i < listaLabelBolas.size(); i++) {
            if (pos == i) {
                Utilidades.setLabelImage(listaLabelBolas.get(i), "src/launcheruniversae/img/PageCarruselGame/PuntoCarruselFilled.png", true);
            } else {
                Utilidades.setLabelImage(listaLabelBolas.get(i), "src/launcheruniversae/img/PageCarruselGame/PuntoCarruselEmpty.png", true);
            }
        }
    }

    private ArrayList<JLabel> createLabelListExistentes(JLabel... labels) {
        ArrayList<JLabel> list = new ArrayList<>();
        for (JLabel label : labels) {
            list.add(label);
        }
        return list;
    }

    private void iniciarCarruselAutomatico() {
        int delay = 3000;
        timer = new javax.swing.Timer(delay, e -> {
            if (this.isShowing()) {
                pos++;
                actualizarCarrusel();
            } else {
                ((javax.swing.Timer) e.getSource()).stop();
            }
        });
        timer.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelIndiceImagenes;
    private javax.swing.JLabel botonDerechaCarrusel;
    private javax.swing.JLabel botonIzquierdaCarrusel;
    private javax.swing.JPanel contenedorEmbDesembHelic;
    private javax.swing.JLabel imgBolaCarrusel0;
    private javax.swing.JLabel imgBolaCarrusel1;
    private javax.swing.JLabel imgBolaCarrusel2;
    private javax.swing.JLabel imgBolaCarrusel3;
    private javax.swing.JLabel imgBolaCarrusel4;
    private javax.swing.JLabel imgCarruselFondoDerecha;
    private javax.swing.JLabel imgCarruselFondoIzquierda;
    private javax.swing.JLabel imgComenzar;
    private javax.swing.JLabel imgMainCarrusel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
