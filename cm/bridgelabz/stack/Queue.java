package cm.bridgelabz.stack;

import java.util.LinkedList;

public class Queue {
	LinkedList list = new LinkedList();

	public void enQueue(Object data) {
		list.addLast(data);
	}

	public void deQueue() {
		list.deleteFirst();
	}

	public void display() {
		list.display();
	}

}