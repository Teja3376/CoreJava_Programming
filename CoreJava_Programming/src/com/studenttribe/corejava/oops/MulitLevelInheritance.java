package com.studenttribe.corejava.oops;

class MyPerson {
	public void PersonInfo() {
		System.out.println("Teja");
	}
}
class PersonDetails extends MyPerson{
	public void PersonLocation() {
		System.out.println("Hyderabad");
	}
}
public class MulitLevelInheritance extends PersonDetails{
	public static void main(String[] args) {
		MulitLevelInheritance mli = new MulitLevelInheritance();
		mli.PersonInfo();
		mli.PersonLocation();
	}
}