package com.studenttridee.corejava.oops;
public class MethodFlows {
	 //1.	No Parameters with No Return Values
	public void  myData() {
		 System.out.println("1.	No Parameters with No Return Values");
	}
   //2.	Parameters with No Return Values
	
	public void myAddition(int a,int b) {
		System.out.println("Addition :"+(a+b));
	}
	//3.	Parameters with Return Values
	public int  myMul(int a,int b) {
		  return (a*b);
	}
	//4.	No Parameters with   Return Values
	public int  add() {
		  int a=10,b=20;
		  return (a+b); }	
	public String myJob() {
		return "Software";
	}
	public static void main(String[] args) {		
		MethodFlows flow=new MethodFlows();
		flow.myData();
		int t1=10,t2=20;
		flow.myAddition(t1, t2);
		int k=flow.myMul(3, 3);
		System.out.println("return value k is :"+k);		
		int t=flow.add();
		System.out.println("return value t is :"+t);
		String job=flow.myJob();
		System.out.println(job);
	}

}