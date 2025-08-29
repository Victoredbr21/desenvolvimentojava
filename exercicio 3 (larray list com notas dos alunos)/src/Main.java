import java.util.Scanner;
import java.util.ArrayList;
public class Main {

public static void exibirNotas(ArrayList<Integer> inserirNotas) {

    for (int i = 0; i < inserirNotas.size(); i++) {
        System.out.println((i + 1) + " - " + inserirNotas.get(i));
    }


}
public static double calcularMedia(ArrayList<Integer> inserirNotas) {
    double soma = 0;
    for (int i = 0; i < inserirNotas.size(); i++) {
        soma = (soma + inserirNotas.get(i));

    }
    double media = (soma / inserirNotas.size());
    System.out.println("Média das notas: " + media);
    return media;
}



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inserirNotas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("insira a nota do aluno " + (i + 1) + ": ");
            inserirNotas.add(sc.nextInt());
        }
        exibirNotas(inserirNotas);
        calcularMedia(inserirNotas);





        sc.close();
    }

    }
