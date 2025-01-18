package com.studenttribe.corejava.multithreading;
//Sleep method using

public class MyThreadDemo4 extends Thread {
	public void run() {
		for (int i = 0; i<=6;i++) {
			System.out.println(Thread.currentThread().getName()+ "is running "+i);
		
		try {
			Thread.sleep(500);//500ms 
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	}
	public static void main(String[] args) {
		MyThreadDemo4 t1 = new MyThreadDemo4();
		t1.start();
		MyThreadDemo4 t2 = new MyThreadDemo4();
		t2.start();
	}
}
