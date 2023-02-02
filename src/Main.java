/*
In this section we will simply see how to initialize iterator interface and how to use there
method in different situation.
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(40);
        a.add(30);
        a.add(20);
        System.out.println("SIMPLY PRINTING THE VALUE :");
        Iterator<Integer> b = a.iterator();
        while (b.hasNext()){
            System.out.println(" "+ b.next());
        }
    }
}