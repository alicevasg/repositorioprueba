/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Main.DAO.Interfaces.IOrdenes;
import Main.Modelos.Ordenes;
import Main.DAO.BaseDatos;
/**
 *
 * @author Alice Sugar
 */
public class IOrdenesImpl implements IOrdenes {
    
       PreparedStatement PS;
       BaseDatos base = new BaseDatos();
       
        public boolean agregarOrdenes(Ordenes o) {
        
        try{
            String slq = "INSERT INTO Ordenes(id_orden, fecha, id_empresa, id_empl, fechainc, fechafn, tiporevis)VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst;
            pst = base.conn.prepareStatement(slq);
            pst.setString(1, o.getId_orden());
            pst.setString(2, o.getFecha());
            pst.setString(3, o.getId_empresa());
            pst.setString(4, o.getId_empl());
            pst.setString(5, o.getFechainc());
            pst.setString(6, o.getFechafn());
            pst.setString(7, o.getTiporevis());
            pst.executeUpdate();
            return true;
            
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        return false;
    }   
    
     public int delatereg( String nc){
        int res= 0;
        String SQL_DELETE = "DELETE FROM ordenes WHERE =" + nc;
            try{
                PS = base.getConnection().prepareStatement(SQL_DELETE);
                res = PS.executeUpdate();
                if(res>0){
                JOptionPane.showMessageDialog(null, "Acción Completada");
                }
            
            }catch(SQLException ex){
            
            }
        return res;
    }
    
        public Ordenes listarOrdenes(String id_orden) {
        BaseDatos base = new BaseDatos();
        
        try{
            PreparedStatement pst;
            pst = base.conn.prepareStatement("SELECT * from ordenes WHERE id_orden =?");
            pst.setString(1, id_orden);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return (new Ordenes(rs.getString("id_orden"),
                        rs.getString("fecha"),
                        rs.getString("id_empresa"),
                        rs.getString("id_empl"),
                        rs.getString("fechainc"),
                        rs.getString("fechafn"),
                        rs.getString("tiporevis")));
            }
        }catch (Exception e){
        }
        return null;
    
    }

    @Override
    public boolean actualizarOrdenes(String id_orden, Ordenes o) {
        
        try{
            String slq = "UPDATE ordenes set id_orden=?, fecha=?, id_empresa=?, id_empl=?, fechainc=?, fechafn=?, tiporevis=? WHERE id_orden=?";
            PreparedStatement pst;
            pst = base.conn.prepareStatement(slq);
            pst.setString(1, o.getId_orden());
            pst.setString(2, o.getFecha());
            pst.setString(3, o.getId_empresa());
            pst.setString(4, o.getId_empl());
            pst.setString(5, o.getFechainc());
            pst.setString(6, o.getFechafn());
            pst.setString(7, o.getTiporevis());
            pst.setString(8, id_orden);
            pst.executeUpdate();
            return true;
            
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        return false;
        
        
        
    }

    @Override
    public Ordenes listarOrnes(String id_orden) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

