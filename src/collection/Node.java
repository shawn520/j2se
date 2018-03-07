package collection;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	//左子节点
	public Node leftNode;
	
	//右子节点
	public Node rightNode;
	
	//值
	public Object value;
	
	//插入数据
	public void add(Object v){
		
		//如果当前节点没有值，就把数据放在当前节点上
		if(value == null){
			value = v;
		}
		
		//如果当前节点有值，就进行判断
		else{
			if(((Integer)v - (Integer)value)<=0){
				if(leftNode==null){
				leftNode=new Node();
				}
				leftNode.add(v);
			}
			else{
				if(null==rightNode){
					rightNode = new Node();
				}
				rightNode.add(v);
			}
		}
	}
	
	// 中序遍历所有的节点
    public List<Object> values() {
        List<Object> values = new ArrayList<>();
  
        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());
  
        // 当前节点
        values.add(value);
  
        // 右节点的遍历结果
        if (null != rightNode)
  
            values.addAll(rightNode.values());
  
        return values;
    }
	
	public static void main(String[] args) {
		int randoms [] = new int []{67,7,30,73,10,0,78,81,10,74};
		
		Node roots = new Node();
		
		for(int number : randoms){
			roots.add(number);
		}
		
		System.out.print(roots.values()+" ");
	}
}