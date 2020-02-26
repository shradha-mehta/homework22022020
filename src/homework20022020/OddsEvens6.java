package homework20022020;

import java.util.Scanner;

public class OddsEvens6 {
    public static void main(String[] args) {

        // calling userdefined method to main method

        oddsevens();
    }

    public static void oddsevens(){
        // Declaration of variable
        int a;
        // Declaration of scanner

        Scanner scan = new Scanner(System.in);

        // calling variable a through scanner

        System.out.println("Please Enter Number to Check if its Odds or Evens");
        a = scan.nextInt();

        // using of Conditional statement and printing statement

        if (a % 2 == 0) {
            System.out.println(+a + " " + "is an Even Number.");
        }   else {
            System.out.println(+a + " " + " is an Odd Number.");
        }

    }

}
