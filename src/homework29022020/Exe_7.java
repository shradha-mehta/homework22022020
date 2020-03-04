package homework29022020;

public class Exe_7 {
    public static void main(String[] args) {//main method
        System.out.println(sumFirstLast(-10));//printing statement
    }

    public static int sumFirstLast(int number) {//int type method with one parameter
        // number = 12 should output 3
        int num = number;
        if (num < 0) {
            return -1;
        }
        int lastDigit = num % 10;

        while (num >= 10) {
            num = number / 100;
        }
        int firstDigit = num;
        return firstDigit + lastDigit;
    }

}



