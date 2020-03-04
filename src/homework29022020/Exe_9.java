package homework29022020;

import java.util.Arrays;
import java.util.Scanner;

public class Exe_9 {
    public static void main(String[] args) {
        int count =9, num1=0, num2=1;
        System.out.println("Fibonacci Series of   " + count +" number : ");

        int i =1;

        while (i<=count) {
            System.out.print(num1 + " ");
            int sumOfPrewTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrewTwo;
            i++;
        }

    }

}
