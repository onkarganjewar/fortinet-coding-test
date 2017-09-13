package com.fortinet.jjse.challenge.one;

/**
 * Class representing the structure of a node.
 * 
 * @author Onkar
 */
public class Node {
	Node next;
	int value;

	public Node(int val) {
		super();
		this.value = val;
		this.next = null;
	}
}
