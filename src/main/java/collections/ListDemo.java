package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> arr=new ArrayList<String>();
        arr.add("ryan");
        arr.add("koeller");
        arr.add("hello");
        arr.add("helloworld");
        System.out.println("you aRE " + arr.get(2));
//        for (String s: arr) {
//            System.out.println(s);
//        }
    }
}
