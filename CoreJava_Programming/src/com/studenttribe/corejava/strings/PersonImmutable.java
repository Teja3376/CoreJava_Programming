package com.studenttribe.corejava.strings;

public final class PersonImmutable {
	private final String name ;
	private final int age;
//constructor to initialize the final 
    public PersonImmutable(String name,int age) {
		this.name = name;
		this.age=age;
    	
    }
    public String myName() {
    	return name;
    }
    public int myAge() {
    	return age;
    }
    public String toString() {
    	return name+age;
    	
    }
    	
	public static void main(String[] args) {
		

	}

}
