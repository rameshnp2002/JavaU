package com.tut.collection;

import java.util.LinkedList;

public class LinkedListTest {
	// get the first and the last element of a linked list
	public static void getLastFirst(){
		LinkedList<String> lList = new LinkedList<String>();
	      lList.add("100");
	      lList.add("200");
	      lList.add("300");
	      lList.add("400");
	      lList.add("500");
	      System.out.println("First element of LinkedList is : " + lList.getFirst());
	      System.out.println("Last element of LinkedList is :  " + lList.getLast());
	}
	
	public static void delElement()
	{
			LinkedList<String> lList = new LinkedList<String>();
	      lList.add("1");
	      lList.add("8");
	      lList.add("6");
	      lList.add("4");
	      lList.add("5");
	      System.out.println(lList);
	      lList.subList(2, 3).clear();
	      System.out.println(lList);
	      lList = new LinkedList<String>();
	      lList.add("1");
	      lList.add("8");
	      lList.add("6");
	      lList.add("4");
	      lList.add("5");
	      lList.subList(2, 4).clear();
	      System.out.println(lList);
	}
	public static void main(String[] args) {
		getLastFirst();
		delElement();
	}
}
