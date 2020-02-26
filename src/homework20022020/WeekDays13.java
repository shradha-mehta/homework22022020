package homework20022020;

import java.util.Scanner;

public class WeekDays13 {
    public static void main(String[] args) {
        WeekDays13 obj = new WeekDays13();
        obj.weekdays();
    }

    public void weekdays(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number of the Day : ");
        int day = scan.nextInt();

        switch (day){
            case 1:
                System.out.println(" it's Monday");
                break;
            case 2:
                System.out.println("it's Tuesday");
                break;
            case 3:
                System.out.println("it's Wednesday");
                break;
            case 4:
                System.out.println("it's Thursday");
                break;
            case 5:
                System.out.println("it's Friday");
                break;
            case 6:
                System.out.println("it's Saturday");
                break;
            case 7:
                System.out.println("it's Sunday");
                break;
            default:
                System.out.println("Week Contains only 1 to 7 Days");


        }

    }

}
