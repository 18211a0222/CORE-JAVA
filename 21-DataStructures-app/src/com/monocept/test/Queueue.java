package com.monocept.test;

import java.util.Deque;
import java.util.LinkedList;

public class Queueue {

	public static void main(String[] args) {

		Deque<Integer> q = new LinkedList<>();
		q.add(1);

		q.addFirst(2);

		q.addLast(3);

		System.out.println(q + "\n");

		System.out.println(q.getFirst() + "\n");

		q.push(4);
		System.out.println(q + "\n");

		q.removeFirst();
		q.removeLast();

		System.out.println(q + "\n");

		System.out.println(q.pop());

		System.out.println(q.poll());

		System.out.println(q + "\n");

		System.out.println(q.peek());

		System.out.println(q + "\n");

		System.out.println(q.pollFirst());

		System.out.println(q.pollLast());

		System.out.println(q + "\n");

	}

}
