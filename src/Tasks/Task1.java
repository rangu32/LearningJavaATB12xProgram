package Tasks;

public class Task1 {

    // Task #1
    //
    //Table of 5 you need to print,  (only use the printF)
    //int num = 5;
    //
    //5×1=5
    //5×2 = 10
    //….
    //5×10 =50


    public static void main(String[] args) {


        int num = 5;
        System.out.printf("%dx1=%d", num, num * 1).println();
        System.out.printf("%dx2=%d", num, num * 2).println();
        System.out.println("...");
        System.out.printf("%dx9=%d", num, num * 9).println();
        System.out.printf("%dx10=%d", num, num * 10).println();



/*  // Using For loop method1
        int number = 5;
        System.out.printf("Multiplication Table of %d:\n", number);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", number, i, number * i);
        }

 */
        /*// Using For loop method1
        for (int i = 1; i <= 10; i++) {
            System.out.printf("5 x %d = %d%n", i, 5 * i);
        }

         */
    }


}

