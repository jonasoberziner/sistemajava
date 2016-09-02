
package br.com.sistemas.exercicio5;

/**
 *
 * @author jonxcxxcxcas as
 */
public class Funcionario extends Pessoa {

    private String carteiraProfissional;
    private double salario;
    private String dataAdmissao;

    public Funcionario(String nome, String rg, Endereco endereco, String carteiraProfissional, double salario, String dataAdmissao) {
        super(nome, rg, endereco);
        this.carteiraProfissional = carteiraProfissional;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

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

    @Override
    public String toString() {
        return "Funcionario{" + "carteiraProfissional=" + carteiraProfissional + ", salario=" + salario + ", dataAdmissao=" + dataAdmissao + '}';
    }

}
