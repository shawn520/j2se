package character;

public class TestChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'a';
		
		//自动装箱
		Character c = c1;
		
		//自动拆箱
		c1 = c;
		
		char c2 = '1';
		char c3 = '中';
		char c4 = 'b';
		
		//判断是否为字母
		System.out.println(Character.isLetter('a'));
		
		//判断是否为数字
		System.out.println(Character.isDigit('5'));
		
		//判断是否为空格
		System.out.println(Character.isWhitespace(' '));
		
		//判断是否为小写字母
		System.out.println(Character.isLowerCase('A'));
		
		//常见的转义
		System.out.println("使用空格无法得到对齐的效果");
		System.out.println("abc def");
		System.out.println("ab def");
		//使用\t制表符可以达到对齐的效果
		System.out.println("abc\tdef");
		System.out.println("ab\tdef");
		
		//反斜杠
		System.out.println("abc\\def");
	}

}
