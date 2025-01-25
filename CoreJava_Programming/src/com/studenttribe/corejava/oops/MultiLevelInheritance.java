package com.studenttridee.corejava.oops;
//MultipleInheritance
class Myperson
{	   public void personInfo() {
		   System.out.println("Rajesh");
 
	   }
}
class PersonDetails  extends Myperson{
 	public void personData() {
 		System.out.println("Hyderabad");
 	}
 }
public class MultiLevelInheritance extends PersonDetails {
	public void show() {
		System.out.println("Person FullDetails: ");
	}
	public static void main(String[] args) {
		MultiLevelInheritance mi=new MultiLevelInheritance();
		mi.show();
		mi.personInfo();
		mi.personData();
		
	}
}
