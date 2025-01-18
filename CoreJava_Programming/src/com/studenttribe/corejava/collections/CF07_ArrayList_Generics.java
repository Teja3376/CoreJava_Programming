package com.studenttribe.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//import java.util.TreeSet;

//tree set is same as like HashSet
// The output will be comes in the ascending Order or the data is store in
//ascending order
public class CF07_ArrayList_Generics {
	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
//		mylist.add(10);
//		mylist.add(45.5); //Only print strings
		mylist.add("Hello");
//		mylist.add(10);
		mylist.add("India");
		System.out.println(mylist);
		Iterator i = mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(String s : mylist) {
			System.out.println(s);
		}
	}
}
