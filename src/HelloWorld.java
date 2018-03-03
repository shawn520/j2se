/*public class HelloWorld {
	public static void main(String[] args) {
		for (Season s : Season.values()) {
			System.out.println(s);
		}
	}
}
*/
public class HelloWorld{
	public static void main(String[] args) {
/*		for(HeroType h : HeroType.values()){
			System.out.print(h + " ");
		}*/
		int type = 3;
		switch(type){
		case 1:
			System.out.println("坦克");
			break;
		case 2:
			System.out.println("法师");break;
		case 3:
			System.out.println("刺客");break;
		case 4:
			System.out.println("辅助");break;
		default:
			System.out.println("未知");	
		}
	}
}