package examples;

import java.util.LinkedList;

//linkedList : ArrayList와 쓰는 방법은 동일
//           : 내부적으로 처리하는 방법(속도)이 다름.
//한 요소가 다른 요소의 주소를 가지고 있는 개념.
//꼬리에 꼬리를 문다.
//LinkedList : 흩어진 데이타를 주로 접근할 때 속도가 빠르다.
//ArrayList : 근접데이타 접근시 빠르다.
public class ex118 {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.add("홍길동");
		names.add("사임당");
		names.add("이순신");
		System.out.println(names);
		
		//처음에 추가
		names.add(0, "허균");
		System.out.println(names);
		
		//반복문으로 순환
		for( int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
		//향상된 for문으로 순환
		for(String name:names) {
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println(names.getFirst()); //첫번째
		System.out.println(names.getLast()); //마지막
		System.out.println(names.peek()); //첫번째 얻어오고 삭제 안함.
		System.out.println(names.poll()); //첫번째 얻어오고 삭제
		System.out.println(names);
		
		//push,pop 함수 - 스택 데이터구조
		names.push("아이언맨"); //맨 처음으로 들어감
		System.out.println(names);
		
		System.out.println(names.pop());//맨처음것을 얻어오고 삭제
		System.out.println(names);
		
		//데이터(자료) 구조
		//큐(QUEUE) : FIFO (First In First Out) 먼저 들어간 요소가 먼저 나온다.
		//스택(STACK): FILO (First in Last Out) 먼저 들어간 요소가 마지막에 나온다.
	}

}
