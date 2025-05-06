package src;
import java.util.Scanner;
import java.util.Locale;
public class listaDeExer1 {

    public static void main (String[] args) {
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

//
//        System.out.println("Digite dois números inteiros e veja a soma: ");
//        int x, y, soma;
//
//        x = sc.nextInt();
//        y = sc.nextInt();
//
//       soma = x + y;
//       System.out.println("A soma desses números é: " + soma);

       // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        // casas decimais conforme exemplos.

        System.out.println("Digite o raio de um circulo");
        double raio, area, pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * (Math.pow(raio, 2.0));
        System.out.printf("A área do círculo é: %.4f%n", area);










        sc.close();
    }
}