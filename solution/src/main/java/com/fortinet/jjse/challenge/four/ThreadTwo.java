/**
 * 
 */
package com.fortinet.jjse.challenge.four;

/**
 * @author Onkar
 *
 */
public class ThreadTwo implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.print(SingletonEnum.getInstance().getNextKey() + " ");
		// System.out.println(SingletonClass.getInstance().getNextKey() + " ");
	}

}
