package com.studenttribe.corejava.map;

import java.util.HashMap;

public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<String,String> cc = new HashMap<String,String>();
		cc.put("India","Delhi");
		cc.put("USA","DC");
		cc.put("Germany","Berlin");
		System.out.println(cc.get("India"));
		for(String s : cc.keySet()) {
			System.out.println(s);
		}
	}
}
