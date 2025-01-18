package com.studenttribe.corejava.serialization;

public class StudentBean {
	private int sno;
	private String sname;
	private String saddress;
	public void setSno(int sno){
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String tostring() {
		return sno+" "+sname+" "+saddress;	
	}
	public static void main(String[] args) {
		
	}
}
