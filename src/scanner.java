package src;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Voce digitou: " + x);


        int y;
        y = sc.nextInt();
        System.out.println("Voce digitou: " + y);


        double z;
        z = sc.nextDouble();
        System.out.println("Voce digitou: " + z);

        char v;
        v = sc.next().charAt(0);
        System.out.println("Voce digitou: " + v);
        sc.close();
    }
}
