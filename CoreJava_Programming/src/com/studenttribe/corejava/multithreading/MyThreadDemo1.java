package com.studenttribe.corejava.multithreading;
class Mythread extends Thread{
	public void run() {
		int i ;
		for(i=0;i<=100;i++)
			System.out.println(i);
	}
}

public class MyThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t1 = new Mythread();
		t1.start();
		Mythread t2 = new Mythread();
		t2.start();
	}
}

