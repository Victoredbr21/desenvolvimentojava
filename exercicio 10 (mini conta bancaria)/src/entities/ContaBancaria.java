package entities;

public class ContaBancaria {

    //Atributos
    private String nomeTitular;
    private int numeroConta;
    private double saldo;
    public static double TAXA_SAQUE = 5.00;

    //construtores
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public ContaBancaria(String nomeTitular, int numeroConta, double depositoInicial) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        depositar(depositoInicial);
    }

    // getters

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //setters
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // metodos funcoes
    public double depositar(double valor){
        this.saldo += valor;
        return saldo;
    }
    public double sacar(double valor){
        this.saldo -= valor +  TAXA_SAQUE;
        return saldo;
    }

    // funcao string

    @Override
    public String toString() {
        return nomeTitular
                + numeroConta
                + "$"
                + String.format("%.2f", saldo);
    }

}

