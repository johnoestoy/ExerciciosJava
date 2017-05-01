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
public class Circulo {
    double raio;
    double area;
    double perimetro;
    
    Circulo(double raio){
        this.raio = raio;
    }
    void calcularArea(){
        this.area = 3.141516 *(this.raio*this.raio);
    }
    void calcularPerimetro(){
        this.perimetro = 2 * 3.141516 *this.raio;
    }
    void imprimir(){
        System.out.println("\nAtributos do Circulo\nRaio: "+this.raio+"\nArea: "+this.area+"\nPerimetro: "+this.perimetro);
    }
}
