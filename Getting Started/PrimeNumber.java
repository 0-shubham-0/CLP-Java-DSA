/*
    1. You've to check whether a given number is prime or not.
    2. Take a number "t" as input representing count of input numbers to be tested.
    3. Take a number "n" as input "t" number of times.
    4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
*/
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number of inputs");
        int t=scn.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter a number to be tested");
            int n=scn.nextInt();
            boolean flag = true;
            for (int j = 2; j < n / 2; j++) {
                if (n % j == 0) {
                    System.out.println("Is not a prime");
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("Is a prime");
        }
     }
}
