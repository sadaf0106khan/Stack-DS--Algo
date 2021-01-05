package stack;

public class ImplimentingStackUsingArray {
	private static int top=-1,size=0;
	private static int [] stack=new int[5];
	
	private static void push(int data) {
		if(top>=stack.length-1) {
			System.out.println("Stack is full");
		}else {
		top++;
		stack[top]=data;
		//top++;
		size++;
		}		
	}
	private static void peak() {
		System.out.println("the top element is "+stack[top]);
	}
	
	private static void pop() {
		if(top<0) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Deleted element is :"+stack[top]);
			stack[top]=0;
			top--;
			size--;
		}
		
	}
	
	private static void show() {
		for(int i=0;i<size;i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		push(12);
		push(13);
		push(14);
		push(15);
		push(19);
		System.out.println(top);
		peak();
		pop();pop();pop();pop();pop();pop();
		System.out.println(top);
		show();
		push(20);
		push(25);
		show();
	}

}
