/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author finfanterodal
 */
public class TemperaturaErradaExcepcion extends Exception {
//Constructor sin param
    public TemperaturaErradaExcepcion() {
        super();
    }
//Constructor definido
     public TemperaturaErradaExcepcion(String msg) {
        super(msg);
    }
    
}
