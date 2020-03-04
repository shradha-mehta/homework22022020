package homework29022020;

public class Exe_13 {
    public static void main(String[] args) {//main method
        hasSharedDigit(12, 23);//calling static method to main method
    }

    public static boolean hasSharedDigit(int number1, int number2) {//boolean return type method
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99)//if condition
            return false;
        while (number1 > 0) {//while loop
            int secondNumber = number2;
            int firstNumber = number1;
            while (secondNumber > 0) {
                if (firstNumber % 10 == secondNumber % 10) {//if conditional
                    return true;
                }
                secondNumber /= 10;
            }
            number1 /= 10;
        }
        return false;

    }


}







