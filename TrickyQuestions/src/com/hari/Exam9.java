package com.hari;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
        System.out.println("Enter your name :");
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		System.out.println();
		
		for(int i=0; i<name.length(); i++) 
		{
			String str = name.substring(0, (i+1));
			System.out.println(str);
		}
	}
}

/*output:
	Enter your name :
		Balaji

		B
		Ba
		Bal
		Bala
		Balaj
		Balaji
*/		