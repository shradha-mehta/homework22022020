package homework20022020;

import java.util.Scanner;

public class OddsEvensTurnery1 {
    public static void main(String[] args) {
        OddsEvensTurnery1 obj = new OddsEvensTurnery1();
        obj.oddsevensturnery();

    }

    // declaration of user defined method

    public void oddsevensturnery() {

        // declaration of variable

        int a;

        // declaration of scanner

        Scanner scan = new Scanner(System.in);

        // print statement
        System.out.println("Please Enter any Number to check if its Odds or Evens");

        // calling variable through scanner

        a = scan.nextInt();

        String b = (a % 2 == 0) ? "even" : "odd";

        System.out.println(+ a + " "+ "is" + " " + b);
    }

}
