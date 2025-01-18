package com.studenttribe.corejava.serialization;

public class EmployeeDemo1 {

	public static void main(String[] args) {
		EmployeeBean eBean = new EmployeeBean();
		
		eBean.setEno(1);
		eBean.setEname("teja");
		eBean.setEsal(10000);
		System.out.println(eBean.getEno());
		System.out.println(eBean.getEname());
		System.out.println(eBean.getEsal());
	}
}
