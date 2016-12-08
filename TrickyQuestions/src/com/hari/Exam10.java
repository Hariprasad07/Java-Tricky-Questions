package com.hari;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) 
	{
        System.out.println("Enter your name :");
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		System.out.println();
		
		for(int i=0; i<name.length(); i++) 
		{
			String str = name.substring(0, (name.length()-i));
			System.out.println(str);
		}
	}
}


/*output:
	Enter your name :
		samplecodez

		samplecodez
		samplecode
		samplecod
		sampleco
		samplec
		sample
		sampl
		samp
		sam
		sa
		s
*/		