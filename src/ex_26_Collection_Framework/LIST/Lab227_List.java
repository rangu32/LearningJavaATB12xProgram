package ex_26_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List {

    public static void main(String[] args) {
        List fruits= List.of("Orange", "Apple", "Watermelon", "mango", "guavo");
        System.out.println(fruits);
        System.out.println("------------------------------------------");
        List arrayList = new ArrayList<>();
        arrayList.add("pramod");
        arrayList.add(null);
        arrayList.add("dutta");
        arrayList.add("dutta"); // Duplicate is allowed.
        arrayList.add(123); // Different data type is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());


    }
}
