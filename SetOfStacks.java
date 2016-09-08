import java.util.ArrayList;
//import java.util.Stack;

public class SetOfStacks {
	//when a stack gets too high(exceeds some threshold), start a new stack
	//this data structure should contain several stacks, create a new stack when the previous exceeds capacity
	//include the method, SetOfStacks.pop(), SetOfStacks.push()
	
	ArrayList<Stack> stacks=new ArrayList<Stack>();
	int capacity;
	
	public SetOfStacks(int capacity){
		this.capacity=capacity;
	}
	
	public Stack getLastStack(){
		if(stacks.size()==0)return null;
		return stacks.get(stacks.size()-1);
	}
	
	public void push(int x){
		Stack last=getLastStack();
		if(last!=null && !last.isFull()){
			last.push(x);
		}else{
			Stack stack=new Stack(capacity);
			stack.push(x);
			stacks.add(stack);
		}
		
	}
	
	public int popAt(int index){
		return leftShift(index,true);
		
	}
	
	public int leftShift(int index, boolean removeTop){
		Stack stack=stacks.get(index);
		int removed_item;
		if(removeTop){
			removed_item=stack.pop();
		}else{
			removed_item=stack.removeBottom();
		}
		if(stack.isEmpty()){
			stacks.remove(index);
		}else if(stacks.size()>index+1){
			int v=leftShift(index+1, false);
			stack.push(v);
		}
		return removed_item;
	}
	

}
