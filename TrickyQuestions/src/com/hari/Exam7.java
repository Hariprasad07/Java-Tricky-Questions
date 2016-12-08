package com.hari;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) 
	{
        System.out.println("Enter n value :");
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int temp = n;
		
		for(int i=1; i<=temp; i++) 
		{
			for(int space=1; space<=n; space++) 
			{
				System.out.print(" ");
			}
			for(int star=1; star<=i; star++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			n = n-1;
		}		
	}
}

/*output:
	Enter n value :
		5
		     * 
		    * * 
		   * * * 
		  * * * * 
		 * * * * * 
*/
