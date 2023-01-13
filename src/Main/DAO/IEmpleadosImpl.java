/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.DAO;

import Main.DAO.Interfaces.IEmpleados;
import Main.Modelos.Empleados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alice Sugar
 */
public class IEmpleadosImpl implements IEmpleados {
    
       PreparedStatement PS;
       BaseDatos base = new BaseDatos();
       
    @Override
    public boolean agregarEmpleados(Empleados emp) {
        
        try{
            String slq = "INSERT INTO emptecnico (id_empleado, ci, nombre, apellido, telefono, email)VALUES (?,?,?,?,?,?)";
            PreparedStatement pst;
            pst = base.conn.prepareStatement(slq);
            pst.setString(1, emp.getId_empleado());
            pst.setString(2, emp.getCi());
            pst.setString(3, emp.getNombre());
            pst.setString(4, emp.getApellido());
            pst.setString(5, emp.getTelefono());
            pst.setString(6, emp.getEmail());

            pst.executeUpdate();
            return true;
            
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        return false;
    }   

    @Override
    public boolean actualizarEmpleados(String id_empleado, Empleados emp) {

        try{
            String slq = "UPDATE emptecnico set id_empleado=?, ci=?, nombre=?, apellido=?, telefono=?, email=? where id_empleado=?";
            PreparedStatement pst;
            pst = base.conn.prepareStatement(slq);
            pst.setString(1, emp.getId_empleado());
            pst.setString(2, emp.getCi());
            pst.setString(3, emp.getNombre());
            pst.setString(4, emp.getApellido());
            pst.setString(5, emp.getTelefono());
            pst.setString(6, emp.getEmail());
            pst.setString(7, id_empleado);
            pst.executeUpdate();
            return true;
            
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        return false;
    }
    
    @Override
    public Empleados listarEmpleados(String id_empleado) {
        BaseDatos base = new BaseDatos();
        
        try{
            PreparedStatement pst;
            pst = base.conn.prepareStatement("SELECT * from emptecnico WHERE id_empleado =?");
            pst.setString(1, id_empleado);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return (new Empleados(rs.getString("id_empleado"),
                        rs.getString("ci"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("telefono"),
                        rs.getString("email")));
            }
        }catch (Exception e){
        }
        return null;
    
    }

    public void actualizarEmpleados(Empleados emp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
