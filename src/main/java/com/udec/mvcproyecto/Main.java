/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.mvcproyecto;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author SuperUs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista,modelo);
        controlador.inicio();
        vista.setVisible(true);
    }
    
}
