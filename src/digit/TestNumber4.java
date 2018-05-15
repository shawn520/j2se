package digit;

public class TestNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "盖伦";
		int kill = 8;
		String title = "超神";
		String sentence = name + "在进行了" + kill +"次击杀后，获得了" + title + "的称号";
		System.out.println(sentence);
		
		//格式化输出
		String sentenceFormat = "%s 在进行了 %d 次击杀后，获得了 %s 的称号%n";
		System.out.printf(sentenceFormat,name,kill,title);
		System.out.format(sentenceFormat, name,kill,title);
		
		System.out.printf("这是换行符%n");
		System.out.printf("这是换行符%n");
		
		//总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达
		int year = 2020;
		
		//直接打印数字
		System.out.format("%d%n", year);
		
		//总长度8，默认右对齐
		System.out.format("%8d%n", year);
		
		//总长度8，左对齐
		System.out.format("%-8d%n", year);
		
		//总长度8，不够补0
		System.out.format("%08d%n", year);
		
		//千位分割符
		System.out.format("%,08d%n", year*1000000);
		
		//小数点位数
		System.out.format("%.2f%n", Math.PI);
		
	}

}
