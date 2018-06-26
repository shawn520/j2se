package array;

public class SelectSort {

	public static int [] sort(int [] a){
		int length = a.length;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[i]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		
		return a;
	}
}
