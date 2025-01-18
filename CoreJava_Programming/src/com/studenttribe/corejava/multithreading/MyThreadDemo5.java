package com.studenttribe.corejava.multithreading;

public class MyThreadDemo5 implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + "is running" + i);
		try {
			Thread.sleep(500);//500ms
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	}
	public static void main(String[] args) {
		MyThreadDemo5 t1 =  new MyThreadDemo5();
		Thread t2 = new Thread(t1); // we must write the Thread 
		Thread t3 = new Thread(t1);
		t2.start();					//for runnable implementation
		t3.start();
	}
}
