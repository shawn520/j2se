package digit;

public class TestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1 = 5;
		
		//基本类型转换成封装类型
		Integer it = new Integer(i1);
		
		//自动转换叫装箱
		Integer it2 = i1;
		
		System.out.println(it2.intValue());
		
		//封装类型转换成基本类型
		int i2 = it.intValue();
		System.out.println(i2);
		
		//自动转换叫拆箱
		int i3 = it;
		System.out.println("i3="+i3);
		
		System.out.println(it instanceof Number);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		//练习：
		//对Byte自动装箱和拆箱
		byte b1 = 26;
		
		//基本类型转换为封装类型
		Byte B1 = new Byte(b1);
		System.out.println(B1.byteValue());
		
		//自动装箱
		Byte B2 = b1;
		System.out.println(B2.byteValue());
		
		//封装类型转换成基本类型
		System.out.println(B1.byteValue());
		
		//自动拆箱
		byte b2 = B2;
		System.out.println(b2);
		
		//通过Byte获取Byte的最大最小值
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		


	}

}
