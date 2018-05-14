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

	}

}
