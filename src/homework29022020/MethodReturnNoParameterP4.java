package homework29022020;

public class MethodReturnNoParameterP4 {
        //main method
        public static void main(String[] args) {
            MethodReturnNoParameterP4 m = new MethodReturnNoParameterP4();//object creation
            //System.out.println(m.methodReturnNoPara());
            int score = m.methodReturnNoPara();//int data types
            System.out.println(score);//printing statement
            //System.out.println(m.methodReturnNoParam());
            String fullName = m.methodReturnNoParam();//String data types
            System.out.println(fullName);//printing statement
        }

    //int type method and no return type
    public int methodReturnNoPara() {
        int x = 10;//local variable
        int y = 20;//local variable
        int score;//addition of local variable
        score = x + y;
        return score;//total addition of local variable which return types
    }

    //String type method and no return type
    public String methodReturnNoParam() {
        String name = "Pruv";// String data type local variable
        String surName = "Patel";//String data type local variable
        String fullName;//full name printing
        fullName = name + " " + "" + surName;
        return fullName;//returning full name
    }


}





