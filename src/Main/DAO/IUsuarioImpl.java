package Main.DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Main.DAO.Interfaces.IUsuario;
import Main.Modelos.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alice Sugar
 */
public class IUsuarioImpl implements IUsuario{

       PreparedStatement PS;
       BaseDatos base = new BaseDatos();
    
    @Override
    public boolean agregarUsuario(Usuario u) {
              BaseDatos base = new BaseDatos();
        
        try{
            String slq = "INSERT INTO usuarios(username, password, nombres, apellidos, privilegios)VALUES (?,?,?,?,?)";
            PreparedStatement pst;
            pst = base.conn.prepareStatement(slq);
            pst.setString(1, u.getUsername());
            pst.setString(2, u.getPassword());
            pst.setString(3, u.getNombres());
            pst.setString(4, u.getApellidos());
            pst.setString(5, u.getPrivilegios());
            pst.executeUpdate();
            return true;
            
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        return false;
    }        

        public int delatereg( String nc){
        int res= 0;
        String SQL_DELETE = "DELETE FROM usuarios WHERE username=?" + nc;
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
    
    @Override
    public boolean actualizarUsuario(String username, Usuario u) {
        
        try{
            String slq = "UPDATE usuarios set username=?, password=?, nombres=?, apellidos=?, privilegios=? WHERE username=?";
            PreparedStatement pst;
            pst = base.conn.prepareStatement(slq);
            pst.setString(1, u.getUsername());
            pst.setString(2, u.getPassword());
            pst.setString(3, u.getNombres());
            pst.setString(4, u.getApellidos());
            pst.setString(5, u.getPrivilegios());
            pst.setString(6, username);
            pst.executeUpdate();
            return true;
            
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        return false;
    }

    @Override
    public Usuario listarUsuario(String username) {
        BaseDatos base = new BaseDatos();
        
        try{
            PreparedStatement pst;
            pst = base.conn.prepareStatement("SELECT * from usuarios WHERE username =?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return (new Usuario(
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getString("Nombres"),
                        rs.getString("Apellidos"),
                        rs.getString("Privilegios")));
            }
        }catch (Exception e){
        }
        return null;
    
        
    }

    @Override
    public boolean validarUsuario(String username, String password) {
        BaseDatos base = new BaseDatos();
        try{
            PreparedStatement pst;
            pst = base.conn.prepareStatement("SELECT * from usuarios WHERE username =? AND password=?");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               UserRank.rank = rs.getString("privilegios");
                return true;
            }
        }catch (Exception e){
        }
        return false;
    
    }
}
