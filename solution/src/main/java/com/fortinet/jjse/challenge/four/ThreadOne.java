package com.fortinet.jjse.challenge.four;

/**
 * @author Onkar
 */
public class ThreadOne implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.print(SingletonEnum.getInstance().getNextKey() + " ");
		// System.out.println(SingletonClass.getInstance().getNextKey() + " ");
		// System.out.print(PrimaryKeyGenerator.instance.getNext()+" "); // For
		// Singleton 3 and Singleton 7
	}

}
