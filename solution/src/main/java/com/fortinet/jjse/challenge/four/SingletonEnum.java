package com.fortinet.jjse.challenge.four;

/**
 * Using enum to implement Singleton design pattern.
 * 
 * @author Onkar
 */
public enum SingletonEnum implements ISingleton {

	/**
	 * The one and only instance of the singleton and it is thread-safe.
	 */
	INSTANCE {
		@Override
		public int getNextKey() {
			return ++key;
		}
	};

	private static int key;

	public static ISingleton getInstance() {
		return SingletonEnum.INSTANCE;
	}
}