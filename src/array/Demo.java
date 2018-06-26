package array;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [5];
		
		//赋值
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);	
		}
		
		//输出排序前的数组
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println("\n" + "排序后的数组为");
		BubbleSort.sort(array);
		
	}

}
