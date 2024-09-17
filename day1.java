public class day1{
    public static void main(String[] args){

        // Data types 
        byte num1 = 122;  //8-bit integer

        short num2 = 327;  //short integer

        int num3 = 78; // declare integer value

        long num4 = 189172645; // declare long type

        float num5 = 89.44f;  // declare float type

        double num6 = 233.88;  // declare double type

        char ch = 'A';  // declare charecter type

        boolean isBool = true;

        String name = "Saied";

        int [] arr = {1,2,3};

        // Printing statements 
        System.out.print("This is only print with same line cursor\n");
        System.out.println("Hello Saied");
        System.out.printf("formated string: %.2f\n", num6);

        // Operators 
        System.out.println(7/5);
        System.out.println(7.0/5);
        System.out.println(2+5);
        System.out.println(2-5);
        System.out.println(2*5);
        System.out.println(2%4.0);

        // Unary Operators 
        int a = 8;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
         a = 8;
        b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}