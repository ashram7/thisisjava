package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		//System.arraycopy(복사할배열이름, 복사할배열시작주소, 옮길배열이름,옮길배열시작값,복사할배열길이)
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
