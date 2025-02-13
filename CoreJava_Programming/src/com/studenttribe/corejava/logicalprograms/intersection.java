package com.studenttribe.corejava.logicalprograms;

public class intersection {
	public static void main(String[] args) {
		int a[] = {10,20,30,40};
		int b[] = {30,40,50,60};
		int i = 0;
		for(i=0;i<4;i++) {
			for(int j=0; j<4;j++) {
			if(a[i]==b[j]) {
				System.out.println("a"+a[i]+ " b"+b[j]);
			}
			}
		}
		
	}
}
