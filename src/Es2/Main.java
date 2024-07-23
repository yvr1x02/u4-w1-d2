package Es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero compreso tra 0 e 3");
        int numero = scanner.nextInt();
        System.out.println(turnToWord(numero));


    }


    public static String turnToWord(int numero) {

        if (numero <= 3 && numero >= 0) {
            switch (numero) {
                case 0:
                    return "Zero";
                case 1:
                    return "Uno";
                case 2:
                    return "Due";
                case 3:
                    return "Tre";
                default:

                    return "Non hai inserito un numero compreso tra 0 e 3";
            }
        } else {

            return "Non hai inserito un numero compreso tra 0 e 3";
        }
    }
}




