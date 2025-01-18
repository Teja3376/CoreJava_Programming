package com.studenttribe.corejava.collections;

import java.util.LinkedList;

//Linked list connects the data in chain form
public class CF09_LinkedListDemo {
	public static void main(String[] args) {
		LinkedList mylist = new LinkedList();
		mylist.add("TATA");
		mylist.add("BMV");
		mylist.add("Volvo");
		mylist.add("Maruthi");
		mylist.add("Safari");
		mylist.remove(4); //That means remove from index
		System.out.println(mylist);
		mylist.clear();
		System.out.println(mylist);
	}
}
