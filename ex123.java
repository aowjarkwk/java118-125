package examples;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class ex123 {
	public static void main(String[] args) {
		//집합 Set을 이용한 연산 - 교집합,합집합,부분집합
		Set<Integer> set_a = new HashSet<Integer>();
		Set<Integer> set_b = new HashSet<Integer>();
		set_a.add(new Integer(10));
		set_a.add(new Integer(20));
		set_a.add(new Integer(30));
		System.out.println( set_a );
		
		set_b.add(new Integer(30));
		set_b.add(new Integer(40));
		set_b.add(new Integer(50));
		System.out.println( set_b );
		
		//교집합
//		System.out.println( set_a.retainAll( set_b ) ); // 교집합을 구한다.
//		System.out.println( set_a ); //30
		
		//합집합
//		System.out.println( set_a.addAll( set_b ) ); //30 40 50
//		System.out.println( set_a );
		
		Set<Integer> set_cross = new HashSet<Integer>();
		Set<Integer> set_sum = new HashSet<Integer>();
		Set<Integer> set_sub = new HashSet<Integer>();
		
		//교집합
		Iterator<Integer> it = set_a.iterator();
        while (it.hasNext()) {
        	Integer tmp = it.next();
            if (set_b.contains(tmp)) {
            	set_cross.add(tmp);
            }
        }
        System.out.println(set_cross);
        
        //차집합
        Iterator<Integer> it2 = set_a.iterator();
        while (it2.hasNext()) {
        	Integer tmp = it2.next();
            if (set_b.contains(tmp)) {
            }else {
            	set_sub.add(tmp);
            }
        }
        System.out.println(set_sub);
        
        //합집합
        set_sum = set_b;
        Iterator<Integer> it3 = set_a.iterator();
        while (it3.hasNext()) {
        	set_sum.add(it3.next());
        }
        System.out.println(set_sum);
	}
}