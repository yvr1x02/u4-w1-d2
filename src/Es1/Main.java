package Es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("inserisci una parola");
        String parola = scanner.nextLine();
        System.out.println(stringaPariDispari(parola));


        System.out.println("inserisci un anno");
        int anno = scanner.nextInt();
        System.out.println(annoBisestile(anno));


    }


    public static boolean stringaPariDispari(String parola) {

        return parola.length() % 2 == 0;

    }

    public static boolean annoBisestile(int anno) {

        return anno % 4 == 0 && anno % 100 == 0 && anno % 400 == 0;

    }


}


