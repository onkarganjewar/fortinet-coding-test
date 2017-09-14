package com.fortinet.jjse.challenge.four;

/**
 * Driver class to demonstrate the singleton design pattern.
 * 
 * @author Onkar
 *
 */
public class SingletonDemo {

	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			Thread p1 = new Thread(new ThreadOne());
			Thread p2 = new Thread(new ThreadTwo());
			p2.start();
			p1.start();
			Thread p3 = new Thread(new ThreadOne());
			Thread p4 = new Thread(new ThreadTwo());
			p3.start();
			p4.start();
		}
	}

}
