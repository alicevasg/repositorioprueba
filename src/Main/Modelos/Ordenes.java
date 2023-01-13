/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Modelos;

/**
 *
 * @author Alice Sugar
 */
public class Ordenes {
    private String id_orden;
    private String fecha;
    private String id_empresa;
    private String id_empl;
    private String fechainc;
    private String fechafn;
    private String tiporevis;
    
    public Ordenes(String id_orden, String fecha, String id_empresa, String id_empl, String fechainc, String fechafn, String tiporevis) {
        this.id_orden = id_orden;
        this.fecha = fecha;
        this.id_empresa =id_empresa;
        this.id_empl = id_empl;
        this.fechainc = fechainc;
        this.fechafn = fechafn;
        this.tiporevis = tiporevis;
    }
    public String getId_orden() {
        return id_orden;
    }
    
    public void setId_orden(String id_orden) {
        this.id_orden = id_orden;
    }
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getId_empresa() {
        return id_empresa;
    }
    
    public void setId_empresa(String id_empresa) {
        this.id_empresa = id_empresa;
    }
    
    
        public String getId_empl() {
        return id_empl;
    }
    
    public void setId_empl(String id_empl) {
        this.id_empl = id_empl;
    }
    
    
    public String getFechainc() {
        return fechainc;
    }

    public void setFechainc(String fechainc) {
        this.fechainc = fechainc;
    }

    public String getFechafn() {
        return fechafn;
    }

    public void setFechafn(String fechafn) {
        this.fechafn = fechafn;
    }

    public String getTiporevis() {
        return tiporevis;
    }

    public void setTiporevis(String tiporevis) {
        this.tiporevis = tiporevis;
    }
}
