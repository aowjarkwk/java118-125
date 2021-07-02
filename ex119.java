package examples;

import java.util.ArrayList;
import java.util.Iterator;

//접근자(이터레이터 Iterator 클래스) : 데이터의 순차적인 접근을 도와주는 클래스

public class ex119 {

	public static void main(String[] args) {
		ArrayList<String>names = new ArrayList<String>();
		names.add("홍길동");
		names.add("허균");
		names.add("사임당");
		names.add("이순신");
		names.add("이몽룡");
		
		Iterator<String> it = names.iterator();
		
		//hasNext():다음 요소가 있는가 true/false
		//next():다음 요소값
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
