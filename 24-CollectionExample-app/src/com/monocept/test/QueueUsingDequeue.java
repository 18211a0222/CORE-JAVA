package com.monocept.test;

import com.monocept.model.Queue;

public class QueueUsingDequeue {

	public static void main(String[] args) {

		Queue<Integer> queue = new Queue<Integer>();

		System.out.println("is the queue empty : " + queue.isEmpty()); // is the queue empty : true
		System.out.println(queue.poll()); // null
		queue.addLast(1);
		queue.addLast(2);
		queue.addLast(3);
		System.out.println(queue); // Queue = [1, 2, 3]]
		queue.addLast(4);
		queue.addLast(5);
		queue.addLast(6);
		System.out.println("the polled element is : " + queue.poll()); // the polled element is : 1
		System.out.println("the size of queue is? : " + queue.size()); // the size of queue is? : 5
		System.out.println("the element at the first is : " + queue.peek()); // the element at the first is : 2
		System.out.println(queue); // Queue = [2, 3, 4, 5, 6]
		System.out.println("the polled element is : " + queue.poll()); // the polled element is : 2
		System.out.println(queue); // Queue = [3, 4, 5, 6]

	}

}
