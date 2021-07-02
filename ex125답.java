package examples;
public class ex125답 {
	public static void main(String[] args) {
		//재귀함수로 팩토리얼(Factorial)을 구현해보자.
		//5! = 5*4*3*2*1
		int result = factorial( 5 ); //120
		System.out.println( result );
	}
	static int factorial(int n) {
		if( n == 1 ) {
			return 1;
		}
		return  n * factorial(n-1);
	}
}