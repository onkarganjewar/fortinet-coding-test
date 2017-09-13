package com.fortinet.jjse.challenge.one;

/**
 * Driver class for the reverse node challenge.
 * 
 * @author Onkar
 */
public class NodeMain {

	public static void main(String[] args) {
		// intialize or build a linked list
		Node head = init();
		// before reversing the linked list
		displayList(head);
		head = reverse(head);
		// after reversing the linked list
		displayList(head);
	}

	/**
	 * Utility method to display a linked list
	 * 
	 * @param head
	 */
	private static void displayList(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.value + "->");
			curr = curr.next;
			if (curr == null)
				System.out.print("null");
		}
		// line separator
		System.out.println();
	}

	private static Node init() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = null;

		return n1;
	}

	/**
	 * Reverses the given linked list
	 * 
	 * @param head
	 *            Head of the given linked list
	 * @return new head node of the reversed linked list
	 */
	public static Node reverse(Node head) {
		// base case
		// if head is null or only one node, it's reverse of itself.
		if (head == null || head.next == null)
			return head;

		Node curr = head, prev = null, next = null;
		while (curr != null) {
			// store the link to the next node
			next = curr.next;
			// set the next of current to previous node
			curr.next = prev;
			// store the current node as previous for next iteration
			prev = curr;
			// forward the linked list
			curr = next;
		}
		// at the end the prev pointer holds the reference of a new head
		head = prev;

		// return new head of the linked list
		return head;
	}
}
