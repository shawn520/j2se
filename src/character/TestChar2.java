package character;

public class TestChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "盖伦,击杀了,提莫";
		char c = sentence.charAt(1);
		char [] cs = sentence.toCharArray();
		System.out.println(c);
		System.out.println(cs.length == sentence.length());
		String subString1 = sentence.substring(3);
		System.out.println(subString1);
		
		//左闭右开
		String subString2 = sentence.substring(3, 9);
		System.out.println(subString2);
		
		//split
		String [] subSentences = sentence.split(",");
		for(String sub:subSentences){
			System.out.println(sub);
		}
		String temp = sentence.replaceAll("盖伦", "提莫");
		temp = temp.replaceAll("提莫", "盖伦");
		System.out.println(temp);
	}

}
