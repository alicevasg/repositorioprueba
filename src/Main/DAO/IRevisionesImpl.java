/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.DAO;

import Main.DAO.Interfaces.IRevisiones;
import Main.Modelos.Revisiones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alice Sugar
 */
public class IRevisionesImpl implements IRevisiones{
       PreparedStatement PS;
       BaseDatos base = new BaseDatos();
    
    @Override
    public boolean agregarRevisiones(Revisiones rv) {
        
        try{
        String slq = "INSERT INTO revisiones (id2, fecharev, id_empress, tecnicos, tipoequip,  marca,  capacidad,  voltajeplacaq,  voltajeconsumoq,  amperajeplaceq, amperajel1q, amperajel2q, amperajel3q, tempambientec, tiporefric, modelevaporc, serialevaporc, voltajeplacac,  voltajeconsumoc, amperajeplacec, amperajel1c, amperajel2c,  amperajel3c, psuccionq, pdescargaq, modelcondensaq, serialcondensaq, funciona, cargarefri, sepertinc, serpetine, filtro, ventiladorc,  ventiladore,  compresor,  tuboescape,  tuboaislado,  tubosoporte,  breakers, protector,  cableadoe, lugartrabajo, notas) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst;
        pst = base.conn.prepareStatement(slq);
            pst.setString(1, rv.getId2());
            pst.setString(2, rv.getFecharev());
            pst.setString(3, rv.getId_empress());
            pst.setString(4, rv.getTecnicos());
            pst.setString(5, rv.getTipoequip());
            pst.setString(6, rv.getMarca());
            pst.setString(7, rv.getCapacidad());
            pst.setString(8, rv.getVoltajeplacaq());
            pst.setString(9, rv.getVoltajeconsumoq());
            pst.setString(10, rv.getAmperajeplaceq());
            pst.setString(11, rv.getAmperajel1q());
            pst.setString(12, rv.getAmperajel2q());
            pst.setString(13, rv.getAmperajel3q());
            pst.setString(14, rv.getTempambientec());
            pst.setString(15, rv.getTiporefric());
            pst.setString(16, rv.getModelevaporc());
            pst.setString(17, rv.getSerialevaporc());
            pst.setString(18, rv.getVoltajeplacac());
            pst.setString(19, rv.getVoltajeconsumoc());
            pst.setString(20, rv.getAmperajeplacec());
            pst.setString(21, rv.getAmperajel1c());
            pst.setString(22, rv.getAmperajel2c());
            pst.setString(23, rv.getAmperajel3c());
            pst.setString(24, rv.getPsuccionq());
            pst.setString(25, rv.getPdescargaq());
            pst.setString(26, rv.getModelcondensaq());
            pst.setString(27, rv.getSerialcondensaq());
            pst.setString(28, rv.getFunciona());
            pst.setString(29, rv.getCargarefri());
            pst.setString(30, rv.getSepertinc());
            pst.setString(31, rv.getSerpetine());
            pst.setString(32, rv.getFiltro());
            pst.setString(33, rv.getVentiladorc());
            pst.setString(34, rv.getVentiladore());
            pst.setString(35, rv.getCompresor());
            pst.setString(36, rv.getTuboescape());
            pst.setString(37, rv.getTuboaislado());
            pst.setString(38, rv.getTubosoporte());
            pst.setString(39, rv.getBreakers());
            pst.setString(40, rv.getProtector());
            pst.setString(41, rv.getCableadoe());
            pst.setString(42, rv.getLugartrabajo());
            pst.setString(43, rv.getNotas());
        pst.executeUpdate();
        return true;
            
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        return false;
        
        
    }

    @Override
    public boolean actualizarRevisiones(String id2, Revisiones rv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Revisiones listarRevisiones(String id2) {
        
          BaseDatos base = new BaseDatos();
        
        try{
            PreparedStatement pst;
            pst = base.conn.prepareStatement("SELECT * from revisiones WHERE id2 =?");
            pst.setString(1, id2);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return (new Revisiones(rs.getString("id2"),
                        rs.getString("fecharev"),
                        rs.getString("id_empress"),
                        rs.getString("tecnicos"),
                        rs.getString("tipoequip"),
                        rs.getString("marca"),
                        rs.getString("capacidad"),
                        rs.getString("voltajeplacaq"),
                        rs.getString("voltajeconsumoq"),
                        rs.getString("amperajeplaceq"),
                        rs.getString("amperajel1q"),
                        rs.getString("amperajel2q"),
                        rs.getString("amperajel3q"),
                        rs.getString("tempambientec"),
                        rs.getString("tiporefric"),                       
                        rs.getString("modelevaporc"),
                        rs.getString("serialevaporc"),
                        rs.getString("voltajeplacac"),
                        rs.getString("voltajeconsumoc"),
                        rs.getString("amperajeplacec"),
                        rs.getString("amperajel1c"),
                        rs.getString("amperajel2c"),
                        rs.getString("amperajel3c"),
                        rs.getString("psuccionq"),
                        rs.getString("pdescargaq"),
                        rs.getString("modelcondensaq"),
                        rs.getString("serialcondensaq"),
                        rs.getString("funciona"),
                        rs.getString("cargarefri"),
                        rs.getString("sepertinc"),
                        rs.getString("serpetine"),
                        rs.getString("filtro"),
                        rs.getString("ventiladorc"),
                        rs.getString("ventiladore"),
                        rs.getString("compresor"),
                        rs.getString("tuboescape"),
                        rs.getString("tuboaislado"),
                        rs.getString("tubosoporte"),
                        rs.getString("breakers"),
                        rs.getString("protector"),
                        rs.getString("cableadoe"),
                        rs.getString("lugartrabajo"), 
                        rs.getString("notas")));
            }
        }catch (Exception e){
        }
        return null;
    
        
        
        
    }
    
}
