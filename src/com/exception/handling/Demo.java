package com.exception.handling;

public class Demo {
	public static void main(String[]args) {
		try {
			throw new Sample("This is wrong input");
			
		}catch(Exception e) {
			//System.out.println(e);
			 //e.getMessage();
			e.printStackTrace();
		}
	}

}
