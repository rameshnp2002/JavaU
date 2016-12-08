package com.tut.collection;

import java.util.Collections;
import java.util.Vector;

public class CollectionTest {

	public static void getMaxMinElement() {
		Vector v = new Vector();
		v.add(new Double("3.4324"));
		v.add(new Double("3.3532"));
		v.add(new Double("3.342"));
		v.add(new Double("3.349"));
		v.add(new Double("2.3"));
		Object obj = Collections.max(v);
		System.out.println("The max element is:" + obj);
		
		obj = Collections.min(v);
		System.out.println("The min element is:" + obj);
	}
	
	public static void binaySearchTest() {
		
		 Vector v = new Vector();
	      v.add("X");
	      v.add("M");
	      v.add("D");
	      v.add("A");
	      v.add("O");
	      System.out.println("Before Sort :" + v);
	      int index = Collections.binarySearch(v, "D");
	      System.out.println("Before Sort Element found at : " + index);
	      Collections.sort(v);
	      System.out.println("After Sort :" +v);
	      index = Collections.binarySearch(v, "D");
	      System.out.println("Element found at : " + index);
		
	}

	public static void main(String[] args) {
		getMaxMinElement();
		binaySearchTest();
	}

}
