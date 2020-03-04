package homework29022020;

public class MethodWithoutParameterP3 {
    //instance method
    int a = 10;
    int b = 20;

    //main method
    public static void main(String[] args) {
        MethodWithoutParameterP3 m = new MethodWithoutParameterP3();
        m.noParameterIn();//calling instance method to main method
        MethodWithoutParameterP3.noParameterSta();

    }

    //instance method no return type and no parameter
    public void noParameterIn() {
        System.out.println(a);//printing a variable
        System.out.println(b);//printing b variable
    }

    //static method no return type and no parameter
    public static void noParameterSta() {
        MethodWithoutParameterP3 m1 = new MethodWithoutParameterP3();//object creation
        System.out.println(m1.a);//calling instance variable to static method
        System.out.println(m1.b);//calling instance variable to static method
    }






}
