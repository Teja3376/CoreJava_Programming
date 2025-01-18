package com.studenttribe.corejava.serialization;

public class ProductDemo1 {

	public static void main(String[] args) {
		ProductBean pBeam = new ProductBean(10,"teja",65000);
		System.out.println(pBeam.getPno());
		System.out.println(pBeam.getPname());
		System.out.println(pBeam.getPrice());
	}
}
