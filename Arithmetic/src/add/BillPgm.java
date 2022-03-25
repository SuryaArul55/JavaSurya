package add;

import java.util.Scanner;

public class BillPgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double amt=5.50;
	
		double r=Math.round(amt*100)/100.0;
		System.out.println(amt);
	int a,b,c;
	long pro,sum;
	float average;
	
	System.out.println("Enter the amount given");
	a=sc.nextInt();
	System.out.println("Enter the amount balance");
	b=sc.nextInt();
	System.out.println("enter the value");
	c=sc.nextInt();
	pro=a*b*c;
	sum=a+b+c;
	average=sum/3;
	
	System.out.println("the product of the number:"+pro);
	System.out.println("the sum of number:"+sum);
	System.out.println("the average value:"+average);
	}
}
