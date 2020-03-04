package homework29022020;

public class MethodReturnWithParaP2 {

    public static void main(String[] args) {
        MethodReturnWithParaP2 p = new MethodReturnWithParaP2();//object creation
        //System.out.println(p.MethodReturnWithPar(10,20));//printing statement
        int sub = p.MethodReturnWithPar(10, 20);//passing parameter
        System.out.println(sub);//printing statement

        //System.out.println(p.MethodReturnWithParam("Pruv", "Patel"));//printing statement
        String fullName = p.MethodReturnWithParam("Pruv", "Patel");//passing parameter
        System.out.println(fullName);//printing statement
    }

    //return type int method with 2 parameter
    public int MethodReturnWithPar(int a, int b) {
        int sub;//total addition of sum
        sub = a + b;//addition sub
        return sub;//returning sub
    }

    // return type string method with 2 parameter
    public String MethodReturnWithParam(String Pruv, String Patel) {
        String fullName;//joining 2 name reference
        fullName = Pruv + " " + Patel; // joining 2 name
        return fullName;//returning full name
    }


}
