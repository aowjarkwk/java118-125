package examples;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class ex122 {
	public static void main(String[] args) {
		//컬렉션(Collection) : 리스트,  맵, 셋(집합)
		//                   : 데이타 구조를 지원해주는 클래스 모임.
		//리스트 : 순차적으로 나열된 데이타
		//맵 : 키(key)와 값(value)로 된 데이타
		//셋 : 중복허용 안함. 순서없음
		Set<String> names = new HashSet<String>();
		names.add("홍길동");
		names.add("사임당");
		System.out.println( names );
		boolean isAdded = names.add("홍길동"); //중복되기 때문에 추가되지 않음.
		System.out.println( names );
		System.out.println( isAdded );
		Iterator<String> it = names.iterator();
		while( it.hasNext() ) {
			System.out.println( it.next() );
		}
		for( String name : names ) {
			System.out.println( name );
		}
	}
}