/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alice Sugar
 */
public class BaseDatos {
    Connection BaseDatos;
    public ResultSet rs;
    public Statement sentencia;
    Connection conn;
    
    public void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaadministrativo?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
        } catch (Exception e){
            System.out.println(""+e.getMessage());
    }
}

    public BaseDatos() {
        conectar();
    }

        public  Connection getConnection(){
        return conn;
    }
    
     public void desconectar(){
         try{
             conn.close();
         } catch(Exception e){
             Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE,null,e);
         }
     }
        
    public static void main(String[] args) {
        new BaseDatos();
    }
   
  }
