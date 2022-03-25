package setpgm;

import java.util.HashSet;
import java.util.Set;

public class Setp {
           public static void main(String[] args) {
			Set<Integer> s=new HashSet<Integer>();
			Set<Object> o=new HashSet<Object>();
           s.add(89);
           s.add(65);
           s.add(90);
           s.add(40);
           s.add(33);
           System.out.println(s);
           
           o.add(99);
           o.add(8);
           o.add(45);
           o.add(32);
           o.add(2);
           o.add(1);
           o.add('a');
           o.add(null);
           
           System.out.println(o);
           
           }

}
