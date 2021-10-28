/*
    Take a integer, decimal, string & character as inputs and print them out. 
*/

import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a integer");
        int a =scan.nextInt();
        System.out.println("Enter a decimal");
        float b=scan.nextFloat();
        System.out.println("Enter  String");
        String c=scan.next();
        System.out.println("Enter a Character");
        String d=scan.next();
        char e=d.charAt(0);
        System.out.println("Integer is "+a);
        System.out.println("Decimal is "+b);
        System.out.println("String is "+c);
        System.out.println("Char is "+e);
    }
}
