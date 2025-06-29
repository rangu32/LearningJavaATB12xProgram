package ex_26_Collection_Framework.LIST;

import java.util.Vector;

public class Lab229_Vector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("Promod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));
    }
}
