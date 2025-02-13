import java.util.*;
public class QueueUsingStack{
	static class Queue{
		private Stack<Integer> stack1 = new Stack<>();
		private Stack<Integer> stack2 = new Stack<>();
		
		public boolean isEmpty(){
			return stack1.isEmpty();
		}
		
		//Add
		public void add(int data){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
			stack1.push(data);
			while(!stack2.isEmpty()){
				stack1.push(stack2.pop());
			}
		}
		
		//Remove
		public int remove(){
			if(isEmpty()){
				System.out.println("Queue is Empty");
				return -1;
			}
			return stack1.pop();
		}
		
		//Peek
		public int peek(){
			if(isEmpty()){
				System.out.println("Queue is Empty");
				return -1;
			}
			return stack1.peek();
		}
	}
		
	//main method
	public static void main(String args[]){
		Queue q = new Queue();
		q.add(1);
		q.add(4);
		q.add(7);
		
		while(!q.isEmpty()){
			System.out.println(q.peek());
			q.remove();
		}
	}
}