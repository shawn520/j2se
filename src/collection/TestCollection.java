///////*package collection;
////// 
//////import java.util.ArrayList;
//////
//////import charactor.Hero;
////// 
//////public class TestCollection {
//////    public static void main(String[] args) {
////////        //数组的局限性
////////        Hero heros[] = new Hero[10];
////////        //声明长度是10的数组
////////        //不用的数组就浪费了
////////        //超过10的个数，又放不下
////////        heros[0] = new Hero("盖伦");
////////                //放不下要报错
////////        heros[20] = new Hero("提莫");
//////    	@SuppressWarnings({"rawtypes","unchecked"})
//////    	ArrayList heros = new ArrayList<>();
////////    	Hero monkey = new Hero("猴子");
////////    	
////////    	heros.add(new Hero("盖伦"));
////////    	System.out.println(heros.size());
////////    	heros.add(new Hero("提莫"));
////////    	System.out.println(heros.size());
////////    	heros.add(monkey);
////////    	System.out.println(heros.size());
//////        for(int i=0;i<5;i++){
//////        	heros.add(new Hero("hero"+i));
//////        }
//////        System.out.println(heros);
////////        heros.add(3, new Hero("special hero"));
//////        Hero specialHero = new Hero("special hero");
//////        heros.add(specialHero);
////////        System.out.println(heros);
//////        System.out.println(heros.toString());
//////        //System.out.println(heros.contains(new Hero("hero1")));
//////        System.out.println(heros.contains(specialHero));
//////        System.out.println(heros.get(5));
////////        System.out.println(heros.get(6));
//////        System.out.println("specialHero所处的位置："+heros.indexOf(specialHero));
////////        System.out.println(heros.indexOf("hero1"));
////////        heros.remove(2);
////////        System.out.println(heros.toString());
////////        heros.remove(specialHero);
////////        System.out.println(heros);
////////        heros.set(5, new Hero("hero 5"));
//////        System.out.println(heros);
////////        System.out.println(heros.size());
////////        int [] a = new int [5];
////////        Hero [] hs = (Hero [])heros.toArray(new Hero []{});
////////        System.out.println("数组"+hs);
//////        //addAll
//////        ArrayList anotherHeros = new ArrayList<>();
//////        anotherHeros.add(new Hero("hero a"));
//////        anotherHeros.add(new Hero("hero b"));
//////        anotherHeros.add(new Hero("hero c"));
////////        System.out.println(anotherHeros);
////////        
////////        System.out.println("把另一个容器所有对象都加到heros:");
////////        heros.addAll(anotherHeros);
////////        System.out.println(heros);
//////        //清空一个ArrayList
////////        anotherHeros.clear();
////////        System.out.println(anotherHeros);
//////       //判断集合里是否存在一个 name等于 "hero 1"的对象，应该怎么做？
//////        String name="hero1";
//////        for(int i=0;i<heros.size();i++){
//////        	Hero h = (Hero)heros.get(i);
//////        	if(name.equals(h.name)){
//////        		System.out.println("找到了name是"+name+"的对象");
//////        		break;
//////        	}
//////        }
//////    }
//////     
//////}
//////
//////*/
//////package collection;
////// 
//////import java.util.ArrayList;
//////import java.util.List;
//////
//////import charactor.Hero;
////// 
//////public class TestCollection {
//////
//////    public static void main(String[] args) {
///////*    	//ArrayList实现了接口List
//////    	
//////    	//常见的写法会把引用声明为接口List类型
//////    	//注意：是java.util.List,而不是java.awt.List
//////    	//接口引用指向子类对象（多态）
//////    	
//////        List heros = new ArrayList();
//////        heros.add( new Hero("盖伦"));
//////        System.out.println(heros.size());
//////        */
//////    	
//////    }
//////     
//////}
////
////package collection;
////  
////import java.util.ArrayList;
////import java.util.Iterator;
////import java.util.List;
//// 
////import property.Item;
////import charactor.APHero;
////import charactor.Hero;
////  
////public class TestCollection {
//// 
////    public static void main(String[] args) {
////         
////        //对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
//////        List heros = new ArrayList();
////    	List heros = new ArrayList();
////         
////        heros.add(new Hero("盖伦"));
////         
////        //本来用于存放英雄的容器，现在也可以存放物品了
////        heros.add(new Item("冰杖"));
////         
////        //对象转型会出现问题
////        Hero h1=  (Hero) heros.get(0);
////        //尤其是在容器里放的对象太多的时候，就记不清楚哪个位置放的是哪种类型的对象了
//////        Hero h2=  (Hero) heros.get(1);
////         
////        //引入泛型Generic
////        //声明容器的时候，就指定了这种容器，只能放Hero，放其他的就会出错
////        List hero = new ArrayList<>();
//////        List <Hero> generichero = new ArrayList<Hero>();
////        
////        List<Hero> genericheros = new ArrayList<Hero>();
////        genericheros.add(new Hero("盖伦"));
////        //如果不是Hero类型，根本就放不进去
////        //genericheros.add(new Item("冰杖"));
////         
////        //除此之外，还能存放Hero的子类
////        genericheros.add(new APHero("流浪"));
////        
////        for(int i=0;i<5;i++){
////        	genericheros.add(new Hero("hero "+i));
////        }
////        
////        //并且在取出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或者其子类
//////        Hero h = genericheros.get(0);
////        
////        for(int i=0;i<genericheros.size();i++){
////        	Hero h = genericheros.get(i);
////        	System.out.println(h);
////        }
////        
////        //方法一：使用迭代器
//////        Iterator<Hero> it = genericheros.iterator();
//////        while(it.hasNext()){
//////        	Hero h = it.next();
//////        	System.out.println(h);
//////        }
////        
////        //方法二：迭代器的for写法
//////        for(Iterator <Hero> iterator=genericheros.iterator();iterator.hasNext();){
//////        	Hero h = iterator.next();
//////        	System.out.println(h);
//////        }
////        
////        //方法三：增强型for循环
////        for(Hero h:genericheros){
////        	System.out.println(h);
////        }
////        
////        
////    }
////      
////}
////
//package collection;
//
//import java.util.LinkedList;
//
//import charactor.Hero;
//
//public class TestCollection {
//
//    public static void main(String[] args) {
//    	
//    	//LinkedList是一个双向链表结构的list
//    	LinkedList<Hero> ll =new LinkedList<Hero>();
//    	
//    	//所以可以很方便的在头部和尾部插入数据
//    	//在最后插入新的英雄
//    	ll.addLast(new Hero("hero1"));
//    	ll.addLast(new Hero("hero2"));
//    	ll.addLast(new Hero("hero3"));
//    	System.out.println(ll);
//    	
//    	//在最前面插入新的英雄
//    	ll.addFirst(new Hero("heroX"));
//    	System.out.println(ll);
//    	
//    	//查看最前面的英雄
//    	System.out.println(ll.getFirst());
//    	//查看最后面的英雄
//    	System.out.println(ll.getLast());
//    	
//    	//查看不会导致英雄被删除
//    	System.out.println(ll);
//    	//取出最前面的英雄
//    	System.out.println(ll.removeFirst());
//    	
//    	//取出最后面的英雄
//    	System.out.println(ll.removeLast());
//    	
//    	//查看会导致英雄被删除
//    	System.out.println(ll);
//    	
//    }
//     
//}
//
package collection;
 
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
 
import charactor.Hero;
 
public class TestCollection {
 
    public static void main(String[] args) {
        //和ArrayList一样，LinkedList也实现了List接口
        List ll =new LinkedList<Hero>();
         
        //所不同的是LinkedList还实现了Deque，进而又实现了Queue这个接口
        //Queue代表FIFO 先进先出的队列
        Queue<Hero> q= new LinkedList<Hero>();
         
        //加在队列的最后面
        System.out.print("初始化队列：\t");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        q.offer(new Hero("Hero3"));
        q.offer(new Hero("Hero4"));
         
        System.out.println(q);
        System.out.print("把第一个元素取poll()出来:\t");
        //取出第一个Hero，FIFO 先进先出
        Hero h = q.poll();
        System.out.println(h);
        System.out.print("取出第一个元素之后的队列:\t");
        System.out.println(q);
         
        //把第一个拿出来看一看，但是不取出来
        h=q.peek();
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(h);
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(q);
         
    }
      
}

