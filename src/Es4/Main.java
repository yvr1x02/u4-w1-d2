package Es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero da cui far partire il countDown");
        int numero = scanner.nextInt();
        countDown(numero);
    }

    public static void countDown(int numero) {

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

    }
}
