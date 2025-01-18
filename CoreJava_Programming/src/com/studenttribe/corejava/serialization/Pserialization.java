package com.studenttribe.corejava.serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Pserialization {
	
	public static void main(String[] args) {
		try {
			//FileOutputStream fos = new FileOutputStream("C:\\Users\\kctej\\Downloads\\product.docx");
//			FileOutputStream fos = new FileOutputStream("product.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\kctej\\Downloads\\product.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Product p1 = new Product(1,"Lenovo Laptop",61999);
			Product p2 = new Product(2,"Dell Laptop",58969);
			Product p3 = new Product(3,"HP Laptop",63599);
			oos.writeObject(p1);
			System.out.println("Write Object into product.txt");
			oos.close();
		}
		catch (Exception e){
			System.out.println("End of File:");
		}
	}

}
