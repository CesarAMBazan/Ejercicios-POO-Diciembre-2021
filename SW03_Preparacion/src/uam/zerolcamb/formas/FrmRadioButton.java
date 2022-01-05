/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uam.zerolcamb.formas;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

/**
 *
 * @author Zerol
 */
public class FrmRadioButton extends javax.swing.JFrame {

    /**
     * Creates new form FrmRadioButton
     */
    public FrmRadioButton() {
        initComponents();
        asignarRadioButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroupEstadoCivil = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        rbCasado = new javax.swing.JRadioButton();
        rbSoltero = new javax.swing.JRadioButton();
        rbDivorciado = new javax.swing.JRadioButton();
        rbUnionLibre = new javax.swing.JRadioButton();
        rbHombre = new javax.swing.JRadioButton();
        rbMujer = new javax.swing.JRadioButton();
        rbMexicana = new javax.swing.JRadioButton();
        rbExtranjera = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RadioButton");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Encuesta");

        lblEstadoCivil.setText("Estado Civil");

        lblGenero.setText("Género");

        lblNacionalidad.setText("Nacionalidad");

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        rbCasado.setSelected(true);
        rbCasado.setText("Casado");

        rbSoltero.setText("Soltero");

        rbDivorciado.setText("Divorciado");

        rbUnionLibre.setText("Unión Libre");

        rbHombre.setText("Hombre");

        rbMujer.setText("Mujer");

        rbMexicana.setText("Mexicana");

        rbExtranjera.setText("Extranjera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnRegistrar)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbHombre)
                        .addGap(18, 18, 18)
                        .addComponent(rbMujer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbCasado)
                        .addGap(18, 18, 18)
                        .addComponent(rbSoltero)
                        .addGap(18, 18, 18)
                        .addComponent(rbDivorciado)
                        .addGap(18, 18, 18)
                        .addComponent(rbUnionLibre))
                    .addComponent(lblTitulo)
                    .addComponent(lblEstadoCivil)
                    .addComponent(lblGenero)
                    .addComponent(lblNacionalidad)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbMexicana)
                        .addGap(18, 18, 18)
                        .addComponent(rbExtranjera)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(54, 54, 54)
                .addComponent(lblEstadoCivil)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCasado)
                    .addComponent(rbSoltero)
                    .addComponent(rbDivorciado)
                    .addComponent(rbUnionLibre))
                .addGap(18, 18, 18)
                .addComponent(lblGenero)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbHombre)
                    .addComponent(rbMujer))
                .addGap(25, 25, 25)
                .addComponent(lblNacionalidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMexicana)
                    .addComponent(rbExtranjera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(BtnRegistrar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        String estadoCivil = seleccionarEstadoCivil();
        System.out.println("Estado civil: " + estadoCivil);
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public String seleccionarEstadoCivil(){
        /* Se obtiene un objeto de tipo Enumeration desde el bgroup */
        Enumeration<AbstractButton> btnGrp = bgroupEstadoCivil.getElements();
        String resultado = "";
        /* Mientras el buttongroup tenga más elementos */
        while(btnGrp.hasMoreElements()){
            /* Asignar el elemento a un JRadioButton auxiliar */
            JRadioButton btnAux = (JRadioButton) btnGrp.nextElement();
            /* Si ese boton está seleccionado */
            if(btnAux.isSelected()){
                resultado = btnAux.getText();
                break;
            }
        }
        return resultado;
    }
    public void asignarRadioButtons() {
        bgroupEstadoCivil.add(rbCasado);
        bgroupEstadoCivil.add(rbSoltero);
        bgroupEstadoCivil.add(rbDivorciado);
        bgroupEstadoCivil.add(rbUnionLibre);
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
            java.util.logging.Logger.getLogger(FrmRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRadioButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.ButtonGroup bgroupEstadoCivil;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbDivorciado;
    private javax.swing.JRadioButton rbExtranjera;
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JRadioButton rbMexicana;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.JRadioButton rbSoltero;
    private javax.swing.JRadioButton rbUnionLibre;
    // End of variables declaration//GEN-END:variables

    
}
