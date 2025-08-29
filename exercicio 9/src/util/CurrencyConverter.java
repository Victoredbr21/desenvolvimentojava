package util;
public class CurrencyConverter {
    public static double VALOR_DOLAR = 3.10;
    public double quantidade;
    public static  double IOF = 0.06;

    public double converterValor() {

        double real = quantidade * VALOR_DOLAR;
        double converted = real + (IOF * real);
        return converted;


    }

}
