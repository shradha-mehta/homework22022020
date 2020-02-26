package homework20022020;

import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {

        // calling user defined method
        leapyear();

    }

    // declaration of user defined method
    public static void leapyear(){

        // declaration of variable
        int year;

        // declaration of scanner


        Scanner scan = new Scanner(System.in);

        // calling variable through scanner

        System.out.println("Please Enter any year to check if its leap year or not :");
        year = scan.nextInt();

        // usiing conditional statement  and printing statement

        if (((year%4 == 0) && (year%100 != 0))||  (year%400 == 0))
            System.out.println( + year + " " + "is a Leap Year");
        else {
            System.out.println( + year + " " +  "is not a Leap Year");
        }
    }

}
