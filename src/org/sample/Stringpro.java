package org.sample;

public class Stringpro {
	public static void main(String[] args) {
		String str = "I am Raguvaran";
		String []s= str.split(" ");
		String revstr=" ";
		String rev=" ";
		for (int i = 0; i <=s.length-1; i++) {
			String temp =s[i];
			if (i%2 !=0) {
				for (int j = temp.length()-1; j >=0; j--) {
					rev=rev+temp.charAt(j);
				}
			}else {
				rev=temp;
				
					
				}
			revstr=revstr+" "+rev;
			rev=" ";
			
			}
		System.out.println(revstr);
			
		} 
		
	}


