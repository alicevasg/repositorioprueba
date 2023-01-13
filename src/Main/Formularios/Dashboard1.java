/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main.Formularios;


import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alice Sugar
 */
public class Dashboard1 extends javax.swing.JFrame {

    /**
     * Creates new form Deshboard
     */
    public Dashboard1() {
        initComponents();
        
        Principal p1 = new Principal();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        fecha.setText("Hoy es "+dia+" de "+meses[month - 1]+" del "+year);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_princ = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_empress = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_reguser = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_tecno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_order = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_tecno1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(41, 119, 197));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_princ.setBackground(new java.awt.Color(180, 80, 100));
        btn_princ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_princMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_princMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_princMousePressed(evt);
            }
        });
        btn_princ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Icon/folder/Icons/menu.png"))); // NOI18N
        jLabel2.setText("MENU PRINCIPAL");
        btn_princ.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 30));

        Menu.add(btn_princ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, 70));

        btn_empress.setBackground(new java.awt.Color(51, 153, 255));
        btn_empress.setPreferredSize(new java.awt.Dimension(230, 50));
        btn_empress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_empressMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_empressMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_empressMousePressed(evt);
            }
        });
        btn_empress.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Icon/folder/Icons/groups_FILL0_wght400_GRAD200_opsz24.png"))); // NOI18N
        jLabel3.setText("EMPRESAS");
        btn_empress.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        Menu.add(btn_empress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, 70));

        btn_reguser.setBackground(new java.awt.Color(51, 153, 255));
        btn_reguser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reguserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reguserMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reguserMousePressed(evt);
            }
        });
        btn_reguser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Icon/folder/Icons/person_FILL0_wght400_GRAD200_opsz24.png"))); // NOI18N
        jLabel6.setText("USUARIOS");
        btn_reguser.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        Menu.add(btn_reguser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 230, 70));

        btn_tecno.setBackground(new java.awt.Color(51, 153, 255));
        btn_tecno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tecnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tecnoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tecnoMousePressed(evt);
            }
        });
        btn_tecno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Icon/folder/Icons/comprobacion-de-lista.png"))); // NOI18N
        jLabel1.setText("EMPLEADOS");
        btn_tecno.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 150, -1));

        Menu.add(btn_tecno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 230, 70));

        btn_order.setBackground(new java.awt.Color(51, 153, 255));
        btn_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_orderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_orderMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_orderMousePressed(evt);
            }
        });
        btn_order.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Icon/folder/Icons/person_FILL0_wght400_GRAD200_opsz24.png"))); // NOI18N
        jLabel7.setText(" ORDENES");
        btn_order.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        Menu.add(btn_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 230, 70));

        btn_tecno1.setBackground(new java.awt.Color(51, 153, 255));
        btn_tecno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tecno1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tecno1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tecno1MousePressed(evt);
            }
        });
        btn_tecno1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Icon/folder/Icons/comprobacion-de-lista.png"))); // NOI18N
        jLabel4.setText("REVISIONES");
        btn_tecno1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 140, -1));

        Menu.add(btn_tecno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 230, 70));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 740));

        Header.setBackground(new java.awt.Color(41, 119, 197));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy es Sábado 07 de Enero del 2022");
        Header.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 490, 68));

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 790, 170));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(750, 430));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 790, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_princMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_princMouseEntered
        if(btn_princ.getBackground().getRGB() == -15574355)
            setColor(btn_princ);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_princMouseEntered

    private void btn_princMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_princMouseExited
        if(btn_empress.getBackground().getRGB() != -15574355 || btn_reguser.getBackground().getRGB() != -15574355 || btn_tecno.getBackground().getRGB() != -15574355)
            resetColor(btn_princ);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_princMouseExited

    private void btn_princMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_princMousePressed
        setColor(btn_princ);
        resetColor(btn_empress);
        resetColor(btn_reguser);
        resetColor(btn_tecno);

        Principal p1 = new Principal();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_princMousePressed

    private void btn_empressMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empressMouseEntered
        if(btn_empress.getBackground().getRGB() == -15574355)
            setColor(btn_empress);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_empressMouseEntered

    private void btn_empressMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empressMouseExited
            if(btn_princ.getBackground().getRGB() != -15574355 || btn_reguser.getBackground().getRGB() != -15574355 || btn_tecno.getBackground().getRGB() != -15574355)
            resetColor(btn_empress);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_empressMouseExited

    private void btn_empressMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empressMousePressed
        setColor(btn_empress);
        resetColor(btn_princ);
        resetColor(btn_reguser);
        resetColor(btn_tecno);

        Menu1A p1 = new Menu1A();
        p1.setSize(790, 570);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_empressMousePressed

    private void btn_reguserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reguserMouseEntered
        if(btn_reguser.getBackground().getRGB() == -15574355)
            setColor(btn_reguser);        
// TODO add your handling code here:
    }//GEN-LAST:event_btn_reguserMouseEntered

    private void btn_reguserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reguserMouseExited
         if(btn_empress.getBackground().getRGB() != -15574355 || btn_princ.getBackground().getRGB() != -15574355 || btn_tecno.getBackground().getRGB() != -15574355)
             resetColor(btn_reguser);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reguserMouseExited

    private void btn_reguserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reguserMousePressed
        setColor(btn_reguser);
        resetColor(btn_empress);
        resetColor(btn_princ);
        resetColor(btn_tecno);
        
        JOptionPane.showMessageDialog(this, "Privilegios Insuficiente");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reguserMousePressed

    private void btn_tecnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tecnoMouseExited
             if(btn_empress.getBackground().getRGB() != -15574355 || btn_princ.getBackground().getRGB() != -15574355 || btn_reguser.getBackground().getRGB() != -15574355)
             resetColor(btn_tecno);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tecnoMouseExited

    private void btn_tecnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tecnoMouseEntered
            if(btn_tecno.getBackground().getRGB() == -15574355)
            setColor(btn_tecno);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tecnoMouseEntered

    private void btn_tecnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tecnoMousePressed
        setColor(btn_tecno);
        resetColor(btn_princ);
        resetColor(btn_empress);
        resetColor(btn_reguser);
        
        Menu4A p1 = new Menu4A();
        p1.setSize(790, 570);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tecnoMousePressed

    private void btn_orderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_orderMouseEntered

    private void btn_orderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_orderMouseExited

    private void btn_orderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orderMousePressed
        setColor(btn_order);
        resetColor(btn_princ);
        resetColor(btn_empress);
        resetColor(btn_reguser);
        resetColor(btn_tecno);
        
        Menu3A p1 = new Menu3A();
        p1.setSize(790, 570);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();        
// TODO add your handling code here:
    }//GEN-LAST:event_btn_orderMousePressed

    private void btn_tecno1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tecno1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tecno1MouseEntered

    private void btn_tecno1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tecno1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tecno1MouseExited

    private void btn_tecno1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tecno1MousePressed
        setColor(btn_order);
        resetColor(btn_princ);
        resetColor(btn_empress);
        resetColor(btn_reguser);
        resetColor(btn_tecno);
        
        Menu2A p1 = new Menu2A();
        p1.setSize(790, 570);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();     

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tecno1MousePressed

        void setColor(JPanel panel){
        panel.setBackground(new Color(180,80,100));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
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
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel btn_empress;
    private javax.swing.JPanel btn_order;
    private javax.swing.JPanel btn_princ;
    private javax.swing.JPanel btn_reguser;
    private javax.swing.JPanel btn_tecno;
    private javax.swing.JPanel btn_tecno1;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
