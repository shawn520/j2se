package digit;

public class TestNumber2 {

	public static void main(String[] args) {
		//数字转字符串
		//方法一
		int i = 2;
		
		String str = String.valueOf(i);
		System.out.println(str);
		
		//方法二
		Integer it = i;
		String str2 = it.toString();
		System.out.println(str2);
	}
}
