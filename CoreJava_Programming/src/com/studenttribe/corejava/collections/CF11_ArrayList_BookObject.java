package com.studenttribe.corejava.collections;
import java.util.ArrayList;
class Books{
	String name ;
	public Books (String name) {
		this.name= name;
//		System.out.println(name);
	}
}
public class CF11_ArrayList_BookObject {
	public static void main(String[] args) {
		Books b1 = new Books("Hello");
		Books b2 = new Books("Mr");
		Books b3 = new Books("K.");
		Books b4 = new Books("Charan");
		Books b5 = new Books("Teja");
		ArrayList mylist = new ArrayList();
		mylist.add(b1);
		mylist.add(b2);
		mylist.add(b3);
		mylist.add(b4);
		mylist.add(b5);
		System.out.println(mylist);
	}
}
