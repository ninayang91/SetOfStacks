
public class Stack {
	int capacity,size=0;
	Node bottom, top;
	
	public Stack(int capacity){
		this.capacity=capacity;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public boolean isFull(){
		return size==capacity;
	}
	
	public boolean push(int x){
		if(size>=capacity)return false;
		size++;
		Node n=new Node(x);
		if(size==1)bottom=n;
		join(n,top);
		top=n;
		return true;
		
	}
	
	public void join(Node below, Node above){
		if(below!=null) below.next=above;
		if(above!=null) above.previous=below;
	}
	
	public int pop(){
		if(isEmpty()) return -1;
		size--;
		int x=top.object;
		top=top.previous;
		//top.next=null;
		return x;
	}
	
	public int removeBottom(){
		//if(isEmpty())return -1;
		Node b=bottom;
		bottom=bottom.next;
		if(bottom!=null)bottom.previous=null;
		size--;
		return b.object;
	}

}
