package digit;

public class TestNumber2 {

	public static void main(String[] args) {
		//数字转字符串
		//方法一：使用String类的静态方法valueOf
		int i = 2;
		
		String str = String.valueOf(i);
		System.out.println(str);
		
		//方法二:先把基本类型装箱为对象，然后调用对象的toString方法
		Integer it = i;
		String str2 = it.toString();
		System.out.println(str2);
		
		//字符串转数字
		String str1 = "987";
		int i2 = Integer.parseInt(str1);
		System.out.println(i2);
		
		
	}
}
