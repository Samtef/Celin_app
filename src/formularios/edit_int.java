/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formularios;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Color;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import javax.swing.WindowConstants;

    
public class edit_int extends javax.swing.JFrame {
    
    
    public String id;

    DefaultTableModel model;
    //private Object e;
    //private Object cn;
    //private Object label_cedula_del_cliente_e;
    //private Object n;
    public edit_int() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        jPanel1.setBackground(new Color(152,204,153));
        jPanel2.setBackground(Color.LIGHT_GRAY);
        bloquiarb();
        cargar("");
    }

    void cargar (String valor){
    String [] titulos = {"Nombre","Apellidos","Procedencia","Codigo Matricula","Nro. Carnet","Correo","Situación"};  
    String [] registros = new String[10];
    
    String sql = "SELECT * FROM integrantes where CONCAT (nom_int,' ',ape_int) LIKE '%"+valor+"%'";
    
    model = new DefaultTableModel(null,titulos);
    conectar cc=new conectar();
    Connection cn = cc.conexion();
    
        try {
           Statement st = cn.createStatement();
           ResultSet rs= st.executeQuery(sql);
           
           while(rs.next()){
               registros[0]=rs.getString("cod_int");
               registros[1]=rs.getString("nom_int");
               registros[2]=rs.getString("ape_int");
               registros[3]=rs.getString("pro_int");
               registros[4]=rs.getString("mac_int");
               registros[5]=rs.getString("car_int");
               registros[6]=rs.getString("e_int");
               registros[7]=rs.getString("sic_int");
               
               model.addRow(registros);
           }
           t_datos.setModel(model);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }   
        
    }
    
     
    
    
   void limpiar () {
        t_nom.setText("");
        t_ape.setText("");
        t_pro.setText("");
        t_mac.setText("");
        t_car.setText("");
        t_e.setText("");
       
        t_cod.setText("");
    }
   
   
   void limpiarb (){
       aux.setText("");
   }
   
   
   void bloquiarb (){
       t_cod.setEditable(false);
   }
   
   
   void bloquear () {
        t_nom.setEnabled(false);
        t_ape.setEnabled(false);
        t_pro.setEnabled(false);
        t_mac.setEnabled(false);
        t_car.setEnabled(false);
        t_e.setEnabled(false);
     
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_nom = new javax.swing.JTextField();
        t_ape = new javax.swing.JTextField();
        t_pro = new javax.swing.JTextField();
        t_mac = new javax.swing.JTextField();
        t_car = new javax.swing.JTextField();
        t_e = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        aux = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        t_cod = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        sic = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nonbre:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Procedencia:");

        jLabel4.setText("Codigo Mactricula:");

        jLabel5.setText("Nro Carnet:");

        jLabel6.setText("Email:");

        jLabel7.setText("Situación:");

        t_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nomActionPerformed(evt);
            }
        });
        t_nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_nomKeyTyped(evt);
            }
        });

        t_ape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_apeKeyTyped(evt);
            }
        });

        t_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_proActionPerformed(evt);
            }
        });

        t_mac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_macActionPerformed(evt);
            }
        });
        t_mac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_macKeyTyped(evt);
            }
        });

        t_e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_eKeyTyped(evt);
            }
        });

        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_datos);

        jButton1.setText("Mostar Todo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("BUSCAR:");

        aux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auxActionPerformed(evt);
            }
        });
        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auxKeyReleased(evt);
            }
        });

        jButton2.setText("Actualizar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        t_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_codActionPerformed(evt);
            }
        });

        jLabel12.setText("Codigo:");

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        sic.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pregrado", "Postgrado", "Egresado", "Profesor", "Externo" }));

        jLabel10.setFont(new java.awt.Font("Nanum Gothic", 0, 24)); // NOI18N
        jLabel10.setText("Editar datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_mac, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_car, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t_e, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(35, 35, 35)
                        .addComponent(sic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(t_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(t_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(t_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(t_mac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_car, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel7))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(aux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nomActionPerformed

    private void auxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auxActionPerformed

    private void auxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyReleased
    cargar (aux.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_auxKeyReleased

    private void t_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_datosMouseClicked
        // TODO add your handling code here:
        int fila = t_datos.rowAtPoint(evt.getPoint());
            if (fila > -1){
                //id = t_datos.getValueAt(fila, 0).toString();
                t_cod.setText(String.valueOf(t_datos.getValueAt(fila, 0)));
                t_nom.setText(String.valueOf(t_datos.getValueAt(fila, 1)));
                t_ape.setText(String.valueOf(t_datos.getValueAt(fila, 2)));
                t_pro.setText(String.valueOf(t_datos.getValueAt(fila,3)));
                t_mac.setText(String.valueOf(t_datos.getValueAt(fila,4)));
                t_car.setText(String.valueOf(t_datos.getValueAt(fila, 5)));
                t_e.setText(String.valueOf(t_datos.getValueAt(fila, 6)));
                sic.setSelectedItem(String.valueOf(t_datos.getValueAt(fila, 7)));
                
            }
    }//GEN-LAST:event_t_datosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            conectar cc=new conectar ();
            Connection c = cc.conexion();
            
      try {
          PreparedStatement pst = c.prepareStatement("UPDATE integrantes SET nom_int='"+t_nom.getText()+"',ape_int='"+t_ape.getText()+"',pro_int='"+t_pro.getText()+"',mac_int='"+t_mac.getText()+"',car_int='"+t_car.getText()+"',e_int='"+t_e.getText()+"',sic_int='"+sic.getSelectedItem().toString()+ "'WHERE cod_fz='"+t_cod.getText()+"'");                 
          pst.executeUpdate();
          cargar("");
      } catch (SQLException x) {
        System.out.print(x.getMessage());
        
    }  
        
        
        
        
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiarb();
        cargar("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t_nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nomKeyTyped
        // TODO add your handling code here:
       //   char c= evt.getKeyChar();
          // if ((c < 'a' || c>'z') && (c < 'A' || c>'Z'))evt.consume();
         
    }//GEN-LAST:event_t_nomKeyTyped

    private void t_apeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_apeKeyTyped
        // TODO add your handling code here:
        //  char c= evt.getKeyChar();
         // if ((c < 'a' || c>'z') && (c < 'A' || c>'Z'))evt.consume();
         
    }//GEN-LAST:event_t_apeKeyTyped

    private void t_eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_eKeyTyped
        // TODO add your handling code here:
        char c= evt.getKeyChar();
         if (c < '0' || c>'9')evt.consume(); 
         RestrictedTextField restricted = new RestrictedTextField(t_e);
         restricted.setLimit(8);// TODO add your handling code here:
    }//GEN-LAST:event_t_eKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         
            conectar cc = new conectar();
            Connection nn = cc.conexion();
                     
           try {
            
                PreparedStatement pst = nn.prepareStatement("DELETE FROM  integrantes WHERE cod_int='"+t_cod.getText()+"'");
                 int x =pst.executeUpdate();
                if (x==1){
                JOptionPane.showMessageDialog(this, "Registro Eliminado","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                cargar("");
                }else{
                JOptionPane.showMessageDialog(this, "Error no se Elimino","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                limpiar();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void t_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_codActionPerformed

    private void t_macKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_macKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c>'9')evt.consume();
        RestrictedTextField restricted = new RestrictedTextField(t_mac);
         restricted.setLimit(8);
// TODO add your handling code here:
        
    }//GEN-LAST:event_t_macKeyTyped

    private void t_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_proActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_proActionPerformed

    private void t_macActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_macActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_macActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(edit_int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_int().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aux;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox sic;
    private javax.swing.JTextField t_ape;
    private javax.swing.JTextField t_car;
    private javax.swing.JTextField t_cod;
    private javax.swing.JTable t_datos;
    private javax.swing.JTextField t_e;
    private javax.swing.JTextField t_mac;
    private javax.swing.JTextField t_nom;
    private javax.swing.JTextField t_pro;
    // End of variables declaration//GEN-END:variables

    

}
