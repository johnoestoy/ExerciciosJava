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
public class Microondas {
    boolean ligado;
    boolean portaFechada;
    
    Microondas(boolean portaFechada){
        this.portaFechada=portaFechada;
    }
    
    void fecharPorta(){
        this.portaFechada=true;
    }
    void abrirPorta(){
        this.portaFechada=false;
    }
    void ligar(){
        if(this.portaFechada==true){
            this.ligado=true;
        }else{
            System.out.println("Feche a porta para poder ligar");
        }
    }
    
    void desligar(){
        this.ligado = false;
    }
    void imprimir(){
        System.out.println("Microondas ligado: "+this.ligado);
        System.out.println("Porta fechada: "+this.portaFechada);
    }
   
    
}
