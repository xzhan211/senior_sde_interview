import java.util.*;
public class Compare{
    public static void main(String[] args) {
        System.out.println("hello");

        Student s1 = new Student("Tom", 15);
        Student s2 = new Student("Mike", 17);
        Student s3 = new Student("Asa", 10);
        Student s4 = new Student("Jack", 50);
        Student s5 = new Student("Sally", 7);
        Student s6 = new Student("Peter", 15);
        Student s7 = new Student("Jeff", 25);
        Student s8 = new Student("Apple", 15);
        
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);

        // ------- implementation 1

        // from the youngest to the oldest
        //Collections.sort(list, (a, b) -> a.getAge() - b.getAge());
       
        // compare age first, from the youngest to the oldest. If age is the same, compare names, sort lexicographically        
        //Collections.sort(list, (a, b) -> a.getAge() !=  b.getAge() ? a.getAge() - b.getAge() : a.getName().compareTo(b.getName()));


        // ------- implementation 2
        Collections.sort(list);

        
        // ------- implementation 3
        //Collections.sort(list, new MyComparator());

        for(Student s : list) {
            System.out.println(s);
        }

        // ------- implementation 2.5, once we let Student class implement Comparable interface, we can use priority queue directly with an explicited comparison
        // for priority queue, T:O(1) -- get the max/min element,  O(lgn) -- maintain the queue

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);
        pq.add(s5);
        pq.add(s6);
        pq.add(s7);
        pq.add(s8);
        while(!pq.isEmpty()){
            System.out.println(">>> " + pq.poll().toString());

        }
    }
}

class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b){
        if(a.getAge() != b.getAge()){
            return a.getAge() - b.getAge();
        }else {
            return a.getName().compareTo(b.getName());
        }
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return name + " --- " + age;
    }

    // the original definition is: Compares two strings lexicographically.
    @Override
    public int compareTo(Student s){
        if(this.age != s.getAge()) {
            return this.age - s.getAge();
        }else {
            return this.name.compareTo(s.getName());
        }
    }
}
