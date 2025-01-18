package com.studenttribe.corejava.multithreading;
//Set priorty
class MyThread2 extends Thread{
	public void run() {
		int i;
		for(i=0;i<=100;i++) {
			System.out.println(i);
		}
	}
}
public class MyThreadDemo3 {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		t1.setPriority(1);  // set Priority 10 is maximum
		t1.start();			// Set Priority 0 1 are minimum
		MyThread2 t2 = new MyThread2();
		t2.setPriority(9);	// Set Priority 5 is normal
		t2.start();
	}
}
