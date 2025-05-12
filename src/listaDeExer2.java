package src;

import java.util.Scanner;

public class listaDeExer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
//        System.out.println("DIGITE UM NUMERO E VEJA SE É NEGATIVO: ");
//        int x;
//        x = sc.nextInt();
//        if (x < 0) {
//            System.out.println("NEGATIVO");
//        }
//        else {
//                System.out.println("NÃO NEGATIVO");
//        }

        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
        System.out.println("DIGITE UM NUMERO E VEJA SE É PAR OU ÍMPAR: ");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("ÍMPAR");
        }
    sc.close();
    }
}
