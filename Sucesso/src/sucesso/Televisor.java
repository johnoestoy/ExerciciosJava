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
public class Televisor {
    boolean ligado;
    int canal;
    int volume;
    int numeroCanais;
    int volumeMaximo;
    
    
    Televisor(boolean ligado, int canal, int volume,int numeroCanais, int volumeMaximo){
        this.ligado = ligado;
        this.canal = canal;
        this.volume = volume;
        this.numeroCanais = numeroCanais;
        this.volumeMaximo = volumeMaximo;
    }
    void ligar(){
        this.ligado =true;
    }
    void desligar(){
        this.ligado = false;
    }
    void canalAcima(){
        if (this.ligado == true){
            this.canal ++;
            if(this.canal==this.numeroCanais+1){
                this.canal = 1;
            }
        }
    }
    void canalAbaixo(){
        if(this.ligado == true){
            this.canal --;
            if(this.canal==0){
                this.canal=this.numeroCanais;
            }
        }
    }
    void volumeAcima(){
        if(this.ligado == true && this.volume<this.volumeMaximo && this.volume>0){
            this.volume ++;
        }
    }
    void volumeAbaixo(){
        if(this.ligado==true && this.volume>=0 && this.volume<=this.volumeMaximo){
            this.volume --;
        }
    }
    void imprimir(){
        System.out.println("Estado do TV:");
        System.out.println("Ligado: "+this.ligado);
        System.out.println("canal: "+this.canal);
        System.out.println("Volume: "+this.volume);
        System.out.println("Total canais: "+this.numeroCanais);
        System.out.println("Volume maximo: "+this.volumeMaximo);
    }
    
}
