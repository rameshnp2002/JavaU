package com.tut.datastut;

import java.util.LinkedList;

public class GenQueueTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println("Last Itme:"+list.getLast());
		
		 while (!list.isEmpty()) {
			 System.out.println(list.poll());
		 }
	}
}
