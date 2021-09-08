package exercicios;

import java.util.Scanner;

public class ExerciciosStrings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palavra;

        System.out.println("Digite uma palavra");
        palavra = scan.next();

        System.out.println(upper(palavra));
        System.out.println(lower(palavra));
    }

    public static String upper(String palavra) {

        return palavra.toUpperCase();
    }

    public static String lower(String palavra) {
        return palavra.toLowerCase();
    }


}