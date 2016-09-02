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
public class Escritorio {
    private String cnpj;
    private Endereco endereco;            

    public String getCnpj() {
        return cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
