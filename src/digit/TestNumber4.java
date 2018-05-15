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
	}

}
