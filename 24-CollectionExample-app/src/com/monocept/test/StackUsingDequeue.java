package com.monocept.test;

import com.monocept.model.Stack;

public class StackUsingDequeue {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		System.out.println("is the stack empty? : " + stack.isEmpty()); // is the stack empty? : true
		System.out.println(stack.pop()); // null
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println(stack); // Stack = [c, b, a]
		stack.push("d");
		stack.push("e");
		stack.push("f");
		System.out.println("the popped element is : " + stack.pop()); // the popped element is : f
		System.out.println("is the stack empty? : " + stack.isEmpty()); // is the stack empty? : false
		System.out.println("the number of elements in the stack are : " + stack.size()); // the number of elements in the stack are : 5
		System.out.println("the element at the top is : " + stack.top()); // the element at the top is : e
		System.out.println(stack); // Stack = [e, d, c, b, a]
		System.out.println("the popped element is : " + stack.pop()); // the popped element is : e
		System.out.println(stack); // Stack = [d, c, b, a]

	}

}
