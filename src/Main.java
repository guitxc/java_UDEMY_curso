package src;
import java.util.Locale;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Bom dia!");
        int y = 32;
        System.out.println(y);
        double x = 3.14159;
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Pi é " + x);
        System.out.printf("RESULTADO = %.2f metros%n", x);
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println(product1 + "which price is $ " + price1);
        System.out.println(product2 + "which price is $ " + price2);

        System.out.println("Record: " + age + " years old, code " + code + "and gender : "+ gender);

        System.out.printf("Measure with eigth decimal places: %.8f%n", measure);
        System.out.printf("Rouded (tree decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal pont: %.3f%n", measure);



    }
}