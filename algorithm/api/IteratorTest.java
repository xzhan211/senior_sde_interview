import java.util.*;
public class IteratorTest{
    public static void main(String[] args){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        Iterator<Integer> it = set.iterator();
        System.out.println(">>> " + it.next()); // 1
        while(it.hasNext()){
            System.out.println(it.next()); // 2,3,4
        }

    }
}
