package com.studenttribe.corejava.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo4 {
	public static void main(String[] args) {
		TreeMap <Integer,String> sr = new TreeMap<Integer,String>();
		sr.put(101, "Raju");
		sr.put(102, "Somu");
		sr.put(104, "Beenu");
		sr.put(104, "Beenu");// Duplicates not allowed in tree map
		sr.put(103, "Ronu");
		sr.put(105, null);
		System.out.println(sr);
		System.out.println("sr(Sorted By ID)");
		for(Map.Entry<Integer, String > e: sr.entrySet() ) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
