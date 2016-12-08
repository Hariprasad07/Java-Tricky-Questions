package com.hari;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) 
	{
        System.out.println("Enter n Value");
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		System.out.println();

		for(int i=n; i>=1; i--) 
		{
			for(int j=i; j>=1; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*output
Enter n Value
5

*****
****
***
**
* 
 
 */
 