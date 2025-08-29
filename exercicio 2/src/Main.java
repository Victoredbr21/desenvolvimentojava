//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void tabuada(double numero) {
        for (int i = 1; i <= 10; i++) {
            double resultado = numero * i;
            System.out.println(resultado);
        }
    }

    public static void main(String[] args) {

        tabuada(5);

        }

    }