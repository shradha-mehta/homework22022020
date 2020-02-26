package homework20022020;


import java.util.Scanner;

public class Alphabet8 {
    public static void main(String[] args) {

        String alphabet;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter any alphabet between a to f ");
        alphabet = scan.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();

        if (alphabet.equals("a")) {
            System.out.println("City Name is Ahmedabad ");

        } else if (alphabet.equals("b")) {
            System.out.println("City Name is Baroda ");

        }else if (alphabet.equals("c")) {
            System.out.println("City Name is Chandigadh ");

        }else if (alphabet.equals("d")) {
            System.out.println("City Name is Delhi ");

        }else if (alphabet.equals("e")) {
            System.out.println("City Name is Etava");

        }else if (alphabet.equals("f")) {
            System.out.println("City Name is Faridabad ");

        } else
            System.out.println("Alphabet is not valid");
    }


        }