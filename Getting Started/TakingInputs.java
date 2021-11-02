import java.util.*;

/*
    Take a integer, decimal, string & character as inputs and print them out. 
*/

public class TakingInputs {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int number = sc.nextInt();
        System.out.println("Type a number with decimal");
        float decimal = sc.nextFloat();
        System.out.println("Type a character");
        String st = sc.nextLine();

        System.out.println(number);
        System.out.println(decimal);
        System.out.println(st);
    }
}