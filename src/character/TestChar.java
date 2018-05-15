package character;

import java.util.Scanner;

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
		
		//练习：从控制台读取字符串，然后把字符串转换为字符数组
		//转换为字符数组后，筛选出控制台读取到的字符串中的大写字母和数字，并打印出来 
		
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
//		char [] cs = str.toCharArray();
//		for (int i = 0; i < cs.length; i++) {
//			//System.out.printf(cs[i]+"\t");
//			if(Character.isUpperCase(cs[i]) || Character.isDigit(cs[i])){
//				System.out.print(cs[i]);
//			}
//		}
		
		//字符串长度
		String name = "盖伦";
		System.out.println(name.length());
		String unkonw = "";
		
		//可以有长度为零的字符串，空字符串。
		System.out.println(unkonw.length());
	}

}
