package sec03.exam01_for;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 0;
		int total = 0;
		while (i<10) {
			i++;  //0(1)
			total = total + i;  //  1 = 0 + 1
			System.out.print(i);
			if(i!=10) System.out.print("+");
		}
		System.out.print("="+total);
	}

}
