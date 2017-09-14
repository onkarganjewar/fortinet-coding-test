package com.fortinet.jjse.challenge;

import org.junit.Test;

import com.fortinet.jjse.challenge.one.Node;
import com.fortinet.jjse.challenge.one.LinkedListMain;

import java.util.Random;

import org.junit.Assert;
import org.junit.Before;

public class LinkedListMainTest {

	LinkedListMain list = null;
	String original, reversed, reReversed;

	@Before
	public void initialize() {
		list = new LinkedListMain();
		original = "";
		reversed = "";
		reReversed = "";
	}

	@Test
	public void testReverseRandomItems() {
		Random rand = new Random();
		list.clear();
		for (int i = 0; i < 100; i++)
			list.append(rand.nextInt(10000));

		original = list.getList();
		// reverse list once
		reverseListUtil(list);
		// reverse again to compare with the original
		reverseListUtil(list);
		reReversed = list.getList();
		Assert.assertEquals(original, reReversed);
	}

	@Test
	public void testReverseCornerCases1() {
		// empty list
		list.clear();
		original = list.getList();
		reverseListUtil(list);
		reversed = list.getList();
		Assert.assertEquals(original, reversed);
		Assert.assertEquals("", original);
		Assert.assertEquals("", reversed);
		reverseListUtil(list);
		reReversed = list.getList();
		Assert.assertEquals(original, reReversed);
		Assert.assertEquals("", reReversed);
	}

	@Test
	public void testReverseCornerCases2() {
		// one element in the list
		list.clear();
		list.append(1);
		original = list.getList();
		reverseListUtil(list);
		reversed = list.getList();
		Assert.assertEquals(original, reversed);
		Assert.assertEquals("1->null", original);
		Assert.assertEquals("1->null", reversed);
		reverseListUtil(list);
		reReversed = list.getList();
		Assert.assertEquals(original, reReversed);
		Assert.assertEquals("1->null", reReversed);
	}

	@Test
	public void testReverseCornerCases3() {
		// two elements in the list
		list.clear();
		list.append(1);
		list.append(2);
		original = list.getList();
		reverseListUtil(list);
		reversed = list.getList();
		Assert.assertEquals("1->2->null", original);
		Assert.assertEquals("2->1->null", reversed);
		reverseListUtil(list);
		reReversed = list.getList();
		Assert.assertEquals(original, reReversed);
		Assert.assertEquals("1->2->null", reReversed);
	}

	@Test
	public void testReverseCornerCases4() {
		// three elements in the list
		list.clear();
		list.append(1);
		list.append(2);
		list.append(3);
		original = list.getList();
		reverseListUtil(list);
		reversed = list.getList();
		Assert.assertEquals("1->2->3->null", original);
		Assert.assertEquals("3->2->1->null", reversed);
		reverseListUtil(list);
		reReversed = list.getList();
		Assert.assertEquals(original, reReversed);
		Assert.assertEquals("1->2->3->null", reReversed);
	}

	/**
	 * @return String representation of the reversed list
	 */
	private String reverseListUtil(LinkedListMain list2) {
		Node reverseHead = list2.reverse(list2.getHead());
		list2.setHead(reverseHead);
		return list2.getList();
	}
}
