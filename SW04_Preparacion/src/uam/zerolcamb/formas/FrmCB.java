/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uam.zerolcamb.formas;

import java.util.LinkedList;
import javax.swing.JCheckBox;
import uam.zerolcamb.operaciones.OperacionesCheckBox;

/**
 *
 * @author Zerol
 */
public class FrmCB extends javax.swing.JFrame {
    /* Los checkboxes se guardan en una lista, esta puede ser tanto ArrayList
       asi como linkedlist, en el caso de esta implementación se realizo con
       linkedlist, pero la implementación con arraylist es exactamente la misma
    */
    LinkedList<JCheckBox> listaCBLenguajes = new LinkedList<>();
    /**
     * Creates new form FrmCB
     */
    public FrmCB() {
        initComponents();
        /* Se agrupan los checkboxes al inicializar la interfaz */
        agruparCheckBoxesLenguajes();
        /* Se oculta el textfield otro lenguaje utilizando .setVisible(false) */
        txtOtroLenguaje.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbC = new javax.swing.JCheckBox();
        cbCPP = new javax.swing.JCheckBox();
        cbJava = new javax.swing.JCheckBox();
        cbOtro = new javax.swing.JCheckBox();
        lblLenguajes = new javax.swing.JLabel();
        lblIdiomas = new javax.swing.JLabel();
        cbIngles = new javax.swing.JCheckBox();
        cbFrances = new javax.swing.JCheckBox();
        cbAleman = new javax.swing.JCheckBox();
        lblPreferencias = new javax.swing.JLabel();
        btnRegistar = new javax.swing.JButton();
        txtOtroLenguaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check Boxes");
        setResizable(false);

        cbC.setText("C");

        cbCPP.setText("C++");

        cbJava.setText("Java");

        cbOtro.setText("Otro");
        cbOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOtroActionPerformed(evt);
            }
        });

        lblLenguajes.setText("Lenguajes");

        lblIdiomas.setText("Idiomas");

        cbIngles.setText("Inglés");

        cbFrances.setText("Francés");

        cbAleman.setText("Alemán");

        lblPreferencias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPreferencias.setText("Preferencias de cursos");

        btnRegistar.setText("Registrar");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLenguajes)
                            .addComponent(cbC)
                            .addComponent(cbCPP)
                            .addComponent(cbJava)
                            .addComponent(cbOtro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdiomas)
                            .addComponent(cbIngles)
                            .addComponent(cbFrances)
                            .addComponent(cbAleman))
                        .addGap(191, 191, 191))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPreferencias)
                            .addComponent(txtOtroLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblPreferencias)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLenguajes)
                    .addComponent(lblIdiomas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbC)
                    .addComponent(cbIngles))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCPP)
                    .addComponent(cbFrances))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJava)
                    .addComponent(cbAleman))
                .addGap(18, 18, 18)
                .addComponent(cbOtro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOtroLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btnRegistar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        /* Si se clickea en el botón registrar, entonces se recuperaran los
           lenguajes seleccionados desde la lista de checkboxes
        */
        OperacionesCheckBox operacionesCheckBox = new OperacionesCheckBox();
        LinkedList<String> lenguajes;
        /* Se llama al metodo para obtener los cursos seleccionados en la lista
           de checkboxes
        */
        lenguajes = operacionesCheckBox.obtenerCursosLenguajes(listaCBLenguajes);
        System.out.println(txtOtroLenguaje.getText());
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void cbOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOtroActionPerformed
        /* Cuando el checkbox de "otro" este seleccionado, el textfield que
           corresponde a otro lenguaje sera visible
        */
        txtOtroLenguaje.setText("");
        txtOtroLenguaje.setVisible(cbOtro.isSelected());
        /* Se tiene que refrescar la pantalla entera para poder observar
           este cambio
        */
        setVisible(true);
    }//GEN-LAST:event_cbOtroActionPerformed

    /**
     * @param args the command line arguments
     */
    public void agruparCheckBoxesLenguajes(){
        /* Se agrupan los checkboxes añadiendolos a una lista */
        listaCBLenguajes.add(cbC);
        listaCBLenguajes.add(cbCPP);
        listaCBLenguajes.add(cbJava);
        listaCBLenguajes.add(cbOtro);
    }
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
            java.util.logging.Logger.getLogger(FrmCB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistar;
    private javax.swing.JCheckBox cbAleman;
    private javax.swing.JCheckBox cbC;
    private javax.swing.JCheckBox cbCPP;
    private javax.swing.JCheckBox cbFrances;
    private javax.swing.JCheckBox cbIngles;
    private javax.swing.JCheckBox cbJava;
    private javax.swing.JCheckBox cbOtro;
    private javax.swing.JLabel lblIdiomas;
    private javax.swing.JLabel lblLenguajes;
    private javax.swing.JLabel lblPreferencias;
    private javax.swing.JTextField txtOtroLenguaje;
    // End of variables declaration//GEN-END:variables
}
