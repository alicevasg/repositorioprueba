/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Main.DAO.Interfaces;

import Main.Modelos.Empleados;

/**
 *
 * @author Alice Sugar
 */
public interface IEmpleados {
     public boolean agregarEmpleados(Empleados emp);
     public boolean actualizarEmpleados(String id_empleado, Empleados emp); //lo cambie por e estaba en u//
     public Empleados listarEmpleados(String id_empleados);
}
