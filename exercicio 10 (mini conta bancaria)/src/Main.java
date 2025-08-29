import java.util.Scanner;
import entities.ContaBancaria;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria Conta;
        // importando os parametros iniciais
        System.out.println("Insira o nome do conta bancaria: ");
        String nomeConta = sc.nextLine();
        sc.nextLine();
        System.out.println("Insira o nome do conta bancaria: ");
        int  numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("tem deposito inicial da conta ? (s/n)");
        char resposta = sc.next().charAt(0);
        // importando a classe
        if (resposta == 's') {
            System.out.println("Insira o valor inicial");
            double depositoInicial = sc.nextDouble();
            ContaBancaria Conta = new ContaBancaria(nomeConta, numeroConta, depositoInicial);
        } else {
            ContaBancaria Conta = new ContaBancaria(nomeConta, numeroConta);
        }

        //exibindo valores

        System.out.println();
        System.out.println("Insira o nome do conta bancaria: ");
        System.out.println(Conta);

        double valorDeposito = sc.nextDouble();
        Conta.depositar(valorDeposito);
        System.out.println("Valor atualizado");
        System.out.println(Conta);


        double valorSaque = sc.nextDouble();
        Conta.sacar(valorSaque);
        System.out.println("Valor atualizado");
        System.out.println(Conta);


        //Exibir dados do programa
        sc.close();
    }
}