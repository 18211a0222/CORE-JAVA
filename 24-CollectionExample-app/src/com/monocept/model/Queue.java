package com.monocept.model;

import java.util.Deque;
import java.util.LinkedList;

public class Queue<T> {
	
	Deque<T> deque = new LinkedList<>();

	public T poll() {
		if (deque.isEmpty())
			return null;
		else
			return deque.poll();
	}

	public void addLast(T value) {
		deque.addLast(value);
	}

	public boolean isEmpty() {
		return deque.isEmpty();
	}

	public int size() {
		return deque.size();
	}

	public T peek() {
		return deque.peek();
	}

	@Override
	public String toString() {
		return "Queue = " + deque;
	}

}
