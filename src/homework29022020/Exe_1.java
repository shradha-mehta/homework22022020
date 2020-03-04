package homework29022020;

import java.util.Scanner;

public class Exe_1 {
    public static void main(String[] args) {//main method
        reading();//calling static method in main method
    }

    public static void reading() {//static method
        Scanner scanner = new Scanner(System.in);//scanner class
        //local variable
        int a = 1;
        int sum = 0;

        while (a <= 10) {//while loop

            System.out.println("Enter number " + a);//printing statement
            boolean hasNextInt = scanner.hasNextInt();
            a++;

            if (hasNextInt) {//if condition
                int number = scanner.nextInt();
                sum += number;


            } else {//else condition
                System.out.println("Invalid Value");//printing statement
            }
            scanner.nextLine();
        }
        System.out.println("Your sum is: " + sum);//printing statement
        scanner.close();//scanner closed

    }


}

















