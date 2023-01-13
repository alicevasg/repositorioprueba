/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main.Formularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import static Main.Formularios.Dashboard1.content;
import javax.swing.JOptionPane;
import Main.DAO.BaseDatos;
import java.sql.PreparedStatement;
import java.sql.Statement;
import Main.DAO.IOrdenesImpl;
/**
 *
 * @author Alice Sugar
 */
public class Menu3A extends javax.swing.JPanel {
    DefaultTableModel modelo=new DefaultTableModel();
    PreparedStatement PS;
    Statement ejecutor=null;
    Connection conn;  
    BaseDatos base = new BaseDatos();
    IOrdenesImpl CE = new IOrdenesImpl();
    
    protected void mostrartablas(){
    DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("ID Orden");
    modelo.addColumn("Fecha");
    modelo.addColumn("ID Emprsa");
    modelo.addColumn("ID Empleado");
    modelo.addColumn("Incio");
    modelo.addColumn("Fin");
    modelo.addColumn("Servicio");

    modelo.setRowCount(0);
    
    
    tbl_buscar.getColumnModel().getColumn(0).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(1).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(2).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(3).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(4).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(5).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(6).setPreferredWidth(100);


    
    String query = "SELECT * FROM ordenes";
    
    String datos [] = new String[7];
    ResultSet rs;
  
    try{
       ejecutor=conn.createStatement();
       ejecutor.setQueryTimeout(20);
       rs=ejecutor.executeQuery(query);
       while(rs.next()==true){
           datos[0] = rs.getString("id_orden");
           datos[1] = rs.getString("fecha");
           datos[2] = rs.getString("id_empresa");
           datos[3] = rs.getString("id_empl");
           datos[4] = rs.getString("fechainc");
           datos[5] = rs.getString("fechafn");
           datos[6] = rs.getString("tiporevis");

           modelo.addRow(datos);
        }
       tbl_buscar.setModel(modelo);
       } catch(Exception e){
           
       }
}
       public void conectar(){
        conn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaadministrativo?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
        } catch (Exception e){
            System.out.println(""+e.getMessage());
    }
  }
    /**
     * Creates new form Test
     */
    public Menu3A() {
        initComponents();
        conectar();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_buscar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_buscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Orden", "Fecha", "ID Empresa", "ID Empleado", "Inicio", "Fin", "Servicio"
            }
        ));
        jScrollPane1.setViewportView(tbl_buscar);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 770, 420));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ordenes");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(18, 90, 173));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eliminar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 90, 30));

        jPanel2.setBackground(new java.awt.Color(18, 90, 173));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Detalles Avanzados");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 190, 30));

        jPanel3.setBackground(new java.awt.Color(18, 90, 173));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Añadir");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 80, 30));

        jPanel4.setBackground(new java.awt.Color(18, 90, 173));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Actualizar Tabla");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 160, 30));

        search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(102, 102, 102));
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 610, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 610, 10));

        jPanel5.setBackground(new java.awt.Color(18, 90, 173));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

 
        public void elimina(){
        int fila = tbl_buscar.getSelectedRow();
        String valor = tbl_buscar.getValueAt(fila, 0).toString();
        
        try {
            PreparedStatement elimina = conn.prepareStatement("DELETE FROM ordenes WHERE id_orden='"+valor+"'");
            elimina.executeUpdate();
            mostrartablas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+ "No Se Ha Eliminado");
        }
        


}
    
    
    
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
                    mostrartablas();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
                
        Mod3A p1 = new Mod3A();
        p1.setSize(790, 570);
        p1.setLocation(0,0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        mostrartablaAdv();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

        Reg3 p1 = new Reg3();
        p1.setSize(790, 570);
        p1.setLocation(0,0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        elimina();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField search;
    private javax.swing.JTable tbl_buscar;
    // End of variables declaration//GEN-END:variables

        private void mostrartablaAdv(){
    String busqueda = search.getText();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    modelo.addColumn("ID Orden");
    modelo.addColumn("Fecha");
    modelo.addColumn("ID Emprsa");
    modelo.addColumn("ID Empleado");
    modelo.addColumn("Incio");
    modelo.addColumn("Fin");
    modelo.addColumn("Servicio");
    modelo.setRowCount(0);
    tbl_buscar.setModel(modelo);
    
    tbl_buscar.getColumnModel().getColumn(0).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(1).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(2).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(3).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(4).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(5).setPreferredWidth(100);
    tbl_buscar.getColumnModel().getColumn(6).setPreferredWidth(100);

    
    String slq = "SELECT * FROM ordenes WHERE id_orden LIKE '%"+busqueda+"%'";
    
    String datos [] = new String[7];
    
    try{
        
        base.sentencia = base.getConnection().createStatement();
        base.rs = base.sentencia.executeQuery(slq);
        
           while(base.rs.next()){
           datos[0] = base.rs.getString("id_orden");
           datos[1] = base.rs.getString("fecha");
           datos[2] = base.rs.getString("id_empresa");
           datos[3] = base.rs.getString("id_empl");
           datos[4] = base.rs.getString("fechainc");
           datos[5] = base.rs.getString("fechafn");
           datos[6] = base.rs.getString("tiporevis");

                modelo.addRow(datos);
            }
            
    tbl_buscar.setModel(modelo);
                    
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }   
  }
    

}
