package com.studenttribe.corejava.serialization;

public class StudentDemo1 {

	public static void main(String[] args) {
		StudentBean sBean = new StudentBean();
		sBean.setSno(359);
		sBean.setSname("K.CharanTeja");
		sBean.setSaddress("Hyderabad");
		System.out.println(sBean.tostring());
	}

}

