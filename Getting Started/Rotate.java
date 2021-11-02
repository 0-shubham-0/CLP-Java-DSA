
/**
 1. You are given two numbers n and k.
 You are required to rotate n, k times to the right.
 If k is positive, rotate to the right i.e.
 remove rightmost digit and make it leftmost.
 Do the reverse for negative value of k.
 Also, k can have an absolute value larger than number of digits in n.
 2. Take as input n and k.
 3. Print the rotated number.
 4. Note - Assume that the number of rotations
 will not cause leading 0's in the result. e.g. such an input will not be given
 n = 12340056 61234005 56123400 05612340
 k = 3
 r = 05612340
 I/P-> 562984
 2
 O/P-> 845629
 */

import java.util.*;

import static java.lang.Math.pow;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter rotation times");
        int r=sc.nextInt();
        int count = 0,temp=n;
        while (temp!=0){
            temp/=10;
            count++;
        }
        for (int i = 0; i <r; i++) {
            temp=n%10;
            n/=10;
            temp=temp*(int)pow(10,count-1);
            n+=temp;
        }
        if(temp==0) System.out.print(0);
        System.out.print(n);
    }
}