/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Conexion;
import Clases.Loguear;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Simon_PC
 */
public class ModificarAdmin extends javax.swing.JFrame {

    private PreparedStatement ps;
    private ResultSet rs;
    private Conexion conex;
    private Connection con;
    private LoginFrom lf;
    private Loguear loger;
    private DefaultTableModel dt;

    /**
     * Creates new form AdminFrom
     */
    public ModificarAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAddStock = new javax.swing.JButton();
        btnBorrarPro = new javax.swing.JButton();
        btnEditPro = new javax.swing.JButton();
        btnRegistrarPro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnRegistrarCte = new javax.swing.JButton();
        btnBorrarCte = new javax.swing.JButton();
        btnModificarCte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones de Administrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("WRESTLEMANIA", 2, 36))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("WRESTLEMANIA", 2, 24))); // NOI18N

        btnAddStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar.png"))); // NOI18N
        btnAddStock.setText("Aumentar Stock");
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
            }
        });

        btnBorrarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Borrar.png"))); // NOI18N
        btnBorrarPro.setText("Borrar Producto");
        btnBorrarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarProActionPerformed(evt);
            }
        });

        btnEditPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar.png"))); // NOI18N
        btnEditPro.setText("Modificar Producto");
        btnEditPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProActionPerformed(evt);
            }
        });

        btnRegistrarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Registrar.png"))); // NOI18N
        btnRegistrarPro.setText("Registrar Producto");
        btnRegistrarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarPro, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(btnBorrarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAddStock)
                .addGap(18, 18, 18)
                .addComponent(btnEditPro)
                .addGap(18, 18, 18)
                .addComponent(btnBorrarPro)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("WRESTLEMANIA", 2, 24))); // NOI18N

        btnRegistrarCte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cliente.png"))); // NOI18N
        btnRegistrarCte.setText("Registrar Cliente");
        btnRegistrarCte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCteActionPerformed(evt);
            }
        });

        btnBorrarCte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Limpiar.png"))); // NOI18N
        btnBorrarCte.setText("Borrar Cliente");
        btnBorrarCte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCteActionPerformed(evt);
            }
        });

        btnModificarCte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar.png"))); // NOI18N
        btnModificarCte.setText("Editar Cliente");
        btnModificarCte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarCte, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnBorrarCte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarCte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrarCte, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorrarCte)
                .addGap(18, 18, 18)
                .addComponent(btnModificarCte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Exit.png"))); // NOI18N
        btnSalir.setText("Salir del Programa");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por usar la aplicacion","Saliendo del Programa",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarCteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCteActionPerformed
        this.dispose();
        new RegistrarCliente().setVisible(true);
    }//GEN-LAST:event_btnRegistrarCteActionPerformed

    private void btnRegistrarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProActionPerformed
        this.dispose();
        new RegistrarProducto().setVisible(true);
    }//GEN-LAST:event_btnRegistrarProActionPerformed

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
        this.dispose();
        new ActualizarStock().setVisible(true);
    }//GEN-LAST:event_btnAddStockActionPerformed

    private void btnBorrarCteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCteActionPerformed
        this.dispose();
        new BorrarCte().setVisible(true);
    }//GEN-LAST:event_btnBorrarCteActionPerformed

    private void btnModificarCteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCteActionPerformed
       this.dispose();
       new EditarCte().setVisible(true);
    }//GEN-LAST:event_btnModificarCteActionPerformed

    private void btnEditProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProActionPerformed
        this.dispose();
        new EditPro().setVisible(true);
    }//GEN-LAST:event_btnEditProActionPerformed

    private void btnBorrarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarProActionPerformed
        this.dispose();
        new BorrarPro().setVisible(true);
    }//GEN-LAST:event_btnBorrarProActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnBorrarCte;
    private javax.swing.JButton btnBorrarPro;
    private javax.swing.JButton btnEditPro;
    private javax.swing.JButton btnModificarCte;
    private javax.swing.JButton btnRegistrarCte;
    private javax.swing.JButton btnRegistrarPro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
