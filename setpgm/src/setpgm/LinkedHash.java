package setpgm;

import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHash {
public static void main(String[] args) {
	Set<Integer> s=new LinkedHashSet<Integer>();
	Set<Object> o=new LinkedHashSet<Object>();
	
    s.add(89);// no order maintained
    s.add(65);
    s.add(89);//ignore duplicate value
    s.add(40);
    s.add(33);
    System.out.println(s);
    
    o.add(99);//insertion order
    o.add(8);
    o.add(99);
    o.add(32);
    o.add(2);
    o.add(1);
    o.add('a');
    o.add(null);
    
    System.out.println(o);

}
}
