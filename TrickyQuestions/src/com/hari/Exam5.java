package com.hari;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) 
	{
        System.out.println("Enter n Value");
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		String count = "";
		
		System.out.println();
		
		for(int i=1; i<=n; i++) 
		{
			count = count.concat("*");
		}
		
		count = count.concat(" ");
		
		for(int i=1; i<=n; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(count);
			}
			System.out.println();
		}
	}
}


/*output:
	Enter n Value
	5

	***** 
	***** ***** 
	***** ***** ***** 
	***** ***** ***** ***** 
	***** ***** ***** ***** ***** */
