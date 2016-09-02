/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemas.exercicio1;

/**
 *
 * @author jonas
 */
public class MeuDepartamentoTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setRg("123");
        p1.setNome("Marcondes");

        Pessoa p2 = new Pessoa();
        p2.setRg("1234");
        p2.setNome("Marcondes2");

        MeuDepartamentoTeste departamento = new MeuDepartamentoTeste();
        departamento.setNome("RH");
        departamento.addPessoa(p1);
        System.out.println("Adicionando pessoa no departamento.");
        departamento.imprime();

        departamento.addPessoa(p2);
        System.out.println("Adicionando pessoa no departamento.");
        departamento.imprime();

        departamento.removePessoa(p2);
        System.out.println("Removendo pessoa do departamento.");
        departamento.imprime();

    }
}
