package com.studenttribe.corejava.collections;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;
//import java.util.TreeSet;

//tree set is same as like HashSet
// The output will be comes in the ascending Order or the data is store in
//ascending order
public class CF06_ListIteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
//		myset.add(1);
//		myset.add(12);,
//		myset.add(98);
//		myset.add(46);
//		myset.add(28);
//		myset.add(78);
//		myset.add(100);
//		myset.add(564);
//		myset.add(100000);
//note::: if we declare capital like "S" this then the cap print first
		list.add("Charan");
		list.add("Teja");
		list.add("Science");
		list.add("Siddu");
		System.out.println(list);
		ListIterator i = list.listIterator();
		i.add("Welcome");
		i.add("Uma akka");
//		System.out.println(i);
		while (i.hasNext()) { // Next is to fetch the List
			String s = (String) i.next();
			if(s.equals("Science")) {
				
				i.remove();
				
			}
			System.out.println(s);
		}
		System.out.println("Goat");
		while(i.hasPrevious()) // to fetch the iterator
			System.out.println(i.previous());
		
	}
}
