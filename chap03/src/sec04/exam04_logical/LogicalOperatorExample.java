package sec04.exam04_logical;
public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';		
		
		if( (charCode>=65) & (charCode<=90) ) {//앞 뒤를 모두 평가
			System.out.println("대문자 이군요");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {//앞이 true 이면 그냥 출력
			System.out.println("소문자 이군요");
		}
		
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		}	
	}

}
