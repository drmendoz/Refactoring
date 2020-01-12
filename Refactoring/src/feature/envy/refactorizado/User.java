/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feature.envy.refactorizado;

import feature.envy.refactorizado.Rectangulo;

/**
 *
 * @author davidmendozaloor
 */
public class User {
    
    // Metodo getAreaRecantgulo antes de refactorizar donde se accedia a los 
    //atributos de Rectangulo para calcular el area en vez de que sea un metodo de Rectangulo
    
    //public double getAreaRectangulo(Rectangulo r){
    //   double area=0;
    //    if(r.getAltura() !=0 && r.getAncho() != 0){
    //       area= r.getAltura()*r.getAncho();
    //    }
    //    return area;
    //}
    
    
    //Metodo desdepues de refactorizar donde el area la calcula la misma clase Rectangulo
    public double getAreaRectangulo(Rectangulo r){
        return r.getArea();
    }
}
