/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Main.DAO.Interfaces;

import Main.Modelos.Usuario;

/**
 *
 * @author Alice Sugar
 */
public interface IUsuario {
    public boolean agregarUsuario(Usuario u);
    public boolean actualizarUsuario(String username, Usuario u);
    public Usuario listarUsuario(String username);
    public boolean validarUsuario(String username, String password);
}
