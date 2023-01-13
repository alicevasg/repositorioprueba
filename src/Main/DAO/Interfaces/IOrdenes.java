/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Main.DAO.Interfaces;

import Main.Modelos.Ordenes;

/**
 *
 * @author Alice Sugar
 */
public interface IOrdenes {
        public boolean agregarOrdenes(Ordenes o);
     public boolean actualizarOrdenes(String id_orden, Ordenes o); //lo cambie por e estaba en u//
     public Ordenes listarOrnes(String id_orden);
}
