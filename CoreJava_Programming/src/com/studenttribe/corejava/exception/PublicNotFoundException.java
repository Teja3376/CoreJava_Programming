package com.studenttribe.corejava.exception;

public class PublicNotFoundException extends Exception{
	PublicNotFoundException(String message ){
		System.out.println("hello:"+message);
	}
}
