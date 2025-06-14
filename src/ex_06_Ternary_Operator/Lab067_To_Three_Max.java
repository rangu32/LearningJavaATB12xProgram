package ex_06_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {
        int n1=12;
        int n2=900;
        int n3=-1100;

        // Logic Building Formula
// Step 1 ->  Find the inputs and outputs data type
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number

        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 -> n1
        // n2 > n3 && n2 > n1 -> n2
        // n3

        // Step 3 - Dry run program
        //                 exp true               :       exp false
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println(max);


    }


}
