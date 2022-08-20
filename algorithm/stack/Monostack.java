import java.util.*;
public class Monostack{
    public static void main(String[] args){
        int[] arr = {1,1,1,2,0,0};
        int[] nextBigger = new int[arr.length];
        Arrays.fill(nextBigger, -1);
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <  arr[i]){
                int index = stack.pop();
                nextBigger[index] = i;
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(nextBigger));
       


        stack.clear();

        int[] nextBiggerOrEqual = new int[arr.length];
        Arrays.fill(nextBiggerOrEqual, -1);
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <=  arr[i]){
                int index = stack.pop();
                nextBiggerOrEqual[index] = i;
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(nextBiggerOrEqual));


        int[] nextSmaller = new int[arr.length];
        Arrays.fill(nextSmaller, -1);

        stack.clear();
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                int index = stack.pop();
                nextSmaller[index] = i;
            }

            stack.push(i);
        }
        System.out.println(Arrays.toString(nextSmaller));


        int[] nextSmallerOrEqual = new int[arr.length];
        Arrays.fill(nextSmallerOrEqual, -1);
        stack.clear();

        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                int index = stack.pop();
                nextSmallerOrEqual[index] = i;
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(nextSmallerOrEqual));





    }
}
