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
public class FormaGeoRefactor {
    private int altura;
    private int ancho;
    private int radio;

    public FormaGeoRefactor(int altura, int ancho, int radio) {
        this.altura = altura;
        this.ancho = ancho;
        this.radio = radio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
    public double getArea(){
        return 0;
    }
}
