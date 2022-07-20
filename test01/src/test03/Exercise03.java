package test03;

public class Exercise03 {

	public static void main(String[] args) {
		int sum =0;
		for(int i=1; i<=5; i++) { // i=5
			for(int j=1; j<=i; j++) { // j= 5
				System.out.print("*");  // *,**,***,****,*****
				if(j==i) {
					System.out.println();
				}
			}
		}
	}

}
