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
public class Retangulo {
    float comprimento;
    float largura;
    float area;
    float perimetro;
    
    Retangulo(float comprimento, float largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    void calcularArea(){
        this.area = this.comprimento*this.largura;
    }
    void calcularPerimetro(){
        this.perimetro = (this.comprimento*2)+(this.largura*2);
    }
    void imprimir(){
        System.out.println("\nAtributos do Retangulo\nComprimento: "+this.comprimento+"\nLargura: "+this.largura+"\nArea: "+this.area+"\nPerimetro: "+this.perimetro);
    }
    
}
