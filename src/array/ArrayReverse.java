package array;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [5];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
			System.out.print(array[i]+"\t");
		}
		
		System.out.println();
		
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + "\t");
		}
	}

}
