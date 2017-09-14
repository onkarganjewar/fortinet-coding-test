package com.fortinet.jjse.challenge.four;

/**
 * Using class to implement singleton design pattern.
 * 
 * @author Onkar
 */
public class SingletonClass {

	private static SingletonClass instance = null;
	private static int key;

	private SingletonClass() {
	};

	public int getNextKey() {
		return ++key;
	}

	public static SingletonClass getInstance() {
		// thread-safe
		if (instance == null) {
			// make the instance creation thread-safe
			synchronized (SingletonClass.class) {
				if (instance == null) {
					instance = new SingletonClass();
				}
			}
		}

		// not thread-safe
		// if (instance == null) {
		// instance = new SingletonClass();
		// }

		return instance;
	}
}
