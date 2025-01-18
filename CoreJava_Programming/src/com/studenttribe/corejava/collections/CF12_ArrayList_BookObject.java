package com.studenttribe.corejava.collections;
import java.util.ArrayList;
class Books1{
	String name ;
	public Books1 (String name) {
		this.name= name;
//		System.out.println(name);
	}
	public String toString() {
		return name; 
	}
}
public class CF12_ArrayList_BookObject {
	public static void main(String[] args) {
		Books1 b1 = new Books1("Hello");
		Books1 b2 = new Books1("Mr");
		Books1 b3 = new Books1("K.");
		Books1 b4 = new Books1("Charan");
		Books1 b5 = new Books1("Teja");
		ArrayList mylist = new ArrayList();
		mylist.add(b1);
		mylist.add(b2);
		mylist.add(b3);
		mylist.add(b4);
		mylist.add(b5);
		System.out.println(mylist);
	}
}
