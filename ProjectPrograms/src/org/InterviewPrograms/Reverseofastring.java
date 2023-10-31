package org.InterviewPrograms;

public class Reverseofastring {
	public static void main(String[] args) {
		
	String s ="Selenium";
	String rev="";
	for (int i =s.length()-1;i>=0; i--) {
		
		rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
	System.out.println(" ");
	
	if(s.equals(rev)) {
		System.out.println(s+ "It is a palindrome");
		
		
	}
	else {
		System.out.println(s + "It is not a palindrome");
	}
	
	}

}
