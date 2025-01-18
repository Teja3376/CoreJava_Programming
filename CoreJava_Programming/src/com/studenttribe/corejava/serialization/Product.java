
package com.studenttribe.corejava.serialization;
import java.io.Serializable;
public class Product implements Serializable {
		 private int pno;
		 private String pname;
		 private double pcost;
		public  Product(){
			 
		 }
		 public Product (int pno, String pname, double pcost) {
			 this.pno = pno;
			 this.pname = pname;
			 this.pcost = pcost;
		 }
		 public int getPno() {
			 return pno;
			 
		 }
		 public String getPname() {
			 return pname;
		 }
		 public double getPcost() {
			 return pcost;
		 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
