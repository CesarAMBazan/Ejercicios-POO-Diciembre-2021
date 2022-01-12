/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uam.zerolcamb.formas;

import java.util.ArrayList;
import uam.zerolcamb.operaciones.LlenadoListas;

/**
 *
 * @author Zerol
 */
public class FrmListasDependientes extends javax.swing.JFrame {

    /**
     * Creates new form FrmListasDependientes
     */
    public FrmListasDependientes() {
        initComponents();
        /* Al construir la interfaz tenemos que remover los items de nuestras
           dos listas/combobox
        */
        cmbOpcionBase.removeAllItems();
        cmbOpcionDependiente.removeAllItems();
        /* Llamamos al metodo llenarOpcionesBase() para llenar la lista/combobox base */
        llenarOpcionesBase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBase = new javax.swing.JLabel();
        cmbOpcionBase = new javax.swing.JComboBox<>();
        lblDependiente = new javax.swing.JLabel();
        cmbOpcionDependiente = new javax.swing.JComboBox<>();
        btnRegistar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBase.setText("Opción base");

        cmbOpcionBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOpcionBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOpcionBaseActionPerformed(evt);
            }
        });

        lblDependiente.setText("Opción dependiente");

        cmbOpcionDependiente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistar.setText("Registrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblBase)
                        .addComponent(cmbOpcionBase, 0, 300, Short.MAX_VALUE)
                        .addComponent(lblDependiente)
                        .addComponent(cmbOpcionDependiente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnRegistar))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblBase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbOpcionBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDependiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbOpcionDependiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistar)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOpcionBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOpcionBaseActionPerformed
        /* Si la opción de la lista base seleccionada es diferente de 0, se mostrara
           la lista dependiente
        */
        if(cmbOpcionBase.getSelectedIndex() != 0) mostrarTrasSeleccion();
        else{
            /* Si no, se ocultara */
            ocultarElementos();
        }
    }//GEN-LAST:event_cmbOpcionBaseActionPerformed

    /**
     * @param args the command line arguments
     */
    private void ocultarElementos(){
        /* Se ocultaran elementos utilizando el metodo setVisible(false) */
        lblDependiente.setVisible(false);
        cmbOpcionDependiente.setVisible(false);
        btnRegistar.setVisible(false);
    }
    private void mostrarTrasSeleccion(){
        /* Mostrar tras selección construira la lista dependiente a partir
           de la opcion e indice seleccionado de la lista base
        */
        String opcion = "";
        int indiceSeleccionado;
        
        opcion = (String)cmbOpcionBase.getSelectedItem();
        indiceSeleccionado = cmbOpcionBase.getSelectedIndex();
        System.out.println(opcion + " " + indiceSeleccionado);
        
        LlenadoListas listas = new LlenadoListas();
        
        /* Se obtiene un Arraylist de Strings a partir de la clase LlenadoListas
           y su metodo llenarListaDependiente
        */
        ArrayList<String> listaDep = listas.llenarListaDependiente(indiceSeleccionado);
        
        /* Se limpia la lista dependiente */
        cmbOpcionDependiente.removeAllItems();
        for (String string : listaDep) {
            /* Se añaden a la lista dependiente opciones a partir de la lista base */
            cmbOpcionDependiente.addItem(string);
        }
        /* Se muestran los componentes antes ocultos */
        lblDependiente.setVisible(true);
        cmbOpcionDependiente.setVisible(true);
        btnRegistar.setVisible(true);
    }
    private void llenarOpcionesBase(){
        /* Este metodo llena la lista/combobox base */
        LlenadoListas llenadoListas = new LlenadoListas();
        ArrayList<String> lista = llenadoListas.llenarListaSencilla();
        for (String string : lista) {
            cmbOpcionBase.addItem(string);
        }
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
            java.util.logging.Logger.getLogger(FrmListasDependientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListasDependientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListasDependientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListasDependientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListasDependientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistar;
    private javax.swing.JComboBox<String> cmbOpcionBase;
    private javax.swing.JComboBox<String> cmbOpcionDependiente;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblDependiente;
    // End of variables declaration//GEN-END:variables
}
