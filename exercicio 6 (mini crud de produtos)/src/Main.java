import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the name of the product: ");
        String name = sc.nextLine();
        System.out.println("Enter the price of the product: ");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity of the product: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.print("Product data" + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.print("Update data" + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from  stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        sc.close();
        }
    }
