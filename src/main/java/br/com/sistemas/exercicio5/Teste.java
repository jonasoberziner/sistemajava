/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemas.exercicio5;

/**
 *
 * @author jonas
 */
public class Teste {
    
    
    public static void main(String[] args) {
        
        
        Pessoa pessoa1 = new Pessoa("Jonas", "111", new Endereco("Rua Bahia", 44));
        Funcionario funcionario3 = new Funcionario("hhh", "aaa",  new Endereco("Rua Bahia", 44), "222", 223, "10/10/2016");
        

        System.out.println(funcionario3);
        System.out.println(pessoa1);

        
         
        
        
    }
    
    
}
