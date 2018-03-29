package com.sdettraining.day08;

public class Lock {
	public static void main(String[] args) {
		final Account resource1 = new Account(22323);
		final Account resource2 = new Account(333);
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				// Lock resource 1
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1.updating the balance");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2.updating the balance ");
				}
				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2 locked resource. updating the balance ");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
					synchronized (resource1) {
						System.out.println("Thread 2: locked resource.updating the balance ");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}