package charactor;

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
    
/*    	LifePotion lp =new LifePotion();
    	MagicPotion mp =new MagicPotion();
    	
    	garen.useItem(lp);
    	garen.useItem(mp);  */  	
        
        ADHero ashe = new ADHero();
        ashe.name = "艾希";
        APHero teemo = new APHero();
        ADAPHero jayce = new ADAPHero();
        garen.kill(ashe);
        garen.kill(teemo);
        garen.kill(jayce);
    	
    }
      
}
