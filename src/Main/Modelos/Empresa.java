/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Modelos;

/**
 *
 * @author Alice Sugar
 */
public class Empresa {

    private String rif;
    private String fecha;
    private String empresa;
    private String telefono;
    private String ciudad;
    private String sucursal;
    private String email;
    private String direct;


    public Empresa(String rif, String empresa, String telefono, String ciudad, String sucursal,  String email, String direct) {
        
        this.rif = rif;
        this.empresa = empresa;
        this.ciudad = ciudad;
        this.sucursal = sucursal;
        this.telefono = telefono;
        this.email = email;
        this.direct = direct;

    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
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

    public String getDirect() {
        return direct;
    }

    public void setDirect(String ubicacionequip) {
        this.direct = direct;
    }

}
