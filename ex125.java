package examples;
//재귀함수로 팩토리얼(Factorial)을 구현해보자.
//5! = 5*4*3*2*1

public class ex125 {

	static int m = 5;
	static int result=1;
	public static void factorial(int m) {
			
		
		result*=m;
		if(m==0) {
			
			m++;
			
			return;
			
		}
		if(m==1) {
			System.out.println(result);
		}
		
		m--;
		
		factorial(m--);
		
		return;
		
	}
	
	public static void main(String[] args) {

		factorial(m--);
		
	}

}
