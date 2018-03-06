package charactor;

public class APHero extends Hero implements AP,Mortal {

	@Override
	public void magicAttack() {
		// TODO Auto-generated method stub
		System.out.println("进行魔法攻击");
	}
	public void die(){
		System.out.println("击杀了AP英雄");
	}

}
