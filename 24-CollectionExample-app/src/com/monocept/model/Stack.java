package com.monocept.model;

import java.util.Deque;
import java.util.LinkedList;

public class Stack <T> {
	
	Deque<T> deque = new LinkedList<>();

	public T pop() {
		if (deque.isEmpty())
			return null;
		else
			return deque.pop();
	}

	public void push(T value) {
		deque.addFirst(value);
	}

	public boolean isEmpty() {
		return deque.isEmpty();
	}

	public int size() {
		return deque.size();
	}

	public T top() {
		return deque.getFirst();
	}

	@Override
	public String toString() {
		return "Stack = " + deque;
	}
	
	

}
