package character;

public class TestString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";
//		s += "World";
//		System.out.println(s);
		
		StringBuffer sb = new StringBuffer(s);
		sb.append("World");
		s = sb.toString();
		System.out.println(s);
		testString();
		testStringBuffer();
		//总结：当一个字符串需要经常被修改时，使用StringBuffer比使用String要好的多。
		
			
	}
	
	public static void testString(){
		String s = "Hello";
		String s1 = "world";
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++){
			s = s + s1;
		}
		long end = System.currentTimeMillis();
		long runTime = end - start;
		System.out.println("testString:" + runTime);
	}
	public static void testStringBuffer(){
		StringBuffer s = new StringBuffer("Hello");
		String s1 = "world";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			s.append(s1);
		}
		long end = System.currentTimeMillis();
		long runTime = end - start;
		System.out.println("testStringBuffer:" + runTime);
	}
}
