package homework20022020;


import java.util.Arrays;
public class Exe_16 {
    public static void main(String[] args) {//main method
        Exe_16 sa = new Exe_16();//object creation
        sa.arrayString();
    }


    public void arrayString() {//instance method
        int[] arrays = {1888, 1895, 1865, 1700, 1600, 1500, 1650};//numeric numbers

        String[] arrays1 = {//strings
                "Srinavas", "Bhavesh", "Ankitaben", "Chaitanyabhai", "Shraddhaben", "Lamee", "Pradip"};


        System.out.println("Original numeric array : " + Arrays.toString(arrays));//original string
        Arrays.sort(arrays);
        System.out.println("Sorted numeric array : " + Arrays.toString(arrays));//sorted numeric arrays

        System.out.println("Original string array : " + Arrays.toString(arrays1));//original strings
        Arrays.sort(arrays1);
        System.out.println("Sorted string array : " + Arrays.toString(arrays1));//sorted strings


    }




}


