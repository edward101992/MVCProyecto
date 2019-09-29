/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *Está clase es la encargada de hacer las operaciones 
 * logicas de calcular los valores de conversión.
 * @author Edward Ramos
 * @author Victor Preciado
 */
public class Modelo {
    
   /**
    * variable peso esta varible guarda el valor 
    * ingresado de pesos
    * variable dolar esta variable guarda el
    * valor de la operacion del dolar
    * variable euro esta variable guarda el
    * valor de la operacion del euro
    * variable yen esta variable guarda el
    * valor de la operacion del yen
    * 
    */
    private double peso;
    private double dolar;
    private double euro;
    private double yen;
    /**
     * get variable peso
     * @return 
     */
    public double getPeso() {
        return peso;
    }
    /**
     * set variable peso
     * @param peso 
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
     /**
      * get variable dolar
      * @return dolar
      */
    public double getDolar() {
        return dolar;
    }
    /**
     * set variable dolar
     * @param dolar 
     */
    public void setDolar(double dolar) {
        this.dolar = dolar;
    }
    /**
     * get variable euro
     * @return 
     */
    public double getEuro() {
        return euro;
    }
    /**
     * set variable euro
     * @param euro 
     */
    public void setEuro(double euro) {
        this.euro = euro;
    }
    /**
     * get variable yen
     * @return 
     */
    public double getYen() {
        return yen;
    }
    /**
     * set variable yen
     * @param yen 
     */
    public void setYen(double yen) {
        this.yen = yen;
    }
      /**
       * Este metodo es el encargado de hacer 
       * la conversión de pesos a dolares
       * @return peso
       */
      public double convertirDolar(){
        
        this.dolar = this.peso * 0.00029;
        return peso;
    }
    /**
     * Este metodo es el encargado de hacer 
     * la conversión de pesos a yenes
     * @return yenes
     */
    public double convertirYen(){
    
        this.yen = this.peso * 0.031;
        return yen;
    }
      /**
       * Este metodo es el encargado de hacer 
       * la conversión de pesos a euros
       * @return euros
       */
      public double convertirEuro(){
    
        this.euro = this.peso * 0.00027;
        return euro;
    }
}
