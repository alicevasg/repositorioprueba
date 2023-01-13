/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Main.DAO.Interfaces;

import Main.Modelos.Tecnico;

/**
 *
 * @author Alice Sugar
 */
public interface ITecnico {
    public boolean agregarTecnico(Tecnico tc);
     public boolean actualizarTecnico(String id2, Tecnico tc);
     public Tecnico listarTecnico(String id2);
}
