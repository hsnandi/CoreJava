package com.collections;
//Difference between Arrays and collection is, array are fixed in size whereas collection can be grown in size. Collection also has many in-built functions
//Collection can have both heterogeneous and homogeneous types of data, whereas in Arrays only homogeneous data can be used. 
import java.util.ArrayList;
import java.util.List;

public class Heterogeneous {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(5); 
        list.add(10);
        list.add("ABC");
        list.add(new Employee(1, "EMP1"));

        System.out.println(list);
    }
}


