package practice;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=0;i<=n;i++) 
	{
		if(i/3==0)
		{
		if(i/5==0)
			{
				sum=sum+i;
			}
		}
	}
	System.out.println(""+sum);
	
			
		}
				
	}
	


 