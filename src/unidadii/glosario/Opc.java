/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadii.glosario;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class Opc {
    
    
    public static void main(String[] args) {
        
        String[] options = {"Jugar Videojuegos", "Hacer Tarea de POO", "Estudiar", "Ver Facebook"};
        
        JOptionPane.showOptionDialog(null, "Seleccione una de las siguientes opciones: ",
               "Seleccionar opcion",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
               null, options, options[0]);
    }
}
