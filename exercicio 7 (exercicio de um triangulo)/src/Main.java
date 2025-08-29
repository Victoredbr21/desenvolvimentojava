import entities.Retangulo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Insira a altura do retangulo: ");
        retangulo.altura = input.nextDouble();
        System.out.println("Insira a largura do retangulo: ");
        retangulo.largura = input.nextDouble();

        double area  = retangulo.getArea();
        System.out.println("Area do retangulo: " + area);
        double perimetro = retangulo.getPerimetro();
        System.out.println("Perimetro do retangulo: " + perimetro);
        double diagonal = retangulo.getDiagonal();
        System.out.println("Diagonal do retangulo: " + diagonal);


    }
}