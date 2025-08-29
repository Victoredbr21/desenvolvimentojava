import java.util.Scanner;
import util.CurrencyConverter;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        System.out.println("Insira a quantidade de dollars para a quantidade: ");
        CurrencyConverter conversor = new CurrencyConverter();
        double reais = conversor.converterValor(quantidade);
        System.out.println("Valor em reais: ", + reais);

        }
    }
