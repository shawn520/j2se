package charactor;

public class Hero {
	public String name; 
	protected float hp; 

	//实例方法,对象方法，非静态方法 
	//必须有对象才能够调用
	public void die(){
		hp = 0;
	}
	
	//类方法，静态方法
	//通过类就可以直接调用
	public static void battleWin(){
		System.out.println("battle win");
	}
	
	public static void main(String[] args) {
	       Hero garen =  new Hero();
           garen.name = "盖伦";
           //必须有一个对象才能调用
           garen.die();
           
           Hero teemo =  new Hero();
           teemo.name = "提莫";
           
           //无需对象，直接通过类调用
           Hero.battleWin();
		
	}
}
