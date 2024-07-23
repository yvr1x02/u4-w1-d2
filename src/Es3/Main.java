package Es3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("ciao! inserisci una stringa!");
            String strings = scanner.nextLine();

            if (Objects.equals(strings, ":q")) break;
            char[] arrayLettere = strings.toCharArray();
            System.out.println(Arrays.toString((arrayLettere)));
        }
    }


}
