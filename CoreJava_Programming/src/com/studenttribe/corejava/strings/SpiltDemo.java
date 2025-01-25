package com.studenttribe.corejava.strings;
public class SpiltDemo {
	   
	public static void main(String arg[]) {
		
		String str = "Java: is a powerful :programming language";
		 // Split the string by space
        String[] words = str.split(":");
                  
        for(int i = 0;i<words.length;i++)
        	  System.out.println(words[i]);    
        
        // For Each Adv loop
        for (String w : words) {
            System.out.println(w);
        } 
	}
}
