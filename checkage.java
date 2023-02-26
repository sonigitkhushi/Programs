package com.session;
import java.util.*;
public class checkage {
	
	public static void CA(int age) {
		
		if(age < 18) {
			System.out.println("you are not eligible for vote");
		}
		else {
			System.out.println("you are eligible for vote");
		}
		
	}
	
	
	
	public static void main(String args[]) {
		CA(12);
	}
	
	

}
