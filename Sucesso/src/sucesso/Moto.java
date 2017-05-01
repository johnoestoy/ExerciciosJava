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
public class Moto {
    String marca;
    String modelo;
    String cor;
    int marcha;
    int menorMarcha = 0;
    int maiorMarcha = 5;
    boolean ligada;
    
    Moto(String marca, String modelo, String cor, int marcha,int menorMarcha, int maiorMarcha, boolean ligada){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
        this.menorMarcha = menorMarcha;
        this.maiorMarcha = maiorMarcha;
        this.ligada = ligada;
        
    }
    void ligar(){
        this.ligada = true;
    }
    
    void desligar(){
        this.ligada= false;
    }
    
    void marcaAcima(){
        if (this.ligada == true && this.marcha>=this.menorMarcha && this.marcha>0){
            this.marcha ++;
        }
    }
    void marchaAbaixo(){
        if (this.ligada == true && this.marcha <= this.maiorMarcha && this.marcha>=0){
            this.marcha --;
        }
        
    }
    
    void imprimir(){
        System.out.println("\nAtributos Moto: \nMarca: "+this.marca+"\nModelo: "+this.modelo+"\nCor: "+this.cor+"\nMenor marcha: "+this.menorMarcha+"\nMaior marcha: "+this.maiorMarcha+"\nMarcha: "+this.marcha+"\nMoto ligada: "+this.ligada);
    }
    
}
