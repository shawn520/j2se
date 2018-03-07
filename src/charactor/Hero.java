/*package charactor;

import property.Item;
import property.LifePotion;
import property.MagicPotion;
  
public class Hero {
    public String name; 
    protected float hp;

    public void useItem(Item i){
    	i.effect();
    }
    
    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("hero battle win");
    }
    
    public void kill(Mortal m){
    	System.out.println(name+"放了一个大招");
    	m.die();
    }

    public static void main(String[] args) {
    	
    	Hero garen =  new Hero();
        garen.name = "盖伦";
    
    	LifePotion lp =new LifePotion();
    	MagicPotion mp =new MagicPotion();
    	
    	garen.useItem(lp);
    	garen.useItem(mp);    	
        
        ADHero ashe = new ADHero();
        ashe.name = "艾希";
        APHero teemo = new APHero();
        ADAPHero jayce = new ADAPHero();
        garen.kill(ashe);
        garen.kill(teemo);
        garen.kill(jayce);
    	
    }
      
}

package charactor;

import property.Item;

public class Hero {
       
    String name; //姓名
       
    float hp; //血量
       
    float armor; //护甲
       
    int moveSpeed; //移动速度
    
    public void useItem(Item i){
    	System.out.println("hero use item");
    	i.effect();
    }
    
    public Hero(){
    	System.out.println("Hero的构造方法 ");
    }
    
    public static void main(String[] args) {
		new Hero();
	}
     
}
*/


package charactor;

public class Hero {
	public String name;
	public float hp;

	public int damage;

	public Hero() {

	}

	// 增加一个初始化name的构造方法
	public Hero(String name) {

		this.name = name;
	}

	// 重写toString方法
	public String toString() {
		return name;
	}

}
