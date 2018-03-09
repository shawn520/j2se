///*package charactor;
//
//public class ADHero extends Hero implements AD,Mortal {
//
//	public void attack() {
//		System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
//	}
//	
//	public void die(){
//		System.out.println("击杀了AD英雄");
//	}
//	
//    //隐藏父类的battleWin方法
//    public static void battleWin(){
//        System.out.println("ad hero battle win");
//    }    
//
//	// 可变数量的参数
//	public void attack(Hero... heros) {
//		for (int i = 0; i < heros.length; i++) {
//			System.out.println(name + " 攻击了 " + heros[i].name);
//
//		}
//	}
//
//	public static void main(String[] args) {
//		ADHero bh = new ADHero();
//		bh.name = "赏金猎人";
//
//		Hero h1 = new Hero();
//		h1.name = "盖伦";
//		Hero h2 = new Hero();
//		h2.name = "提莫";
//
//		bh.attack(h1);
//		bh.attack(h1, h2);
//		
////		Hero.battleWin();
////		ADHero.battleWin();
//		Hero h = new ADHero();
//		h.battleWin();
//	}
//
//	@Override
//	public void physicalAttack() {
//		// TODO Auto-generated method stub
//		System.out.println("进行物理攻击");
//		
//	}
//
//}
//
//
//package charactor;
// 
//public class ADHero extends Hero implements AD{
// 
//    @Override
//    public void physicAttack() {
//        System.out.println("进行物理攻击");
//    }
//    
//    public ADHero(){
//    	
//    	System.out.println("AD Hero的构造方法");
//    }
//    
//    public static void main(String[] args) {
//
//    	new ADHero();
//    	
//    }
// 
//}
//

//*/
package charactor;
 
public class ADHero extends Hero implements AD{
 
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    
    public ADHero(String name){
    	
    	super(name);
    	
    	System.out.println("AD Hero的构造方法");
    }
    
    public static void main(String[] args) {

    	new ADHero("女枪");
    	
    }

	@Override
	public void physicalAttack() {
		// TODO Auto-generated method stub
		
	}
 
}
