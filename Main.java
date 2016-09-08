
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		SetOfStacks s=new SetOfStacks(3);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(11);
		s.push(22);
		s.push(33);
		s.push(55);
		s.push(66);
		s.push(77);
		
		System.out.println(s.popAt(0));
		System.out.println(s.popAt(0));
		


		

	}
	
	//design a stack, push, pop and returns min value all in O(1) time
	
	

}
