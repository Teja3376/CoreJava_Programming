package com.studenttribe.corejava.collections;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;

public class CF08_ArrayList_Generics {
	public static void main(String[] args) {
		HashSet<Integer> myset = new HashSet<Integer>();
		myset.add(10);
//		myset.add(45.5); //Only print strings
//		myset.add("Hello");
		myset.add(10);
//		myset.add("India");
		System.out.println(myset);
		Iterator i = myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(Integer i1 : myset) {
			System.out.println(i1);
		}
	}
}
