package com.hari;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) 
	{
        System.out.println("Enter n Value :");
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int temp = n;
		
		System.out.println();
		
		for(int i=1; i<=temp; i++) 
		{
			for(int space=1; space<=n; space++) 
			{
				System.out.print(" ");
			}
			for(int star=1; star<=i; star++) 
			{
				System.out.print(i +" ");
			}
			System.out.println();
			n = n-1;
		}
	}
}

/*output:
	Enter n Value :
	5

		     1 
		    2 2 
		   3 3 3 
		  4 4 4 4 
		 5 5 5 5 5
*/