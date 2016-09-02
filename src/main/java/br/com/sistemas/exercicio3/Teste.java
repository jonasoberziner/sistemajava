/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemas.exercicio3;

/**
 *
 * @author jonas
 */
public class Teste {
    
    
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        Escritorio escritorio = new Escritorio();
        Endereco endereco = new Endereco();
        Escritorio escritorio2 = new Escritorio();
        Endereco endereco2 = new Endereco();
        Departamento departamento = new Departamento();
        Pessoa pessoa = new Pessoa();
        Endereco endereco3 = new Endereco();

        escritorio.setCnpj("888888888888");
        escritorio2.setCnpj("11188888888");
        
        endereco.setNumero(70);
        endereco.setRua("Rua Bahia");
        endereco2.setNumero(80);
        endereco2.setRua("Rua Lages");
        
        escritorio.setEndereco(endereco);
        escritorio2.setEndereco(endereco2);
        
        empresa.adicionaEscritorio(escritorio);
        empresa.adicionaEscritorio(escritorio2);
        empresa.imprimeEscritorios();
        
        departamento.setNome("financeiro");
        endereco3.setNumero(33);
        endereco3.setRua("rua xxxxx");
        pessoa.setEndereco(endereco3);
        pessoa.setNome("jonas");
        pessoa.setRg("2912.426");
        departamento.setPessoa(pessoa);
        
        empresa.adicionaDepto(departamento);
        
        empresa.imprimeDepartamentos();

        
        
        
        
        
        
        
        
    }
    
    
    
    
}
