//Polymorphism overloading example
package com.studenttribe.corejava.oops;

public class LoginDetails {
	public void userLogin(String username,String passcode) {
		System.out.println("User name :"+username);
		System.out.println("Passcode :"+passcode);
	}
	public void userLogin(String username,String passcode,String captcha) // Same method name different parameters 
	{
		System.out.println("User name :"+username);
		System.out.println("Passcode :"+passcode);
		System.out.println("Captcha :"+captcha);
	}
	public void userLogin(int mobileno,String passcode,String captcha)// Same method name different parameters and differ
	{
		System.out.println("Mobile no :"+mobileno);
		System.out.println("Passcode :"+passcode);
		System.out.println("Captcha :"+captcha);
	}
	public int userLogin() // Same method name return type is may or may not be same
	{
		return 100;
	}
	public String userLogin(String name) // Same method name return type is may or may not be same
	{
		return name;
	}
	public static void main(String[] args) {
	    LoginDetails login=new LoginDetails();
	    login.userLogin("Abhi","Abhi@3108");
	    login.userLogin("Abhi","Abhi@3108","abc");
	    login.userLogin(999999999,"Abhi@3108","abc");
	    int t=login.userLogin();
	    System.out.println("Return Value :"+t);
	    String myname=login.userLogin("Abhishek");
	    System.out.println("Return Name "+myname);
	}

}
