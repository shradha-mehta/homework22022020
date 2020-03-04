package homework29022020;

public class Exe_11 {
    public static void main(String[] args) {//main method
        System.out.println(getEvenDigitSum(123456789));//calling static method with one parameter
        System.out.println(getEvenDigitSum(252));//calling static method with one parameter
        System.out.println(getEvenDigitSum(-22));//calling static method with one parameter
    }
    public static int getEvenDigitSum(int number) {//return type method with one parameter
        if (number <0) {//if condition
            return -1;
        }
        int finalNumber = 0;//local variable
        while (number >0) { //loop ends when all the numbers have been tested
            if (((number%10)%2) == 0) { //test for the last digit is even
                finalNumber += number%10; //takes out the last digit
            }
            number /= 10; //takes out last digit to test the next digit
        }
        return finalNumber;
    }

}
