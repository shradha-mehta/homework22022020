package homework20022020;

import java.util.Scanner;

/*this programme input any two number and ask user to
    enter their symbol (+, -, /, *) find addition,
/Subtraction, multiplication and division according to
    their symbol (using if else)
*/
public class AddSubMulDiv {    // declaration of main method

    public static void main(String[] args) {

        addsubdivmul();

    }

    public static void addsubdivmul() {

        // declaration of variables
        double x;
        double y;
        char ch;
        double add;
        double sub;
        double multi;
        double div;


        // declaration of scanner
        Scanner scan = new Scanner(System.in);

        // calling input number through scanner

        System.out.println("Please Enter Number1");
        x = scan.nextDouble();

        System.out.println("Please Enter Number2");
        y = scan.nextDouble();

        System.out.println("Please Enter the method you want to use");
        ch = scan.next().charAt(0);

        add = x + y;
        sub = x - y;
        multi = x * y;
        div = x / y;

        if (ch == '+') {
            System.out.println("Addition of Number1 and Number2 is :" + add);

        } else if (ch == '-') {
            System.out.println("Substraction of Number1 and Number2 is :" + sub);

        } else if (ch == '*') {
            System.out.println("Multipliction of Number1 and Number2 is :" + multi);

        } else if (ch == '/') {
            System.out.println("Division of Number1 and Number2 is :" + div);
        }


    }


}