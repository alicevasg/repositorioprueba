/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Modelos;

/**
 *
 * @author Alice Sugar
 */
public class Empleados {


    private String Id_empleado;
    private String ci;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    
public Empleados(String Id_empleado, String ci, String nombre, String apellido, String telefono, String email) {
        this.Id_empleado = Id_empleado;
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
    public String getId_empleado() {
        return Id_empleado;
    }

    public void setId_empleado(String Id_empleado) {
        this.Id_empleado = Id_empleado;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
