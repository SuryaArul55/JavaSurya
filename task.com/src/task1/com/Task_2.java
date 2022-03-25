package task1.com;

public class Task_2 {
public static void main(String[] args) {
	try {
		int a=10;
		 System.out.println(a/0);
	} catch (NullPointerException e) {
         System.out.println("Handle null pointer");
	 	e.printStackTrace();
	}
     catch (ArithmeticException e) {
	     System.out.println("cannot divided by zero");
		 
     }
}
 

}

