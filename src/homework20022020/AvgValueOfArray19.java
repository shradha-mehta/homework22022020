package homework20022020;

import java.util.Scanner;

public class AvgValueOfArray19 {
    public static void main(String[] args) {

        array();
    }

    // declaration of userdefine method

    public static void array() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the no. of Elements you want in array :");

        int n = scan.nextInt();
        int total = 0;
        int[] a = new int [n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the Elements" + " " +(i+1)+"");
            a[i] = scan.nextInt();
        }
        scan.close();
        for (int value : a) {
            total = total + value;
        }
        int avg = total / a.length;

        System.out.println("The average of Array Element is " + avg);
    }


}
