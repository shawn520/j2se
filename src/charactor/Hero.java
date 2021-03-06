////////////////package charactor;
////////////////
////////////////import java.io.Serializable;
//////////////// 
////////////////public class Hero{
////////////////    public String name; 
////////////////    public float hp;
////////////////    
////////////////    public int damage;
////////////////    
////////////////    public void attackHero(Hero h) {
////////////////    	try {
////////////////    		//为了表示攻击需要时间，每次攻击暂停1000毫秒
////////////////			Thread.sleep(1000);
////////////////		} catch (InterruptedException e) {
////////////////			// TODO Auto-generated catch block
////////////////			e.printStackTrace();
////////////////		}
////////////////    	h.hp-=damage;
////////////////    	System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
////////////////    	
////////////////    	if(h.isDead())
////////////////    		System.out.println(h.name +"死了！");
////////////////    }
////////////////
////////////////	public boolean isDead() {
////////////////		return 0>=hp?true:false;
////////////////	}
////////////////
////////////////}
//////////////package charactor;
////////////// 
//////////////import java.io.Serializable;
//////////////  
//////////////public class Hero{
//////////////    public String name; 
//////////////    public float hp;
//////////////     
//////////////    public int damage;
//////////////     
//////////////    public void attackHero(Hero h) {
//////////////    	//把暂停时间去掉，多条线程各自会尽力去占有CPU资源
//////////////    	//线程的优先级效果才可以看得出来
////////////////        try {
////////////////            
////////////////            Thread.sleep(0);
////////////////        } catch (InterruptedException e) {
////////////////            // TODO Auto-generated catch block
////////////////            e.printStackTrace();
////////////////        }
//////////////        h.hp-=damage;
//////////////        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
//////////////         
//////////////        if(h.isDead())
//////////////            System.out.println(h.name +"死了！");
//////////////    }
////////////// 
//////////////    public boolean isDead() {
//////////////        return 0>=hp?true:false;
//////////////    }
////////////// 
//////////////}
//////////////
////////////
////////////package charactor;
////////////
////////////import com.sun.swing.internal.plaf.synth.resources.synth;
////////////
////////////public class Hero{
////////////    public String name; 
////////////    public float hp;
////////////    
////////////    public int damage;
////////////    
////////////    //回血
////////////    //直接在方法前加上修饰符synchronized
////////////    //其所对应的同步对象，就是this
////////////    //和hurt方法达到的效果一样
////////////    public synchronized void recover(){
////////////    	hp=hp+1;
////////////    }
////////////    
////////////    //掉血
////////////    public synchronized void hurt(){
////////////    	hp=hp-1;
////////////    }
////////////    
////////////    public void attackHero(Hero h) {
////////////        h.hp-=damage;
////////////        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
////////////        if(h.isDead())
////////////            System.out.println(h.name +"死了！");
////////////    }
//////////// 
////////////    public boolean isDead() {
////////////        return 0>=hp?true:false;
////////////    }
//////////// 
////////////}
////////////
//////////package charactor;
//////////
//////////public class Hero {
//////////	public String name;
//////////	public float hp;
//////////
//////////	public int damage;
//////////
//////////	public synchronized void recover() {
//////////		if(hp == 1000){
//////////			try{
//////////				this.wait();
//////////			}catch(InterruptedException e){
//////////				e.printStackTrace();
//////////			}
//////////		}
//////////		hp = hp + 1;
//////////		System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
//////////		// 通知那些等待在this对象上的线程，可以醒过来了，如第20行，等待着的减血线程，苏醒过来
//////////		this.notify();
//////////	}
//////////
//////////	public synchronized void hurt() {
//////////		if (hp == 1) {
//////////			try {
//////////				// 让占有this的减血线程，暂时释放对this的占有，并等待
//////////				this.wait();
//////////			} catch (InterruptedException e) {
//////////				// TODO Auto-generated catch block
//////////				e.printStackTrace();
//////////			}
//////////		}
//////////
//////////		hp = hp - 1;
//////////		System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
//////////		//通知等待this对象上的线程，可以醒过来了
//////////		this.notify();
//////////	}
//////////
//////////	public void attackHero(Hero h) {
//////////		h.hp -= damage;
//////////		System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
//////////		if (h.isDead())
//////////			System.out.println(h.name + "死了！");
//////////	}
//////////
//////////	public boolean isDead() {
//////////		return 0 >= hp ? true : false;
//////////	}
//////////
//////////}
//////////
////////package charactor;
////////
////////import property.Item;
////////
////////public class Hero {
////////       
////////    String name; //姓名
////////       
////////    float hp; //血量
////////       
////////    float armor; //护甲
////////       
////////    int moveSpeed; //移动速度
////////    
////////    public void useItem(Item i){
////////    	System.out.println("hero use item");
////////    	i.effect();
////////    }
////////    
////////    public Hero(){
////////    	System.out.println("Hero的构造方法 ");
////////    }
////////    
//////// 
////////     
////////}
//////package charactor;
//////
//////import property.Item;
//////
//////public class Hero {
//////       
//////    String name; //姓名
//////       
//////    float hp; //血量
//////       
//////    float armor; //护甲
//////       
//////    int moveSpeed; //移动速度
//////    
//////    public void useItem(Item i){
//////    	System.out.println("hero use item");
//////    	i.effect();
//////    }    
//////    
//////    public Hero(){
//////    	System.out.println("Hero的无参的构造方法 ");
//////    }
//////    
//////    public Hero(String name){
//////    	System.out.println("Hero的有一个参数的构造方法 ");
//////    	this.name = name;
//////    }
//////    
//////    public static void main(String[] args) {
//////		new Hero();
//////	}
//////     
//////}
////package charactor;
////
////import property.Item;
////
////public class Hero extends Object {
////       
////    String name; //姓名
////       
////    float hp; //血量
////       
////    float armor; //护甲
////       
////    int moveSpeed; //移动速度
////    
////    public void useItem(Item i){
////    	System.out.println("hero use item");
////    	i.effect();
////    }    
////    
////    public Hero(){
////    	System.out.println("Hero的无参的构造方法 ");
////    }
////    
////    public Hero(String name){
////    	System.out.println("Hero的有一个参数的构造方法 ");
////    	this.name = name;
////    }
////    
////    public static void main(String[] args) {
////		new Hero();
////	}
////     
////}
//package charactor;
// 
//public class Hero {
//    public String name; 
//    protected float hp;
//     
//    public String toString(){
//    	return name;
//    }
//     
//    public static void main(String[] args) {
//        
//    	Hero h = new Hero();
//    	h.name = "盖伦";
//    	System.out.println(h.toString());
//    	//直接打印对象就是打印该对象的toString()返回值
//    	System.out.println(h);
//    }
//}
//
package charactor;
 
public abstract class Hero {
    public String name; 
    protected float hp;
    
    public abstract void attack();
     
    public String toString(){
    	return name;
    }
    
    public Hero(){
    	System.out.println();
    }
    
    public void finalize(){
    	System.out.println("这个英雄正在被回收");
    }
     
//    public static void main(String[] args) {
//    	//只有一引用
//    	Hero h;
//    	for (int i = 0; i < 100000; i++) {
//    		//不断生成新的对象
//    		//每创建一个对象，前一个对象，就没有引用指向了
//    		//那些对象，就满足垃圾回收的条件
//    		//当，垃圾堆积的比较多的时候，就会触发垃圾回收
//    		//一旦这个对象被回收，它的finalize()方法就会被调用
//			h = new Hero();
//		}
//
//    }
}

