import java.util.*;
public class Bitmask{
    public static void main(String[] args){
        int i = (int) Math.pow(2, 4);
        int j = (int) Math.pow(2, 5);
        // 16 -> 32
        System.out.println(">>> " + i + " : " + j);
        for(int n = i; n < j; n++){
            System.out.println(">> " + Integer.toBinaryString(n).substring(1));
        }
    }
}
