package add;

import java.util.Scanner;

public class Reversepgm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int  r=0;
		for(;number!=0;number=number/10) 
		{
	int remainder=number%10;
	r=r*10+remainder;
		}
		System.out.println("the reverse of the given number is: "+r);	
	}
	}