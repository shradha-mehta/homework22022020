package homework29022020;

class Exe_17_Animal {
    public void eat() {//instance method
        System.out.println("Eating"); }//printing statement
}
class Dog extends Exe_17_Animal{//extending parent class to child class
    public void bark(){//instance method
        System.out.println("Barking"); }//printing statement
}
class BabyDog extends Dog{//extending parent class to child class

    public void weep(){//instance method
        System.out.println("Weeping"); }//printing statement
}

class TestInheritance2 {//class to call all methods
    public static void main(String[] args) {//main method
        BabyDog b = new BabyDog();//object creation
        b.weep();//calling method
        b.bark();//calling method
        b.eat();//calling method

    }
}


