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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Simon_PC
 */
public class RegistrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCliente
     */
    PreparedStatement ps;
    ResultSet rs;
    Conexion conex;
    Connection con;
    DefaultTableModel df;
    public RegistrarCliente() {
        initComponents();
        listar();
        setLocationRelativeTo(null);
    }
    private DefaultTableModel setTitulos(){
        df = new DefaultTableModel();
        df.addColumn("Nombre del Cliente");
        df.addColumn("Dni del Cliente");
        df.addColumn("Email del Cliente");
        df.addColumn("Genero del Cliente");
        return df;
    }
    private DefaultTableModel getDatos(){
        String consulta = "SELECT * FROM clientes";
        con = null;
        conex = new Conexion();
        try 
        {
            setTitulos();
            con = conex.getConnection();
          ps = con.prepareStatement(consulta);
          rs = ps.executeQuery();
          Object obj[] = new Object[4];
            while (rs.next()) 
            {                
                obj[0] = rs.getString("nombreCte");
                obj[1] = rs.getString("dniCte");
                obj[2] = rs.getString("correoCte");
                obj[3] = rs.getString("generoCte");
                df.addRow(obj);
            }
        } catch (Exception e) {
        }
        return df;
    }
    private void listar()
    {
      jtableData.setModel(getDatos());
    }
    private boolean verificarCampos()
    {
        boolean encontrado = true;
        if(txtNombreCte.getText().trim().equals("") || txtDniCte.getText().trim().equals("") || txtEmailCte.getText().trim().equals("") || cbxGenero.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Complete los campos faltantes","Registro Cliente",JOptionPane.INFORMATION_MESSAGE);
           encontrado = false;
        }        
        return encontrado;
    }
    private void limpiarRegistros(){
        txtNombreCte.setText(null);
        txtDniCte.setText(null);
        txtEmailCte.setText(null);
        cbxGenero.setSelectedIndex(0);
        txtNombreCte.requestFocus();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCte = new javax.swing.JTextField();
        txtDniCte = new javax.swing.JTextField();
        txtEmailCte = new javax.swing.JTextField();
        cbxGenero = new javax.swing.JComboBox<>();
        btnRegistrarCte = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("WRESTLEMANIA", 2, 24))); // NOI18N

        jLabel1.setText("Nombre");

        jLabel2.setText("Dni");

        jLabel3.setText("Email");

        jLabel4.setText("Genero");

        txtNombreCte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCteKeyTyped(evt);
            }
        });

        txtDniCte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniCteKeyTyped(evt);
            }
        });

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino" }));

        btnRegistrarCte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Registrar.png"))); // NOI18N
        btnRegistrarCte.setText("Registrar Cliente");
        btnRegistrarCte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailCte, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDniCte, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCte, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarCte))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDniCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmailCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarCte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar.png"))); // NOI18N
        btnReturn.setText("Volver");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes Registrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("WRESTLEMANIA", 2, 24))); // NOI18N

        jtableData.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtableData);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                        .addComponent(btnReturn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnReturn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCteActionPerformed
        String consulta = "INSERT INTO clientes (nombreCte, dniCte,correoCte,generoCte) VALUES (?,?,?,?)";
        if(verificarCampos())
        {
            try {
                ps = con.prepareStatement(consulta);
                ps.setString(1, txtNombreCte.getText().trim());
                ps.setString(2, txtDniCte.getText().trim());
                ps.setString(3, txtEmailCte.getText().trim());
                ps.setString(4, cbxGenero.getSelectedItem().toString());
                int r = ps.executeUpdate();
                if(r>0)
                {
                  JOptionPane.showMessageDialog(null,"Cliente registrado exitosamente","Registro",JOptionPane.INFORMATION_MESSAGE);
                  limpiarRegistros();
                  listar();
                }else{
                  JOptionPane.showMessageDialog(null,"Error al registrar Cliente","Registro",JOptionPane.ERROR_MESSAGE);
                  limpiarRegistros();
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnRegistrarCteActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
       this.dispose();
       new ModificarAdmin().setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtNombreCteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCteKeyTyped
       char caracter = evt.getKeyChar();
        if (caracter >= '0' && caracter <= '9') evt.consume();
    }//GEN-LAST:event_txtNombreCteKeyTyped

    private void txtDniCteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniCteKeyTyped
        char c = evt.getKeyChar();
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') 
            evt.consume();
    }//GEN-LAST:event_txtDniCteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarCte;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableData;
    private javax.swing.JTextField txtDniCte;
    private javax.swing.JTextField txtEmailCte;
    private javax.swing.JTextField txtNombreCte;
    // End of variables declaration//GEN-END:variables
}
