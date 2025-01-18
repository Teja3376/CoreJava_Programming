package com.studenttribe.corejava.multithreading;

//Runnable is a interface 
class MyClass implements Runnable{
	public void run() {
		int i;
		for(i=0;i<=100;i++) {
			System.out.println(i);
		}
	}
}

public class MyThreadDemo2 {

	public static void main(String[] args) {
		MyClass mt = new MyClass();
		//Thread is predefined
		Thread t2 = new Thread(mt);
			t2.start();

	}

}

//Logic t2.start>>mt>>My class>>run>>for>>condition
