import java.util.*;
public class BitManipulation{
    public static void main(String[] args){
        char a = 'a';
        char A = 'A';

        System.out.println("a: " + Integer.toBinaryString(a));
        System.out.println("A: " + Integer.toBinaryString(A));
        System.out.println("space: " + Integer.toBinaryString(' '));
        System.out.println("_: " + Integer.toBinaryString('_'));

        
        System.out.println("***** to lower case ***********");
        System.out.println("a | space >> " + (char)(a | ' ' ));
        System.out.println("A | space >> " + (char)(A | ' ' ));
        System.out.println("A + space >> " + (char)(A + ' ' ));

        System.out.println("***** to upper case ***********");
        System.out.println("a & _ >> " + (char)(a & '_' ));
        System.out.println("A & _ >> " + (char)(A & '_' ));
        System.out.println("a - space >> " + (char)(a - ' ' ));

        System.out.println("***** switch case type ***********");
        System.out.println("a ^ space >> " + (char)(a ^ ' ' ));
        System.out.println("A ^ space >> " + (char)(A ^ ' ' ));

        System.out.println("***** 1's complement, 2's complement ***********");
        System.out.println("1234: " + Integer.toBinaryString(1234));
        System.out.println("-1234: " + Integer.toBinaryString(-1234));

        System.out.println("***** check whether 2 numbers have the same sign ***********");
        int i = 2;
        int j = -3;
        int k = 5;
        System.out.println("i, j have the same sign? >> " + ((i ^ j) > 0));
        System.out.println("i, k have the same sign? >> " + ((i ^ k) > 0));
        
        System.out.println("***** swith 2 number ***********");
        int x = 10;
        int y = -20;
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("x: " + x + " --- y: " + y);
        
        System.out.println("***** remove the last 1 in binary ***********");
        int n = 10;
        int m = n & (n - 1);
        System.out.println("n: " + Integer.toBinaryString(n) + " --- m: " + Integer.toBinaryString(m));
    }
}
