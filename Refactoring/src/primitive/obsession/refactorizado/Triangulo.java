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
public class Triangulo extends FormaGeoRefactor{
    
    public Triangulo(int altura, int ancho, int radio) {
        super(altura, ancho, radio=0);
        
    }
    
    @Override
    public double getArea(){
        return getAltura()*getAncho()/2;
    }
}
