package com.studenttribe.corejava.serialization;
import java.io.Serializable;
public class EmployeeBean implements Serializable{
	private int eno;
	private String ename;
	private double esal;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	

}
