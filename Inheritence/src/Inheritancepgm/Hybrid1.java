package Inheritancepgm;

public class Hybrid1 extends Hybridpgm implements Mom,Dad {

	@Override
	void addition() {
		// TODO Auto-generated method stub
		super.addition();
		System.out.println("THIS IS DAD GIFT");
	}
@Override
public void mom() {
	// TODO Auto-generated method stub
	System.out.println("THIS IS MOM GIFT");
}
public static void main(String[] args) {
	Hybrid1 h1=new Hybrid1();
	h1.addition();
	h1.mom();
	h1.dad();
}
@Override
public void dad() {
	// TODO Auto-generated method stub
	
}
}
