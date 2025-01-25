package com.studenttribe.corejava.oops;

public class OverloadingExample {
	public void Info(String fn,String ln) {
		System.out.println("First Name :"+fn);
		System.out.println("Last Name :"+ln);
	}
	public void Edu(String hdegree,int avg , int passout) // Same method name different parameters 
	{
		System.out.println("Highest Degree :"+hdegree);
		System.out.println("Percentage :"+avg);
		System.out.println("Graduation :"+passout);
	}
	public void personalInfo(int mobileno,String gender,String city)// Same method name different parameters and differ
	{
		System.out.println("Mobile no :"+mobileno);
		System.out.println("Gender :"+gender);
		System.out.println("City :"+city);
	}

	public static void main(String[] args) {
	    OverloadingExample login=new OverloadingExample();
	    login.Info("Abhishek","Godi");
	    login.Edu("Btech",75,2024);
	    login.personalInfo(999999999,"Male","Hyd");
	   
}
}
