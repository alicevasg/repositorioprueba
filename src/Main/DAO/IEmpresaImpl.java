/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Main.DAO.Interfaces.IEmpresa;
import Main.Modelos.Empresa;
import Main.DAO.BaseDatos;

/**
 *
 * @author Alice Sugar
 */
public class IEmpresaImpl implements IEmpresa{
       PreparedStatement PS;
       BaseDatos base = new BaseDatos();
       
    @Override
    public boolean agregarEmpresa(Empresa e) {
        
        try{
            String slq = "INSERT INTO empresa(rif, empresa, telefono, ciudad, sucursal, email, direct)VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst;
            pst = base.conn.prepareStatement(slq);
            pst.setString(1, e.getRif());
            pst.setString(2, e.getEmpresa());
            pst.setString(3, e.getTelefono());
            
            pst.setString(4, e.getCiudad());
            pst.setString(5, e.getSucursal());
            pst.setString(6, e.getEmail());
            pst.setString(7, e.getDirect());
            pst.executeUpdate();
            return true;
            
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        return false;
    }   

    @Override
    public boolean actualizarEmpresa(String rif, Empresa e) {

        try{
            String slq = "UPDATE empresa set rif=?, empresa=?, telefono=?, ciudad=?, sucursal=?, email=?, direct=? where rif=?";
            PreparedStatement pst;
            pst = base.conn.prepareStatement(slq);
            pst.setString(1, e.getRif());
            pst.setString(2, e.getEmpresa());
            pst.setString(3, e.getTelefono());
            pst.setString(4, e.getCiudad());
            pst.setString(5, e.getSucursal());
            pst.setString(6, e.getEmail());
            pst.setString(7, e.getDirect());
            pst.setString(8, rif);
            pst.executeUpdate();
            return true;
            
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        return false;
    }
    
    @Override
    public Empresa listarEmpresa(String rif) {
        BaseDatos base = new BaseDatos();
        
        try{
            PreparedStatement pst;
            pst = base.conn.prepareStatement("SELECT * from empresa WHERE rif =?");
            pst.setString(1, rif);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return (new Empresa(rs.getString("rif"),
                        rs.getString("empresa"),
                        rs.getString("telefono"),
                        rs.getString("ciudad"),
                        rs.getString("sucursal"),
                        rs.getString("email"), 
                        rs.getString("direct")));
            }
        }catch (Exception e){
        }
        return null;
    
    }
 } 
