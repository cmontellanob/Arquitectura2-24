/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cochesresponsabilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DELL
 * Declarar la clase coche  que tiene los siguientes propiedades y metodos:
 * Luego crear unmenu con las opciones crear un coche y Guardar el Coche,
 * Guardar permitira guardar en una mase de datos mysql que llame be_coches , la tabla 
 * coches con los campos que sean necesarios
 */ 

public class Coche {
    private Marca marca;
    private int modelo;
    private String placa;
    private Color color;
    private int cilindrada;
    
    public void GuardarBd(){
          try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql", "root", "");
            String sql = "INSERT INTO coches(marca,modelo,placa,color,cilindrada) VALUES (?,?,?,?,?) ";

            PreparedStatement instruccion = conexion.prepareStatement(sql);
            instruccion.setString(1, marca.toString());
            instruccion.setInt(2, modelo);
            instruccion.setString(3, placa);
            instruccion.setString(4, color.toString());
            instruccion.setInt(5, cilindrada);
            instruccion.execute();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
            //Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
