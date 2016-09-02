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
public class Pessoa {

    private String nome;
    private String rg;
    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void imprime() {
      
        System.out.println("Nome: " + this.nome);
        System.out.println("RG: " + this.rg);
        System.out.println("Rua: " + this.endereco.getRua());
        System.out.println("Numero: " + this.endereco.getNumero());

    }

}
