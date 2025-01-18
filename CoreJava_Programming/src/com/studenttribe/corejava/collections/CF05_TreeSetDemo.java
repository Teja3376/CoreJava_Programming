package com.studenttribe.corejava.collections;

import java.util.Iterator;
import java.util.TreeSet;

//tree set is same as like HashSet
// The output will be comes in the ascending Order or the data is store in
//ascending order
public class CF05_TreeSetDemo {
	public static void main(String[] args) {
		TreeSet myset = new TreeSet();
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
		myset.add("t");
		myset.add("e");
		myset.add("j");
		myset.add("a");
		myset.add("l");
		myset.add("v");
		myset.add("s");
		myset.add("r");
		myset.add("i");
		System.out.println(myset);
		Iterator i = myset.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
