package charactor;

public class Support extends Hero implements Healer {

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		System.out.println("对友方英雄进行治疗");

	}

}

/*package charactor1;
import  charactor.*;

public class Support extends Hero {
	
	public void heal(){
		System.out.println("治疗");
	}
	
	public void heal(Hero h){
		System.out.println(getName()+"对" + h.getName() + "进行治疗");
	}
	
	public void heal(Hero h1,Hero h2){
		System.out.println(getName()+"对" + h1.getName() + "和" + h2.getName() + "进行治疗");
	}
	
	public static void main(String[] args) {
		Support qinnv = new Support();
		qinnv.setName("琴女");
		Hero garen = new Hero();
		garen.setName("盖伦");
		qinnv.heal(garen);
				
	}
	
}
*/
