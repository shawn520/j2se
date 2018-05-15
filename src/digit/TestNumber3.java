package digit;

public class TestNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f1 = 5.4f;
		float f2 = 5.5f;
		//四舍
		System.out.println(Math.round(f1));
		//五入
		System.out.println(Math.round(f2));
		
		//得到一个0-1之间的随机浮点数
		System.out.println(Math.random());
		
		//得到一个0-10之间的随机浮点数
		System.out.println(Math.random()*10);
		
		//生成0-10之间的随机整数
		System.out.println((int)(Math.random()*10));
		
		//开方
		System.out.println(Math.sqrt(9));
		
		//次方
		System.out.println(Math.pow(2, 4));
	}

}
