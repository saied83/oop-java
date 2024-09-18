
import java.util.Arrays;
import java.util.Scanner;

public class day3 {
    public static void main(String[] args){
       // invoking function
        // Loops();
        // stringManipulation();
        ArrayManipulation();
    }
    public static void ArrayManipulation() {
        int[] arr = new int [1];
        int[] arr2 = new int [] {1, 2, 3, 4};
        int[] arr3 =  {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr3));

    }

    public static void stringManipulation() {

        char c = 'A';
        System.out.println((int)c);

        String name = "Saied";
        String locattion = new String("Dhaka");
        System.out.println(locattion.codePointAt(3));

        int number = 90;
        System.out.println((char)number);

        String name1 = new String("Saied");
        String name2 = new String("Saied");

        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        name1 = "Rahman";
        System.out.println(name1==name2);
        System.out.println(name1.equalsIgnoreCase(locattion));
        System.out.println(name1);
        System.out.println(name2);
    }

    public static void Loops(){
        // for and while loop with break and continue
        int i = 0;
        while (i < 5){
            if(i%2 == 0) {
                i++;
                continue;
            }
            System.err.println("loop number is "+i);
            i++;
        }
        for(int j=0; j <=5; j++){
            if(j == 3){
                break;
            }
            System.err.println("for loop number is "+ j);
        }
    }


    public static void ifElse(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // if else 
        // nested if else 
        if (number % 2 == 0){
            System.out.println(number+" is even");
        } else {
            System.out.println(number +" is odd");
        }
        if (number == 10){
            System.out.println(number + " is equal to 10");
        }
        else if (number > 10){
            System.out.println(number + " is greater then 10");
        }
        else {
            if(number >2){
                System.err.println(number +" is greater then 2");
            }
            System.out.println(number + " is smaller then 10");
        }
    }
}