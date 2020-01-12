/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitive.obsession;

/**
 *
 * @author davidmendozaloor
 */
public class FormaGeometrica {
    private int altura;
    private int ancho;
    private int radio;
    private char tipo;//c es un circulo, t es triangulo y r es rectangulo

    public FormaGeometrica(int altura, int ancho, int radio, char tipo) {
        if(tipo== 'c'){
            this.radio=radio;
            this.altura=this.ancho=0;
            this.tipo='c';
        }
        else if(tipo=='t'){//En triangulos la base nos referimos al ancho
            this.radio=0;
            this.altura=altura;
            this.ancho=ancho;
            this.tipo=tipo;
        }
        else if(tipo=='s'){
            this.tipo=tipo;
            this.altura=altura;
            this.ancho=ancho;
            this.radio=0;
        }
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
    
    
            
}
