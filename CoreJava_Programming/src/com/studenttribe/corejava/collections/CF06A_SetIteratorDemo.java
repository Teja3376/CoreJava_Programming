package com.studenttribe.corejava.collections;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;


public class CF06A_SetIteratorDemo {
	public static void main(String[] args) {
		TreeSet myset = new TreeSet();
		myset.add("Charan");
		myset.add("Teja");
		myset.add("Science");
		Iterator i = myset.iterator();
		System.out.println(myset);
		System.out.println("Hello");
		while(i.hasNext()) {
			String s = (String) i.next();
			System.out.println(s);
			if(s.equals("Science")) {
				i.remove();
			}
			System.out.println(s);
		}
//		while(i.hasPrevious()) {
//			System.out.println(i.previous());
//		}
	}
	
}
