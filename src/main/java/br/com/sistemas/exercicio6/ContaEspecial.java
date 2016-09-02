package br.com.sistemas.exercicio6;

/*
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Adicione o atributo limite do tipo double e o encapsule 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) 
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o CPMF devido.
 */
public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(double limite, double saldo, String numero, Cliente titular, Agencia agencia) {
        super(saldo, numero, titular, agencia);
        this.limite = limite;

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void imprimeDados() {

        System.out.println("-------------------");
        System.out.println("CONTA ESPECIAL");
        System.out.println("-------------------");
        super.imprimeDados();
        System.out.println("-------------------");
        System.out.println("LIMITE");
        System.out.println("-------------------");
        System.out.println(this.limite);

    }

    @Override
    public void saque(double valor) {
        if (valor > 0) {
            if (valor <= this.limite) {
                super.saque(valor);
            } else {
                System.out.println("valor acima do limite");
            }
        }
    }

}
