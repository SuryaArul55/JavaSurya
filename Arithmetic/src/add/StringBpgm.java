package add;

import java.util.Scanner;

public class StringBpgm {
public static void main(String[] args) {
	String rev;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Word : ");
	rev =sc.nextLine();
	StringBuilder sb=new StringBuilder(rev);
	System.out.println("Reverse :"+sb.reverse());

}
}
