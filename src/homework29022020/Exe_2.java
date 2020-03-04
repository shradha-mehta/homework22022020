package homework29022020;

import java.util.Scanner;

public class Exe_2 {
    public static void main(String[] args) {//main method
        min();//calling static method to main method
    }

    public static void min() {//static method

        Scanner scanner = new Scanner(System.in);//scanner class

        //local variable
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {//while loop
            System.out.println("Enter number (to exit enter any litter): ");//printing statement
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {//if condition

                int number = scanner.nextInt();
                if (first) {//if condition
                    first = false;
                    min = number;
                    max = number;

                }
                if (number > max) {//if condition
                    max = number;
                }
                if (number < min) {//if condition
                    min = number;
                }
            } else {//else statement
                break;
            }
        }

        System.out.println("min= " + min + ", max=" + max);//printing statement
        scanner.close();//scanner closing
    }


}



