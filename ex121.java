package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//맵(map) 연습문제
//철수라는 학생이 데이타를 맵으로 설정해 보자.
//map의 이름은 student라 하고
//age는 20
//height는 170
//이름은 "배철수" 로 데이타를 설정후
//모든 Key Value를 출력하시오.
public class ex121 {

	public static void main(String[] args) {
		Map<String, String> student = new HashMap<String, String>();
		
		student.put("age", "20");
		student.put("height", "170");
		student.put("name", "배철수");
		
		Set<String> stu = student.keySet(); 
		
		
		Iterator<String> it = stu.iterator();
		while( it.hasNext() ) {
			String key = it.next();
			String value = student.get( key );
			System.out.println( "key:" + key + ", value:" + value );
	}

}
}
