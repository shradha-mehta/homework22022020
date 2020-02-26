package homework20022020;

import java.util.Scanner;

public class Exe_4 {


    /* Question 4 - USING SCANNER, (PARAMETERS CANNOT BE DEFINED)
4. Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range,
calculate if the year is a leap year and return true if it is, otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400. Example of input/Output:
HINT: Use the switch statement. NOTE: Methods isLeapYear and getDaysInMonth need to be public static
*/
    public static void main(String[] args) {  // main method

        isLeapYear();               // static method calling directly for isLeapYear
        getDaysInMonth();           // static method calling for getDaysInMonth
    }

    public static void isLeapYear() {      // static method for leap year
        Scanner scan = new Scanner(System.in);  // Scanner introduced
        System.out.println("Enter the year between 1 and 9999 : "); // print statent for valid year
        int year = scan.nextInt();              // user input for year

        if (year >= 1 && year <= 9999) {       // condition for valid year

            switch (year % 4) {                 // then switch operates.
                case 0:                         // case for leap year
                    if (year % 100 == 0) {          // condition for leap year
                        if (year % 400 == 0) {
                            System.out.println(year + " is a Leap year ," + true); // true leap year statement
                        } else
                            System.out.println(year + " is not a Leap year, " + false);// false statement
                    } else
                        System.out.println(year + " is a Leap year, " + true);   // true statement
                    break;
                default:
                    System.out.println(year + " is not a leap year, " + false);  // default statement always false.
                    break;
            }
        } else
            System.out.println(false + ", Invalid input");    // print statement for invalid yer input
    }

    public static void getDaysInMonth() {     // second static method for Day of the month

        Scanner scan = new Scanner(System.in);   // Scanner
        System.out.println("Enter number of the month (between 1 & 12)of the year : "); // days of the month in integers
        int month = scan.nextInt();                             // user input here
        System.out.println("Enter the year again :");           // Year again for days on the month
        int year = scan.nextInt();                              // user input
        int numDays = 0;                                        // int numDays for days in the month

        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) { // valid condition for month and year
            switch (month) {

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDays = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    break;
                case 2:
                    if (((year % 4 == 0) &&
                            !(year % 100 == 0))
                            || (year % 400 == 0))
                        numDays = 29;
                    else
                        numDays = 28;
                    break;
                default:
                    System.out.println("-1, Invalid request"); //printing statement
                    break;
            }
        } else System.out.println("-1, Invalid request");//printing statement

        System.out.println("Number of days in the month = " + numDays); //printing statement
    }

}
