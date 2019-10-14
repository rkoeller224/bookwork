package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//the same object cannot occur more than once in a Java Set

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("hello");
        set.add("why");
        set.add("reeeee");


        for(Object object : set) {
            String element = (String) object;
            System.out.println(element);
        }

}
}
