package homework29022020;

import java.util.Scanner;

public class Exe_15 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = in.nextInt();
        in.close();
        for (int i =1; i<=rows;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
