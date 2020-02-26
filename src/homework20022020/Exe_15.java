package homework20022020;

public class Exe_15 {
    /*Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
    The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.
    Write the following methods (instance methods):
            * Method named getWidth without any parameters, it needs to return the value of width field.
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
            * Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
            * Method named getArea without any parameters, it needs to return the area of the wall.
            TEST EXAMPLE
→ TEST CODE: (Write bellow code into main method and run and compare result with OUTPUT)
    Wall wall = new Wall (5, 4);
 System.out.println("area= " + wall.getArea());
 wall.setHeight(-1.5);
 System.out.println("width= " + wall.getWidth());
 System.out.println("height= " + wall.getHeight());
 System.out.println("area= " + wall.getArea());
→ OUTPUT:
    area= 20.0
    width= 5.0
    height= 0.0
    area= 0.0
    NOTE: All methods should be defined as public NOT public static.
    NOTE: In total, you have to write 5 methods and 2 constructors.
     */

    double width;// instance variable
    double height;//instance variable


    Exe_15() {//constructor without parameter

        System.out.println();//printing statement
    }

    Exe_15(double width, double height) {//constructor with parameter

        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;

    }

    public static void main(String[] args) {//main method

        Exe_15 exe15 = new Exe_15(5, 4);//object with parameters in constructor
        System.out.println("area = " + exe15.getAreaWithoutAnyParameters());//printing statement
        exe15.setHeightWithOneParameter(-1.5);//calling method
        System.out.println("width = " + exe15.getWidthWithoutAnyParameters());//calling method
        System.out.println("height = " + exe15.getHeightWithoutAnyParameters());//calling method
        System.out.println("area = " + exe15.getAreaWithoutAnyParameters());//calling method

    }

    public double getWidthWithoutAnyParameters() {//created instance method
        return width;//returning value

    }

    public double getHeightWithoutAnyParameters() {// instance method without any parameter with data type double
        return height;

    }

    public void setWidthWithOneParameter(double width) {//instance method
        if (width < 0) {
            width = 0;
        }
        this.width = 0;
    }


    public void setHeightWithOneParameter(double height) {//declaring instance method with one parameters
        if (height < 0) {
            height = 0.0;
        }
        this.height = height;

    }

    public double getAreaWithoutAnyParameters() {//data type double with instance variable no parameters
        return getWidthWithoutAnyParameters() * getHeightWithoutAnyParameters();

    }


}
