//package collection;
//
//import java.util.LinkedList;
//
//import charactor.Hero;
//
//public class MyStack implements Stack{
//	
//	LinkedList <Hero> heros = new LinkedList<>();
//	public void push(Hero h){
//		heros.addLast(h);
//	}
//	public Hero pull(){
//		return heros.removeLast();
//	}
//	public Hero peek(){
//		return heros.getLast();
//	}
//	
//	public static void main(String[] args) {
//		MyStack heroStack = new MyStack();
//		for(int i=0;i<5;i++){
//			Hero h = new Hero("hero name" + i);
//			System.out.println("压入hero:" + h);
//			heroStack.push(h);
//		}
//		for(int i=0;i<5;i++){
//			Hero h = heroStack.pull();
//			System.out.println("弹出hero：" + h);
//		}
//	}
//
//}
