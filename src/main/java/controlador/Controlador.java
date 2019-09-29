/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *Esta clase es la encargada de responder 
 * a eventos y peticiones e invoca al modelo
 * cuando hay una solicitud de información
 * esta clase es la intermediaria entre 
 * la vista y el modelo.
 * @author Edward Ramos
 * @author Victor Preciado
 */
public class Controlador implements ActionListener{
   /**
    * variable  vista de tipo objeto
    * variable modelo de tipo objeto
    */
    private Vista vista;
    private Modelo modelo;
    /**
     * contructor que recibe dos parametros
     * recibe informacion de las clases
     * y la acción del boton 
     * @param vista
     * @param modelo 
     */
    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnConvertir.addActionListener(this);
    }
    
    /**
     * Metodo por el cual inicia el programa se le da un titulo al formulario y se pocisiona en 
     * el centro de la pantalla
     */
    
    public void inicio(){
    
        vista.setTitle(titulo());
        vista.setLocationRelativeTo(null);
        
    }   
    /**
     * este metodo es el encargado de la 
     * asigacion de valores al modelo y 
     * a la vista que es operado en el 
     * modelo y enviados por el controlador
     * 
     */
    public void asignarValor(){        
        try{
            modelo.setPeso(Double.parseDouble(vista.txtPeso.getText()));       
            modelo.convertirDolar();
            modelo.convertirYen();
            modelo.convertirEuro();
            vista.txtDolar.setText(String.valueOf(modelo.getDolar()));
            vista.txtYen.setText(String.valueOf(modelo.getYen()));
            vista.txtEuro.setText(String.valueOf(modelo.getEuro()));
            vista.lbError.setText("");
        } catch(NumberFormatException e){
            vista.lbError.setText("*** Error de Conversion ***");
        }
    }
    /**
     * este metodo es el encargado de 
     * mostrar el titulo del programa
     * @return cadena
     */
    public  String titulo(){
    
        String cadena = "|Conversor de Moneda Local|";
        vista.lbTitulo.setText(cadena);
        return cadena;
    }

    @Override
    /**
     * este metodo es el encargado llamar 
     * al metodo asignarValor y producir el
     * evento del boton para
     *  asignar los valores de modelo y vista.
     */
    public void actionPerformed(ActionEvent e) {
        asignarValor();
    }
      
}
