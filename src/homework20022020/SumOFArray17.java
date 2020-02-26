package homework20022020;

import java.util.Scanner;

public class SumOFArray17 {
    public static void main(String[] args) {

        array();
    }

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

        System.out.println("The Sum of Array Element is " + total);
    }


}
