package com.fortinet.jjse.challenge.one;

/**
 * Driver class for the reverse node challenge.
 * 
 * @author Onkar
 */
public class LinkedListMain {

	protected Node head = null;
	protected StringBuffer sb = new StringBuffer();

	public static void main(String[] args) {
		// intialize or build a linked list
		// init();
		// // before reversing the linked list
		// // displayList(head);
		// System.out.println(getList());
		// head = reverse(head);
		// // after reversing the linked list
		// displayList(head);
	}

	/**
	 * Appends the given node with value to the existing linked list.
	 * 
	 * @param val
	 *            Value for the new node
	 */
	public void append(int val) {
		Node node = new Node(val);
		Node temp = head;
		if (head != null) {
			// traverse to the end of the linked list
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		} else
			head = node;
	}

	/**
	 * Reverses the given linked list. <br>
	 * Time Complexity = O(n)<br>
	 * Space Complexity = O(1)
	 * 
	 * @param head
	 *            Head of the given linked list
	 * @return new head node of the reversed linked list
	 */
	public Node reverse(Node head) {
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

	/**
	 * Utility function to get the string representation of the linked list
	 * 
	 * @return String representation of the linked list
	 */
	public String getList() {
		sb.delete(0, sb.toString().length());
		if (head == null)
			return sb.toString();
		// return "null";
		// For ex. 1->2->3->null
		Node successor = head;
		do {
			sb.append(successor.value);
			sb.append("->");
		} while ((successor = successor.next) != null);
		sb.append("null");

		return sb.toString();
	}

	/**
	 * @return the head
	 */
	public Node getHead() {
		return this.head;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}

	public void clear() {
		this.head = null;
	}

	@Override
	public String toString() {
		return getList();
	}
}
