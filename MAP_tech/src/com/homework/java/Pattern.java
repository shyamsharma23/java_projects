package com.homework.java;

public class Pattern {
	public static void main(String[] args) {
		int j;
		for(int i = 1; i<7; i++) {
			System.out.println(" ");
			for(j=1; j<=i; j++) {
				System.out.print(j);
				
			}
			if(j == 6) {
				for(int k = 6; k>=1; k--) {
					System.out.println(" ");
					for(int p=1; p<=k; p++) {
						System.out.print(p);
					}
				}
				break;
							
			}
		}
	}
}
