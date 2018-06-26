package array;

public class BubbleSort {
	//冒泡排序
	public static void sort(int [] a){
		
		//增加判断
		if(a==null || a.length == 0 || a.length == 1){
			return ;
		}
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) { //注意数组边界
				if(a[j] > a[j+1] ){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}

}
