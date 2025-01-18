package com.studenttribe.corejava.map;

import java.util.Hashtable;

public class HashTableDemo2 {
	public static void main(String[] args) {
		Hashtable mymap = new Hashtable();
		mymap.put(10,"Student");
		mymap.put(20,"Employee");
		mymap.put(30,"Manager");
		mymap.put(40,"HR");
		//Store in Ascending order A-Z
		System.out.println(mymap);
	}
}
