package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;  // num3 = 123456780
		//double num3 = num2;  // 제대로 된 결과값 0이 얻어진다. 
		num2 = (int) num3;  // 
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
