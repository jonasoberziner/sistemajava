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
public class Empresa {

    private Departamento[] departamentos = new Departamento[10];
    private Escritorio[] escritorios = new Escritorio[10];

    public void adicionaDepto(Departamento departamento) {
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i] == null) {
                departamentos[i] = departamento;
                System.out.println("Adicionado o departamento: " + departamento.getNome());
                break;
            } else if (i == (departamentos.length - 1)) {
                System.out.println("Nao ha espaco para incluir Departamento");
            }
        }
    }

    public void removeDepto(Departamento departamento) {
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i] == departamento) {
                departamentos[i] = null;
                break;
            }
        }
    }

    public void adicionaEscritorio(Escritorio escritorio) {
        for (int i = 0; i < escritorios.length; i++) {

            if (escritorios[i] == null) {
                escritorios[i] = escritorio;
                System.out.println("Adicionado o escritorio: " + escritorio.getCnpj());
                break;
            } else if (i == (escritorios.length - 1)) {
                System.out.println("Nao ha espaco para incluir escritorios");
            }
        }
    }

    public void removeEscritorio(Escritorio escritorio) {
        for (int i = 0; i < escritorios.length; i++) {

            if (escritorios[i] == escritorio) {
                escritorios[i] = null;
                break;
            }
        }
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public Escritorio[] getEscritorios() {
        return escritorios;
    }

    public void imprimeEscritorios() {
        for (int i = 0; i < escritorios.length; i++) {
            if (escritorios[i] instanceof Escritorio) {
                System.out.println("Listando o escritorio: " + escritorios[i].getCnpj());
            }
        }
    }

    public void imprimeDepartamentos() {
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i] instanceof Departamento) {
                System.out.println("Listando o departamentos: " + departamentos[i].getNome()+
                      "Pessoa: " + departamentos[i].getPessoa().getNome() 
                        
                
                
                );
            }
        }
    }

}
