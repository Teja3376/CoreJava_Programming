package com.studenttridee.corejava.oops;


class MyInfo{
	public void myData() {
		System.out.println("Super class method MyInfo");
	}
}
public class OverridingDemo  extends MyInfo  //When inheritance used in overriding it prints super class
{                                            //When there is no Inheritance used it will print sub class
	public void myData1()
	{
		System.out.println("Sub class method overriding");
		
	}

	public static void main(String[] args) {
		OverridingDemo or=new OverridingDemo();
		or.myData();
	}

}
