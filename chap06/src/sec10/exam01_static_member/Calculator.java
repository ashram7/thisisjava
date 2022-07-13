package sec10.exam01_static_member;

public class Calculator {
	// static (고정된 값) 객체마다 가지고 있을 필요가 없는 데이터를 static로 선언
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}	
}
