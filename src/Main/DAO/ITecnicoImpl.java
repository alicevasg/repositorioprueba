/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.DAO;

import Main.DAO.Interfaces.ITecnico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Main.DAO.BaseDatos;
import Main.Modelos.Revisiones;
import javax.swing.table.DefaultTableModel;
import Main.Modelos.Tecnico;

/**
 *
 * @author Alice Sugar
 */
public class ITecnicoImpl implements ITecnico {
       PreparedStatement PS;
       BaseDatos base = new BaseDatos();

    @Override
    public boolean agregarTecnico(Tecnico tc) {
          
        try{
            String slq = "INSERT INTO tecnico(ID2, fecharev, id_empress, tecnicos, tipoequip,  marca,  capacidad,  voltajeplacaq,  voltajeconsumoq,  amperajeplaceq, amperajel1q, amperajel2q, amperajel3q, tempambientec, tiporefric, modelevaporc, serialevaporc, voltajeplacac,  voltajeconsumoc, amperajeplacec, amperajel1c, amperajel2c,  amperajel3c, psuccionq, pdescargaq, modelcondensaq, serialcondensaq, funciona, cargarefri, sepertinc, serpetine, filtro, ventiladorc,  ventiladore,  compresor,  tuboescape,  tuboaislado,  tubosoporte,  breakers, protector,  cableadoe, lugartrabajo, notas) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst;
            pst = base.conn.prepareStatement(slq);
            pst.setString(1, tc.getId2());
            pst.setString(2, tc.getFecharev());
            pst.setString(3, tc.getId_empress());
            pst.setString(4, tc.getTecnicos());
            pst.setString(5, tc.getTipoequip());
            pst.setString(6, tc.getMarca());
            pst.setString(7, tc.getCapacidad());
            pst.setString(8, tc.getVoltajeplacaq());
            pst.setString(9, tc.getVoltajeconsumoq());
            pst.setString(10, tc.getAmperajeplaceq());
            pst.setString(11, tc.getAmperajel1q());
            pst.setString(12, tc.getAmperajel2q());
            pst.setString(13, tc.getAmperajel3q());
            pst.setString(14, tc.getTempambientec());
            pst.setString(15, tc.getTiporefric());
            pst.setString(16, tc.getModelevaporc());
            pst.setString(17, tc.getSerialevaporc());
            pst.setString(18, tc.getVoltajeplacac());
            pst.setString(19, tc.getVoltajeconsumoc());
            pst.setString(20, tc.getAmperajeplacec());
            pst.setString(21, tc.getAmperajel1c());
            pst.setString(22, tc.getAmperajel2c());
            pst.setString(23, tc.getAmperajel3c());
            pst.setString(24, tc.getPsuccionq());
            pst.setString(25, tc.getPdescargaq());
            pst.setString(26, tc.getModelcondensaq());
            pst.setString(27, tc.getSerialcondensaq());
            pst.setString(28, tc.getFunciona());
            pst.setString(29, tc.getCargarefri());
            pst.setString(30, tc.getSepertinc());
            pst.setString(31, tc.getSerpetine());
            pst.setString(32, tc.getFiltro());
            pst.setString(33, tc.getVentiladorc());
            pst.setString(34, tc.getVentiladore());
            pst.setString(35, tc.getCompresor());
            pst.setString(36, tc.getTuboescape());
            pst.setString(37, tc.getTuboaislado());
            pst.setString(38, tc.getTubosoporte());
            pst.setString(39, tc.getBreakers());
            pst.setString(40, tc.getProtector());
            pst.setString(41, tc.getCableadoe());
            pst.setString(42, tc.getLugartrabajo());
            pst.setString(43, tc.getNotas());
            pst.executeUpdate();
            return true;
            
        }catch (SQLException a){
            System.out.println(a.getMessage());
        }
        return false;
    }


    @Override
    public boolean actualizarTecnico(String id2, Tecnico tc) {
        
        try{
            String slq = "UPDATE tecnico set id2=?, fecharev=?, id_empress=?, tecnicos=?, tipoequip=?,  marca=?,  capacidad=?, voltajeplacaq=?, voltajeconsumoq=?, amperajeplaceq=?,  "
                    + "amperajel1q=?, amperajel2q=?, amperajel3q=?, tempambientec=?, tiporefric=?, modelevaporc=?, serialevaporc=?, "
                    + "voltajeplacac=?, voltajeconsumoc=?, amperajeplacec=?, amperajel1c=?, amperajel2c=?, amperajel3c=?, psuccionq=?, pdescargaq=?,"
                    + "modelcondensaq=?, serialcondensaq=?, funciona=?, cargarefri=?, sepertinc=?, serpetine=?, filtro=?,"
                    + "ventiladorc=?,  ventiladore=?,  compresor=?,  tuboescape=?,  tuboaislado=?,  tubosoporte=?,  breakers=?,"
                    + "protector=?, cableadoe=?, lugartrabajo=?, notas=? where id2=?";
            PreparedStatement pst;
            pst = base.conn.prepareStatement(slq);
            pst.setString(1, tc.getId2());
            pst.setString(2, tc.getFecharev());
            pst.setString(3, tc.getId_empress());
            pst.setString(4, tc.getTecnicos());
            pst.setString(5, tc.getTipoequip());
            pst.setString(6, tc.getMarca());
            pst.setString(7, tc.getCapacidad());
            pst.setString(8, tc.getVoltajeplacaq());
            pst.setString(9, tc.getVoltajeconsumoq());
            pst.setString(10, tc.getAmperajeplaceq());
            pst.setString(11, tc.getAmperajel1q());
            pst.setString(12, tc.getAmperajel2q());
            pst.setString(13, tc.getAmperajel3q());
            pst.setString(14, tc.getTempambientec());
            pst.setString(15, tc.getTiporefric());
            pst.setString(16, tc.getModelevaporc());
            pst.setString(17, tc.getSerialevaporc());
            pst.setString(18, tc.getVoltajeplacac());
            pst.setString(19, tc.getVoltajeconsumoc());
            pst.setString(20, tc.getAmperajeplacec());
            pst.setString(21, tc.getAmperajel1c());
            pst.setString(22, tc.getAmperajel2c());
            pst.setString(23, tc.getAmperajel3c());
            pst.setString(24, tc.getPsuccionq());
            pst.setString(25, tc.getPdescargaq());
            pst.setString(26, tc.getModelcondensaq());
            pst.setString(27, tc.getSerialcondensaq());
            pst.setString(28, tc.getFunciona());
            pst.setString(29, tc.getCargarefri());
            pst.setString(30, tc.getSepertinc());
            pst.setString(31, tc.getSerpetine());
            pst.setString(32, tc.getFiltro());
            pst.setString(33, tc.getVentiladorc());
            pst.setString(34, tc.getVentiladore());
            pst.setString(35, tc.getCompresor());
            pst.setString(36, tc.getTuboescape());
            pst.setString(37, tc.getTuboaislado());
            pst.setString(38, tc.getTubosoporte());
            pst.setString(39, tc.getBreakers());
            pst.setString(40, tc.getProtector());
            pst.setString(41, tc.getCableadoe());
            pst.setString(42, tc.getLugartrabajo());
            pst.setString(43, tc.getNotas());
            pst.setString(44, id2);
            pst.executeUpdate();
            return true;
            
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        return false;
    }

    @Override
    public Tecnico listarTecnico(String tecnicos) {
        BaseDatos base = new BaseDatos();
        
        try{
            PreparedStatement pst;
            pst = base.conn.prepareStatement("SELECT from * tecnico WHERE tecinos=?");
            pst.setString(1, tecnicos);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return (new Tecnico(rs.getString("id2"),
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

    public Revisiones listarRevisiones(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
