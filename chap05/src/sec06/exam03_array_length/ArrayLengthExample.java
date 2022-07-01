package sec06.exam03_array_length;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 90 };
		
		int sum = 0;
		// i = 0 i<3
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("Æò±Õ : " + avg);
	}

}
