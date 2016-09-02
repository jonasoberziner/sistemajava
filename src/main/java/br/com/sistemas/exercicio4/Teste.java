/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemas.exercicio4;

/**
 *
 * @author jonas
 */
public class Teste {
    
    
    public static void main(String[] args) {
        
        
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();
        Endereco endereco1 = new Endereco("Rua Bahia", 44);                
        Endereco endereco2 = new Endereco("Rua Xxxxx", 445);                
        
        pessoa1.setNome("Jonas");
        pessoa1.setEndereco(endereco1);
        funcionario1.setNome("JONAS");
        funcionario1.setCarteiraProfissional("1111");
        funcionario1.setDataAdmissao("10/10/2016");
        funcionario1.setSalario(334);
        funcionario1.setEndereco(endereco2);
 
        pessoa2.setNome("Cris");
        pessoa2.setEndereco(endereco1);
        funcionario2.setCarteiraProfissional("13434");
        funcionario2.setDataAdmissao("20/10/2006");
        funcionario2.setSalario(33445);
        funcionario2.setEndereco(endereco2);
        
        funcionario1.imprime();
        
        pessoa1.imprime();
         
        
        
    }
    
    
}
