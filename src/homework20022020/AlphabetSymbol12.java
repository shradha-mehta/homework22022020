package homework20022020;

import java.util.Scanner;

public class AlphabetSymbol12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Input Value :");
        char ch = scan.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a Alphabet");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number");

        } else {
            System.out.println(ch + " is a Symbol");

        }




    }

}
