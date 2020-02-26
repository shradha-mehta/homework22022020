package homework20022020;

import java.util.Scanner;

public class SalarySlip5 {
    public static void main(String[] args) {
        SalarySlip5 obj = new SalarySlip5();
        obj.salaryslip();




    }
    public  void salaryslip(){


        int basicsalary;
        int hra;
        int ta;
        int da;
        int pf;


        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Employee Id : ");
        int eId = scan.nextInt();

        System.out.println("Please Enter Employee Name : ");
        String eName = scan.next();

        System.out.println("Please Enter Basic Salary : ");
        basicsalary = scan.nextInt();

        hra = (basicsalary*10)/100;
        ta = (basicsalary*8)/100;
        da = (basicsalary*9)/100;
        pf = (basicsalary*20)/100;
        double grosssalary= (basicsalary+hra+ta+da)-pf;

        System.out.println("______________________________________");
        System.out.println("|              Salary Slip           |");
        System.out.println("| ___________________________________|");
        System.out.println("| Employee Id         :  "+eId+"          |  ");
        System.out.println("| Employee Name       :  "+eName+"     |  ");
        System.out.println("|____________________________________|  ");
        System.out.println("| Basic Salary        :  "+basicsalary+"        | ");
        System.out.println("| HRA 10%             :  "+hra+"         | ");
        System.out.println("| TA 8%               :  "+ta+"         | ");
        System.out.println("| DA 9%               :  "+da+"         |"     );
        System.out.println("| PF 20%              :  "+pf+"         |");
        System.out.println("|____________________________________|");
        System.out.println("| Gross Salary        : " +grosssalary+"       |" );
        System.out.println("|====================================|");

    }

}
