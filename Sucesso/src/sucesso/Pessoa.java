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
public class Pessoa {
    String nome;
    String endereco;
    String telefone;
    
    Pessoa(String nome, String endereco, String telefone){
        this.nome= nome;
        this.endereco=endereco;
        this.telefone=telefone;
    }
    void imprimir(){
        System.out.println("Nome: "+this.nome+"Endereco: "+this.endereco+"telefone: "+this.telefone);
    }
            
    
}
