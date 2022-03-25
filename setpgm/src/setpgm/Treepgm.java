package setpgm;

import java.util.Set;
import java.util.TreeSet;

public class Treepgm {
public static void main(String[] args) {
	
	Set<Integer> s=new TreeSet<Integer>();//ascending order ,accept same datatype
	Set<Object> o=new TreeSet<Object>();
	s.add(8);
	s.add(90);
	s.add(4);
	s.add(8);
	System.out.println(s);
	
	o.add('n');
	o.add('b');
	o.add('h');
	o.add('a');
	System.out.println(o);
	
}
}
