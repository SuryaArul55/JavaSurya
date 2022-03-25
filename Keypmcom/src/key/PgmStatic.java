package key;

public class PgmStatic {
	static int s=10;
	public static void sub() {
		int a=90;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	static {
		System.out.println("This is static block");
		System.out.println(s);
	}
	}

