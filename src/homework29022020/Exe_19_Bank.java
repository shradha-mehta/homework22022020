package homework29022020;

public class Exe_19_Bank {
    public int getRateOfInterest() {//method with int data type
        return 0;//return type
    }
}

class SBI extends Exe_19_Bank {//extends parent class to child class

    public int getRateOfInterest() {//method with int data type
        return 8;//return type
    }
}

class ICICI extends Exe_19_Bank {//extends parent class to child class

    public int getRateOfInterest() {//method with int data type
        return 7;//return type
    }
}

class AXIS extends Exe_19_Bank {//extends parent class to child class

    public int getRateOfInterest() {//method with int data types
        return 9;//return type
    }
}

class Test2 {//class

    public static void main(String[] args) {//main method
        SBI s = new SBI();//object creation
        ICICI i = new ICICI();//object creation
        AXIS a = new AXIS();//object creation
        System.out.println("SBI Rate of interest: " + s.getRateOfInterest());//printing statement
        System.out.println("ICICI Rate of interest: " + i.getRateOfInterest());//printing statement
        System.out.println("AXIS Rate of interest: " + a.getRateOfInterest());//printing statement
    }
}


