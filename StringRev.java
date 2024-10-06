package com.str.ex;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		
		System.out.println("Enter String");
		
	    Scanner sc = new Scanner(System.in);
	
	    String s = sc.nextLine();
	    
	    //suchitra khandale
	    
	  String str[] = s.split("");
	  String rev ="";
	  

	  for(int i=str.length-1; i>=0;i--)
	  {
		 rev = rev+str[i];
	  }
	  
	  System.out.println(rev);
	

	}

}
