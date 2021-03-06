/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon_PC
 */
public class EditarCte extends javax.swing.JFrame {

    Conexion conex;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public EditarCte() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdCte = new javax.swing.JTextField();
        txtNombreCte = new javax.swing.JTextField();
        txtCorreoCte = new javax.swing.JTextField();
        txtGeneroCte = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("EDITAR CLIENTE");

        jLabel2.setText("INGRESE DNI");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("ID CLIENTE");

        jLabel4.setText("NOMBRE CLIENTE");

        jLabel5.setText("GENERO CLIENTE");

        jLabel6.setText("CORREO CLIENTE");

        txtIdCte.setEnabled(false);

        txtNombreCte.setEnabled(false);

        txtCorreoCte.setEnabled(false);

        txtGeneroCte.setEnabled(false);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar.png"))); // NOI18N
        btnEdit.setText("MODIFICAR CLIENTE");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar.png"))); // NOI18N
        btnBack.setText("Ir al Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEdit)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGeneroCte, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreCte, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreoCte, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar))
                                    .addComponent(txtIdCte, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(txtCorreoCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneroCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnBack))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean buscar() {
        boolean encontrado = false;
        try {
            conex = new Conexion();
            con = conex.getConnection();
            ps = con.prepareStatement("SELECT * FROM clientes WHERE dniCte=?");
            ps.setString(1, txtDni.getText().trim());
            rs = ps.executeQuery();
            while (rs.next()) {
                if (txtDni.getText().trim().compareTo(rs.getString("dniCte")) == 0) {
                    txtNombreCte.setText(rs.getString("nombreCte"));
                    txtGeneroCte.setText(rs.getString("generoCte"));
                    txtIdCte.setText(String.valueOf(rs.getInt("idCte")));
                    txtCorreoCte.setText(rs.getString("correoCte"));
                    encontrado = true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return encontrado;
    }

    private boolean verificarCampo() {
        boolean encontrado = true;
        if (txtDni.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el campo obligatorio", "Mensaje", 0);
            encontrado = false;
        }
        return encontrado;
    }

    private void limpiarAll() {
        txtDni.setText("");
        txtNombreCte.setText("");
        txtIdCte.setText("");
        txtGeneroCte.setText("");
        txtCorreoCte.setText("");
        txtDni.requestFocus();
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (verificarCampo()) {
            if (buscar()) {
                txtNombreCte.enable();
                txtCorreoCte.enable();
                txtGeneroCte.enable();
                txtIdCte.enable();
                JOptionPane.showMessageDialog(null, "Cliente " + txtNombreCte.getText().trim() + " Encontrado", "Mensaje", 1);
                txtDni.disable();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado", "Mensaje", 0);
                limpiarAll();
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    private boolean verificarOther() {
        boolean encontrado = true;
        if (txtIdCte.getText().trim().equals("") && txtNombreCte.getText().trim().equals("")
                && txtCorreoCte.getText().trim().equals("") && txtGeneroCte.getText().trim().equals("")) {
            encontrado = false;
        }
        return encontrado;
    }

    private void editarCte() {
        try {
            ps = con.prepareStatement("UPDATE clientes SET idCte =?,nombreCte=?,correoCte=?,generoCte=? WHERE dniCte=?");
            ps.setInt(1, Integer.parseInt(txtIdCte.getText().trim()));
            ps.setString(2, txtNombreCte.getText().trim());
            ps.setString(3, txtCorreoCte.getText().trim());
            ps.setString(4, txtGeneroCte.getText().trim());
            ps.setString(5, txtDni.getText().trim());

            int r = ps.executeUpdate();
            if (r > 0) {
                JOptionPane.showMessageDialog(null, "Cliente modificado correctamente", "Mensaje", 1);

            } else {
                JOptionPane.showMessageDialog(null, "Error al  modificar cliente", "Mensaje", 0);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (verificarOther()) {
            editarCte();
            limpiarAll();
            txtDni.enable();
            txtCorreoCte.disable();
            txtGeneroCte.disable();
            txtIdCte.disable();
            txtNombreCte.disable();
        } else {
            JOptionPane.showMessageDialog(null, "Sin datos no se puede modificar", "Mensaje", 0);
            limpiarAll();

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new ModificarAdmin().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCorreoCte;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtGeneroCte;
    private javax.swing.JTextField txtIdCte;
    private javax.swing.JTextField txtNombreCte;
    // End of variables declaration//GEN-END:variables
}
