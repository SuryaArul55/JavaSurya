package add;

public class Nestedloop {
	public static void main(String[] args) {
		for (int i =1; i <= 3; i++) {// row
			for (int j =1; j <=3; j++) {// column
				System.out.print("#");//print row
			}
			System.out.println( );
		}
	}
}
