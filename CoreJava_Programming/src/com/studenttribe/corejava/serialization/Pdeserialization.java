package com.studenttribe.corejava.serialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Pdeserialization {
	
	
	public static void main(String[] args) {
		try {
			Product p = new Product();
			FileInputStream fis = new FileInputStream("C://Users//kctej//Downloads//product.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			while((p=(Product)ois.readObject())!=null) {
				System.out.println(p.getPno() +" "+p.getPname() + " " +p.getPcost());
			}
		}
		catch (Exception e) {
			System.out.println("end of file");
		}
	}
}
