package add;

import java.util.Scanner;

public class Factorialpgm {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no");
 int n=sc.nextInt();
	int f=1;
	for(int i=1;i<=n;i++) {
		f=f*i;
		System.out.println(f);
	}

}
}


int a ,i=0, j=0;
a=n;
while(a>0) {
	i=a%10;
	j=(j*10)+i;
	a=a/10;
}
			System.out.println("reverse no "+j);



			
}



}
