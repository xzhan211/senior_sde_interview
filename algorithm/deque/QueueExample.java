import java.util.*;
public class QueueExample{
    public static void main(String[] args){
        Deque<Integer> queue = new LinkedList<>();
        for(int i=1; i<=10; i++){
            queue.add(i);
        }
        System.out.println(queue.toString());
        System.out.println(">> peek : " + queue.peek());
        System.out.println(">> poll : " + queue.poll());
        System.out.println(">> poll : " + queue.poll());
        System.out.println(">> poll : " + queue.poll());
        queue.push(100);
        System.out.println(queue.toString());
        queue.pop();
        System.out.println(queue.toString());
    }
}
