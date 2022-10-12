package org.sample;


public class ReverseString {
	public static void main(String[] args) {
		
	
	String S = " am raguvaran";
	String reverse =("I ");
	for (int i =S.length()-1; i >=0; i--) {
		reverse = reverse+S.charAt(i);
		
		
	}
	System.out.println(reverse+"");
 

}
}