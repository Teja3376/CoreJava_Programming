package com.studenttribe.corejava.strings;

public class MainPerson {

	public static void main(String[] args) {
		PersonImmutable person=new PersonImmutable("raju",30);
		System.out.println("Name: "+person.myName());
        System.out.println("Age: "+person.myAge());
        System.out.println(person);
	}

}
