package homework20022020;

import java.util.Scanner;

public class AlphabetSwitch9 {


    public static void main(String[] args) {

        String  alphabet;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter any alphabet between a to f ");
        alphabet = scan.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();

        switch (alphabet) {
            case "a" :

                System.out.println("City Name is Ahmedabad ");
                break;

            case "b":
                System.out.println("City Name is Baroda ");
                break;

            case "c":
                System.out.println("City Name is Chandigadh ");
                break;

            case "d":
                System.out.println("City Name is Delhi ");
                break;

            case "e":

                System.out.println("City Name is Etava");


            case "f":

                System.out.println("City Name is Faridabad ");
                break;


            default:

                System.out.println("Alphabet is not valid");
        }
    }

}
