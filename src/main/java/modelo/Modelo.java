/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author SuperUs
 */
public class Modelo {
    
    private double peso;
    private double dolar;
    private double euro;
    private double yen;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getYen() {
        return yen;
    }

    public void setYen(double yen) {
        this.yen = yen;
    }
    
      public double convertirDolar(){
        
        this.dolar = this.peso * 0.00029;
        return peso;
    }
    
    public double convertirYen(){
    
        this.yen = this.peso * 0.031;
        return yen;
    }
    
      public double convertirEuro(){
    
        this.euro = this.peso * 0.00027;
        return euro;
    }
}
