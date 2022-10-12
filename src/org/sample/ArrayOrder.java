package org.sample;

public class ArrayOrder {
	public static void main(String[] args) {
		int[]a= {1,0,2,0,3,0,4,0,4};
		int b=a.length -1;
		
		for (int i = a.length-1;i>=0;i--) {
			if (a[i]!=0) {
				a[b]=a[i];
				b--;
				}
			}
		while (b>=0) {
			a[b]=0;
			b--;
			}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"");
		}
	}

}
