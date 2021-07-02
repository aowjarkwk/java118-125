package examples;
public class ex124 {
	static int depth = 0;
	public static void func() {
		depth++;
		System.out.println( "func:" + depth );
		if( depth > 2 ) {
			System.out.println("exit1:" + depth);
			depth --;
			return; //자기를 호출한 곳으로 이동
		}
		func();
		System.out.println("exit2:" + depth);
		depth--;
		return;
	}
	//스택메모리 : 함수의 자원(변수,코드)을 저장하는 곳
	public static void main(String[] args) {
		//재귀함수 recursive
		//자기가 자기를 호출하는 함수.
		func();
	}
}