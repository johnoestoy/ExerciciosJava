/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucesso;

/**
 *
 * @author JOHN
 */
public class Quadrado {
    float lado;
    float area;
    float perimetro;
    
    Quadrado(float lado){
        this.lado=lado;
    }
    void calculaArea(){
        this.area = this.lado * this.lado;
    }
    void calculaPerimetro(){
        this.perimetro = this.lado*4;
    }
    void imprimir(){
        System.out.println("Atributos do Quadrado: \nlado: "+this.lado+"\narea: "+this.area+"\nperimetro :"+this.perimetro);
    }
}

