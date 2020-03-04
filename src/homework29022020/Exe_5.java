package homework29022020;

public class Exe_5 {
    public static void main(String[] args) {//main class
        System.out.println(isPalindrome(-1221));//printing statement
    }
    public static boolean isPalindrome(int number) {//boolean method with one parameter
        int reverse = 0;//local variable

        if (number < 0) {//if condition
            number *= -1;
        }
        int num = number;
        while (num > 0) {//while loop
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        System.out.println(number);//printing statement
        System.out.println(reverse);//printing statement

        if (reverse == number) {
            return true;
        } else {
            return false;
        }

    }
}

