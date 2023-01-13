/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Main.DAO.Interfaces;

import Main.Modelos.Revisiones;

/**
 *
 * @author Alice Sugar
 */
public interface IRevisiones {
        public boolean agregarRevisiones(Revisiones rv);
     public boolean actualizarRevisiones(String id2, Revisiones rv); //lo cambie por e estaba en u//
     public Revisiones listarRevisiones(String id2);
}
