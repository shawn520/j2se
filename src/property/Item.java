/*package property;

public class Item {
	String name;
	int price;
	
	public void effect(){
		System.out.println("物品使用后，可以有效果");
	}
	
	public static void main(String[] args) {
		Item i1 = new MagicPotion();
		System.out.println("i1 是Item类型，执行effect打印：");
		i1.effect();
		
		
		LifePotion i2 =new LifePotion();
		System.out.println("i2是Item类型，执行effect打印：");
		i2.effect();
	}
	
}
*/
package property;

public class Item {
	String name;
	int price;
	
	public Item(){
		
	}
	
	//提供一个初始化name的构造方法
	public Item(String name){
		this.name = name;
	}
	
	public void effect(){
		System.out.println("物品使用后，可以有效果");
	}
	
}

