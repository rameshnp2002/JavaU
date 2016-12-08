package com.tut.collection;

import java.util.HashMap;
import java.util.Iterator;

public class HashmapTest {
	public static void main(String[] args) {
		HashMap hashmap = new HashMap();
        hashmap.put("Java", 1);
        hashmap.put("Hungry" , 2);
        hashmap.put("Blogspot" , 3);
        hashmap.remove("Java");
 
        Iterator iteratorobject = hashmap.keySet().iterator(); 
        while(iteratorobject.hasNext()){
              String hashmapkey = (String) iteratorobject.next(); 
              System.out.print(hashmap.get(hashmapkey));
        } 
	}
}
