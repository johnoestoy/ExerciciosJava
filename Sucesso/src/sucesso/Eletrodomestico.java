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
public class Eletrodomestico {
    boolean ligado;
    
    Eletrodomestico(boolean ligado){
        this.ligado= ligado;
    }
    void ligar(){
        this.ligado = true;
    }
    void desligar(){
        this.ligado = false;
    }
    void imprimir(){
        System.out.println("Eletrodomestico ligado: "+this.ligado);
    }
    
}

