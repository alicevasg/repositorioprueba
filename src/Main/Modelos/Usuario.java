/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Modelos;

/**
 *
 * @author Alice Sugar
 */
public class Usuario {

    /**
     * @param privilegios
     */

    private String username;
    private String password;
    private String nombres;
    private String apellidos; 
    private String privilegios;

    public Usuario(String username, String password, String nombres, String apellidos, String privilegios) {
        this.username = username;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.privilegios = privilegios;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    } 

    public String getPrivilegios() {
        return privilegios;
    }
    
    public void setPrivilegios(String privilegios) {
        this.privilegios = privilegios;
    }
}
