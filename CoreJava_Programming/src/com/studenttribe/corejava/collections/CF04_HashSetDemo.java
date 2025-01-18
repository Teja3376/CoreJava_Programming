package com.studenttribe.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

//Hashset iterator

public class CF04_HashSetDemo {
	public static void main(String[] args) {
		HashSet myset = new HashSet();
			myset.add(2);
			myset.add("Sri");
			myset.add(1000);
		System.out.println(myset);
		Iterator i = myset.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
	}
}
