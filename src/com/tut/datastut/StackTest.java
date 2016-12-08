package com.tut.datastut;

import java.util.Stack;

/*
 * 	A stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle. 
 * In the push-down stacks only two operations are allowed: push the item into the stack, and pop the item out of the stack.
 * push adds an item to the top of the stack, pop removes the item from the top.
 * 
 * Real time Example: 
		To reverse a word
		"undo" mechanism in text editors
		Wearing/Removing Bangles
		Browser History
		During Function Calls 

 */

public class StackTest {

	public static void main(String args[]) {
		// creating stack
		Stack<String> st = new Stack<String>();
		
		System.out.println("Elements before add: " + st);

		// populating stack
		st.push("Java");
		st.push("Source");
		st.push("code");
		
		System.out.println("Elements before remove: " + st);

		// removing top object
		System.out.println("Removed object is: " + st.pop());

		// elements after remove
		System.out.println("Elements after remove: " + st);

	}

}
