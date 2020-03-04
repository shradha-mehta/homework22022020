package homework29022020;
/*
Example of Constructor overloading
 */

//java program to overload constructor


public class Exe_20_Student5 {
    int id;
    String name;
    int age;

    //creating two argument constructor
    Exe_20_Student5(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arguments constructor

    Exe_20_Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + "" + name + "" + age);
    }

    public static void main(String[] args) {
        Exe_20_Student5 s1 = new Exe_20_Student5(111, "Karan");
        Exe_20_Student5 s2 = new Exe_20_Student5(222, "Aryan", 25);
        s1.display();
        s2.display();

    }

}
