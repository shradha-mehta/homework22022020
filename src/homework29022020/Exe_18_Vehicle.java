package homework29022020;

public class Exe_18_Vehicle {
    public void run() {//instance method
        System.out.println("Vehicle is running");//printing statement
    }
}

class Bike2 extends Exe_18_Vehicle {//extending parent class to child class

    public void run() {//instance method
        System.out.println("Bike is running safely");//printing statement
    }

    public static void main(String[] args) {//main method
        Bike2 b = new Bike2();//object creation
        b.run();//calling run method
    }
}



