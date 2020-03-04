package homework29022020;

import java.util.Scanner;

public class Exe_10 {
    public static void main(String[] args) {
        int c =0, a,temp;
        int n;//it is the number to check armstromg
        System.out.println("Enter Any Number:");
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        temp=n;
        while (n>0){
            a = n%10;
            n=n/10;
            c=c+(a*a*a);

        }
            if (temp==c)
                System.out.println("armstrong number");
            else
                System.out.println("Not armstrong number");
    }
}
