/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Main.DAO.Interfaces;

import Main.Modelos.Empresa;

/**
 *
 * @author Alice Sugar
 */
public interface IEmpresa {
    public boolean agregarEmpresa(Empresa e);
     public boolean actualizarEmpresa(String rif, Empresa e); //lo cambie por e estaba en u//
     public Empresa listarEmpresa(String rif);
}
