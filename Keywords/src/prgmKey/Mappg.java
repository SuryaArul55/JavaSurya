package prgmKey;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mappg {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(101," surya");
		m.put(102, "roja");
		m.put(103," Arul");
		m.put(104,"idhaya");
		m.put(105,"Ammu");
		System.out.println(m);
		
		Map<Integer, String> m1=new HashMap<Integer, String> ();
		m1.put(101,"surya");
		m1.put(102,"roja");
		m1.put(103, "Arul");
		
		int si=m.size();
		System.out.println("THE SIZE OF MAP:"+si);
		
		Object ob=m1.get(102);
		System.out.println("THE VALUE OF 101 :"+ob);
		
		Set<Integer> Keyset=m.keySet();
		System.out.println("THE KEY ARE:"+Keyset);
		
		Collection<String> value=m.values();
		System.out.println(value);
		
		boolean cv =m1.containsValue("surya");
		System.out.println(cv);
		
	    boolean ckey=m.containsKey(103);	
	    System.out.println(ckey);
	
	} 

}
