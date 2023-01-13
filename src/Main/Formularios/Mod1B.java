/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main.Formularios;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import Main.DAO.IEmpresaImpl;
import Main.Modelos.Empresa;
import static Main.Formularios.Dashboard2.content;
import java.sql.Connection;
import Main.DAO.BaseDatos;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;


/**
 *
 * @author Alice Sugar
 */
public class Mod1B extends javax.swing.JPanel {
    Connection BaseDatos;
    Connection conn;
    public Mod1B() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        tphone = new javax.swing.JTextField();
        trif = new javax.swing.JTextField();
        tcity = new javax.swing.JTextField();
        tsurcursal = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        tdirect = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        tbuscar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tbuscador = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel1.setText("Modificar Cliente");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, 20));

        jLabel2.setText("Empresa");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        tname.setForeground(new java.awt.Color(102, 102, 102));
        tname.setBorder(null);
        tname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tnameMousePressed(evt);
            }
        });
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 260, 30));

        tphone.setForeground(new java.awt.Color(102, 102, 102));
        tphone.setBorder(null);
        tphone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tphoneMousePressed(evt);
            }
        });
        tphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tphoneActionPerformed(evt);
            }
        });
        add(tphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 260, 30));

        trif.setForeground(new java.awt.Color(102, 102, 102));
        trif.setBorder(null);
        trif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                trifMousePressed(evt);
            }
        });
        trif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trifActionPerformed(evt);
            }
        });
        add(trif, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 260, 30));

        tcity.setForeground(new java.awt.Color(102, 102, 102));
        tcity.setBorder(null);
        tcity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tcityMousePressed(evt);
            }
        });
        tcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcityActionPerformed(evt);
            }
        });
        add(tcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 260, 30));

        tsurcursal.setForeground(new java.awt.Color(102, 102, 102));
        tsurcursal.setBorder(null);
        tsurcursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tsurcursalMousePressed(evt);
            }
        });
        tsurcursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsurcursalActionPerformed(evt);
            }
        });
        add(tsurcursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 260, 30));

        temail.setForeground(new java.awt.Color(102, 102, 102));
        temail.setBorder(null);
        temail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                temailMousePressed(evt);
            }
        });
        temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temailActionPerformed(evt);
            }
        });
        add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 260, 30));

        tdirect.setForeground(new java.awt.Color(102, 102, 102));
        tdirect.setToolTipText("");
        tdirect.setBorder(null);
        tdirect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tdirectMousePressed(evt);
            }
        });
        tdirect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdirectActionPerformed(evt);
            }
        });
        add(tdirect, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 260, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 560, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 260, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 260, 10));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 10, 400));

        jLabel4.setText("RIF");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 20, -1));

        jLabel5.setText("Ciudad");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel6.setText("Sucursal");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 260, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 260, 10));

        jLabel7.setText("Email");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel8.setText("Direccion");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 260, 10));

        jLabel12.setText("Telefono");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 260, 10));

        jLabel13.setText("Numero de Cliente a Buscar");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        tbuscar.setBackground(new java.awt.Color(51, 102, 255));
        tbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbuscarMouseReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Buscar");

        javax.swing.GroupLayout tbuscarLayout = new javax.swing.GroupLayout(tbuscar);
        tbuscar.setLayout(tbuscarLayout);
        tbuscarLayout.setHorizontalGroup(
            tbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbuscarLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(21, 21, 21))
        );
        tbuscarLayout.setVerticalGroup(
            tbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(tbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 100, 40));

        tbuscador.setBorder(null);
        add(tbuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 560, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    private void tnameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tnameMousePressed

        // TODO add your handling code here:
    }//GEN-LAST:event_tnameMousePressed

    private void trifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trifActionPerformed

    private void trifMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trifMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_trifMousePressed

    private void tcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcityActionPerformed

    private void tcityMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcityMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcityMousePressed

    private void temailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temailActionPerformed

    private void temailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_temailMousePressed

    private void tsurcursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsurcursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsurcursalActionPerformed

    private void tsurcursalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tsurcursalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsurcursalMousePressed

    private void tphoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tphoneMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tphoneMousePressed

    private void tphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tphoneActionPerformed
        if(tphone.getText().equals("Ingrese la Empresa"))
        tphone.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_tphoneActionPerformed

    private void tbuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbuscarMouseReleased
    IEmpresaImpl ie = new IEmpresaImpl();
    Empresa e = ie.listarEmpresa(tbuscador.getText());
    trif.setText(e.getRif());
    tname.setText(e.getEmpresa());
    tphone.setText(e.getTelefono());
    tcity.setText(e.getCiudad());
    tsurcursal.setText(e.getSucursal());
    tdirect.setText(e.getDirect());
    temail.setText(e.getEmail());


         // TODO add your handling code here:
    }//GEN-LAST:event_tbuscarMouseReleased

    private void tdirectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdirectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdirectActionPerformed

    private void tdirectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdirectMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdirectMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField tbuscador;
    private javax.swing.JPanel tbuscar;
    private javax.swing.JTextField tcity;
    private javax.swing.JTextField tdirect;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tphone;
    private javax.swing.JTextField trif;
    private javax.swing.JTextField tsurcursal;
    // End of variables declaration//GEN-END:variables
}
