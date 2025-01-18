package com.studenttribe.corejava.strings;
import java.lang.StringBuilder;
public class StringBuliderClasses {
	
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Hello"); 
	System.out.println(sb);
	//append 
	sb = sb.append(" Java");
	System.out.println("Append :" +sb);
	//insert,replace,delete,reverse
	sb = sb.insert(5," Programmer Welcome To");
	System.out.println("Inserted :" +sb);
	//replace
	sb = sb.replace(0,5,"Hey");
	System.out.println("Replace :" +sb);
	System.out.println(sb.length());
	//delete
	sb = sb.delete(0,3);
	System.out.println("Deletion: " +sb);
	//reverse
	System.out.println("Reverse: " +sb.reverse());
}
}
