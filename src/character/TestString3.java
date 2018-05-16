package character;

public class TestString3 {

	public static void main(String[] args) {
		String str1 = "let there";
		StringBuffer sb = new StringBuffer(str1);
		
		//apend追加
		sb.append(" be light");
		System.out.println(sb);
		
		//delete删除
		sb.delete(4, 10);
		System.out.println(sb);
		
		//insert插入
		sb.insert(4, "there ");
		System.out.println(sb);
		
		//反转
		System.out.println(sb.reverse());
	}
}
