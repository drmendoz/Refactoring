/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feature.envy.refactorizado;

import java.awt.geom.Area;

/**
 *
 * @author davidmendozaloor
 */
public class Rectangulo {
    private double altura;
    private double ancho;

    public Rectangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }
    
    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    //Metodo creado para la precondicion
    public boolean comprobarLimites(){
        return this.altura !=0 && this.ancho!=0;
    }
    
    
    //Metodo creado para calcular el area
    public double getArea(){
        double area=0;
        if(comprobarLimites()){
            area= this.altura*this.ancho;
        }
        return area;
    }
    
}
