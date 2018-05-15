package character;

public class TestString {

	public static void main(String[] args) {
		String str1 = "the light";
		String str2 = new String(str1);
		
		//==用于判断是否是同一个字符串对象
		System.out.println(str1 == str2);
		
		String str3 = "the light";
		System.out.println(str1 == str3);
		
		String str4 = str1.toUpperCase();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
		//忽略大小写
		System.out.println(str1.equalsIgnoreCase(str4));
	}
}
