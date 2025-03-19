package launcheruniversae;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import utilidades.Utilidades;

/**
 *
 * @author Víctor Arroyo
 */
public class Page1 extends javax.swing.JPanel {

    public Page1() {
        initComponents();
        agregarImagenesPage1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorP1 = new javax.swing.JPanel();
        ico1 = new javax.swing.JLabel();
        ico2 = new javax.swing.JLabel();
        ico3 = new javax.swing.JLabel();
        ico4 = new javax.swing.JLabel();
        ico5 = new javax.swing.JLabel();
        ico6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1550, 870));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1550, 870));

        contenedorP1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contenedorP1.setMaximumSize(new java.awt.Dimension(1430, 730));
        contenedorP1.setMinimumSize(new java.awt.Dimension(1430, 730));
        contenedorP1.setOpaque(false);
        contenedorP1.setPreferredSize(new java.awt.Dimension(1430, 730));
        contenedorP1.setLayout(new java.awt.GridLayout(2, 3, 120, 160));

        ico1.setBackground(new java.awt.Color(10, 38, 72));
        ico1.setBorder(new javax.swing.border.MatteBorder(null));
        ico1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ico1.setPreferredSize(new java.awt.Dimension(200, 200));
        contenedorP1.add(ico1);

        ico2.setBackground(new java.awt.Color(10, 38, 72));
        ico2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico2.setBorder(new javax.swing.border.MatteBorder(null));
        ico2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ico2.setFocusCycleRoot(true);
        ico2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ico2.setPreferredSize(new java.awt.Dimension(200, 200));
        contenedorP1.add(ico2);

        ico3.setBackground(new java.awt.Color(10, 38, 72));
        ico3.setBorder(new javax.swing.border.MatteBorder(null));
        ico3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ico3.setPreferredSize(new java.awt.Dimension(200, 200));
        contenedorP1.add(ico3);

        ico4.setBackground(new java.awt.Color(10, 38, 72));
        ico4.setBorder(new javax.swing.border.MatteBorder(null));
        ico4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ico4.setPreferredSize(new java.awt.Dimension(200, 200));
        contenedorP1.add(ico4);

        ico5.setBackground(new java.awt.Color(10, 38, 72));
        ico5.setBorder(new javax.swing.border.MatteBorder(null));
        ico5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ico5.setPreferredSize(new java.awt.Dimension(200, 200));
        contenedorP1.add(ico5);

        ico6.setBackground(new java.awt.Color(10, 38, 72));
        ico6.setBorder(new javax.swing.border.MatteBorder(null));
        ico6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ico6.setPreferredSize(new java.awt.Dimension(200, 200));
        ico6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ico6AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        contenedorP1.add(ico6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorP1, javax.swing.GroupLayout.DEFAULT_SIZE, 1550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorP1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ico6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ico6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ico6AncestorAdded

    private void agregarImagenesPage1() {
        Utilidades.setLabelImage(ico1, "src/launcheruniversae/img/page1/Grado0.png", true);
        Utilidades.addHoverEffect(ico1, "src/launcheruniversae/img/page1/Grado0.png");
        Utilidades.setLabelImage(ico2, "src/launcheruniversae/img/page1/Grado1.png", true);
        Utilidades.addHoverEffect(ico2, "src/launcheruniversae/img/page1/Grado1.png");
        Utilidades.setLabelImage(ico3, "src/launcheruniversae/img/page1/Grado2.png", true);
        Utilidades.addHoverEffect(ico3, "src/launcheruniversae/img/page1/Grado2.png");
        Utilidades.setLabelImage(ico4, "src/launcheruniversae/img/page1/Grado3.png", true);
        Utilidades.addHoverEffect(ico4, "src/launcheruniversae/img/page1/Grado3.png");
        Utilidades.setLabelImage(ico5, "src/launcheruniversae/img/page1/Grado4.png", true);
        Utilidades.addHoverEffect(ico5, "src/launcheruniversae/img/page1/Grado4.png");
        Utilidades.setLabelImage(ico6, "src/launcheruniversae/img/page1/Grado5.png", true);
        Utilidades.addHoverEffect(ico6, "src/launcheruniversae/img/page1/Grado5.png");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorP1;
    private javax.swing.JLabel ico1;
    private javax.swing.JLabel ico2;
    private javax.swing.JLabel ico3;
    private javax.swing.JLabel ico4;
    private javax.swing.JLabel ico5;
    private javax.swing.JLabel ico6;
    // End of variables declaration//GEN-END:variables
}
