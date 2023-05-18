// import java.util.Deque;
import java.util.*;
// import java.util.LinkedList;

public class prebuiltDeque {
    public static void main(String[] args) {
        Deque<Integer> d1 = new LinkedList<>() ; 
        d1.addFirst(1);
        d1.addLast(2);
        d1.add(3) ; 
        System.out.println(d1);

        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());


        d1.removeFirst();
        d1.removeLast();
        d1.removeFirstOccurrence(2);
        d1.removeLastOccurrence(3) ; 
        d1.removeAll(d1) ;
    }
    
}
