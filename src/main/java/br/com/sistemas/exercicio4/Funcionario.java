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



public class Funcionario extends Pessoa {

    private String carteiraProfissional;
    private double salario;
    private String dataAdmissao;

    public String getCarteiraProfissional() {
        return carteiraProfissional;
    }

    public void setCarteiraProfissional(String carteiraProfissional) {
        this.carteiraProfissional = carteiraProfissional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

public void imprime() {
    super.imprime();
    System.out.println("Carteira: " + this.carteiraProfissional);
    System.out.println("Data Emissao: " + this.dataAdmissao);
    System.out.println("Salario: " + this.salario);
}

    
}
