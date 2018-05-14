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
		
		//练习：将浮点数转换成字符串
		double d = 3.14;
		//方法一
		String str3 = String.valueOf(d);
		System.out.println(str3);
		
		//方法二
		Double d2 = d;
		System.out.println(d2.toString());
		
		//练习：将字符串转换成浮点数
		String str4 = "3.14";
		double d3 = Double.parseDouble(str4);
		System.out.println(d3);
	}
}
