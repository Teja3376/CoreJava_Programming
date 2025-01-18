package com.studenttribe.corejava.collections;
//Collections
//List iterator

import java.util.ArrayList;
import java.util.Iterator;
public class CF03_ArrayListDemo {
	public static void main(String[] args) {
	ArrayList mylist = new ArrayList();
	mylist.add(1);
	mylist.add("Charan");
	mylist.add(1000);
	System.out.println(mylist);
	Iterator i = mylist.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
}

