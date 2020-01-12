/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitive.obsession.refactorizado;

/**
 *
 * @author davidmendozaloor
 */
public class Circulo extends FormaGeoRefactor{
    
    public Circulo(int altura, int ancho, int radio) {
        super(altura=0, ancho=0, radio);
    }
    
    @Override
    public double getArea(){
        return 3.14*getRadio()*getRadio();
    }
}
