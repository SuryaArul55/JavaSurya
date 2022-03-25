package add;

import java.util.Scanner;

public class Reversestringpgm {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word : ");
	String s=sc.next();
	
	StringBuilder s1=new StringBuilder(s);
	
	s1.reverse();
System.out.println("result:"+s1);
}
}
