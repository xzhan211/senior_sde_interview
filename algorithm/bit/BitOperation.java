import java.util.*;
public class BitOperation{
    public static void main(String[] args){
        int n = 13;
        System.out.println(">> " + Integer.toBinaryString(n));
        for(int i=0; i<4; i++){
            System.out.println(n >> i & 1);
        }

        System.out.println("-----");
        int m = 0;
        for(int i=0; i<4; i++){
            System.out.println(m | 1<< i);
        }
        System.out.println("-----");
        int k = 0;
        k |= 1 << 1;
        System.out.println("set the 2ed bit of k to 1: " + k);
        k ^= 1 << 1; //Exclusive or
        System.out.println("set the 2ed bit of k to 0: " + k);
    }
}
