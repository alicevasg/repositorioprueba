/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main.Formularios;



import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import Main.DAO.IUsuarioImpl;
import Main.Modelos.Usuario;
import static Main.Formularios.Dashboard.content;


/**
 *
 * @author Alice Sugar
 */
public class Reg extends javax.swing.JPanel {

    public Reg() {
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
        tusername = new javax.swing.JTextField();
        tpassword = new javax.swing.JTextField();
        tnombre = new javax.swing.JTextField();
        tapellido = new javax.swing.JTextField();
        tprivilegios = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel1.setText("Registrar nuevo Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 50));

        jLabel2.setText("Contraseña");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        tusername.setForeground(new java.awt.Color(102, 102, 102));
        tusername.setToolTipText("");
        tusername.setBorder(null);
        tusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tusernameMousePressed(evt);
            }
        });
        tusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tusernameActionPerformed(evt);
            }
        });
        add(tusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 30));

        tpassword.setForeground(new java.awt.Color(102, 102, 102));
        tpassword.setBorder(null);
        tpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tpasswordMousePressed(evt);
            }
        });
        tpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpasswordActionPerformed(evt);
            }
        });
        add(tpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 260, 30));

        tnombre.setForeground(new java.awt.Color(102, 102, 102));
        tnombre.setBorder(null);
        tnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tnombreMousePressed(evt);
            }
        });
        tnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnombreActionPerformed(evt);
            }
        });
        add(tnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 260, 30));

        tapellido.setForeground(new java.awt.Color(102, 102, 102));
        tapellido.setBorder(null);
        tapellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tapellidoMousePressed(evt);
            }
        });
        tapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapellidoActionPerformed(evt);
            }
        });
        add(tapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 30));

        tprivilegios.setForeground(new java.awt.Color(102, 102, 102));
        tprivilegios.setBorder(null);
        tprivilegios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tprivilegiosMousePressed(evt);
            }
        });
        tprivilegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprivilegiosActionPerformed(evt);
            }
        });
        add(tprivilegios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 260, 30));

        jLabel3.setText("Usuario");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 260, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, 10));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 10, 460));

        jLabel4.setText("Apellido");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 210, 50));

        jLabel12.setText("Nombre");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 260, 10));

        jLabel5.setText("Numero de Privilegio");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel6.setText("Privilegio 1 Administrador del Sistema");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 220, 30));

        jLabel7.setText("Privilegio 2 Gerecia");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 100, -1));

        jLabel8.setText("Privilegio 3 Tenicos");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tusernameActionPerformed

    private void tusernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tusernameMousePressed

    }//GEN-LAST:event_tusernameMousePressed

    private void tpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpasswordActionPerformed

    private void tpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpasswordMousePressed

    }//GEN-LAST:event_tpasswordMousePressed

    private void tapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tapellidoActionPerformed

    private void tapellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tapellidoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tapellidoMousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        Usuario u = new Usuario(tusername.getText(), tpassword.getText(), tnombre.getText(), tapellido.getText(), tprivilegios.getText());
        IUsuarioImpl iu = new IUsuarioImpl();
        iu.agregarUsuario(u);
        JOptionPane.showMessageDialog(this, "Acción Completada");

        Menu p1 = new Menu();
        p1.setSize(790, 570);
        p1.setLocation(0,0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();


// TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void tnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tnombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnombreMousePressed

    private void tnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnombreActionPerformed
        if(tnombre.getText().equals("Ingrese la Empresa"))
        tnombre.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_tnombreActionPerformed

    private void tprivilegiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tprivilegiosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprivilegiosMousePressed

    private void tprivilegiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprivilegiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprivilegiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField tapellido;
    private javax.swing.JTextField tnombre;
    private javax.swing.JTextField tpassword;
    private javax.swing.JTextField tprivilegios;
    private javax.swing.JTextField tusername;
    // End of variables declaration//GEN-END:variables
}
