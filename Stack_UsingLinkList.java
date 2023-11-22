class Stack_UsingLinkList{
	//Leana 22csu106
	public static void main(String[] args)
	{
		Stack obj = new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.display();

		System.out.printf("\nTop element is %d\n",
						obj.peek());
		obj.pop();
		obj.pop();
		obj.display();
		System.out.printf("\nTop element is %d\n",
						obj.peek());
	}
}
class Stack{
	private class Node {
int data;
		Node link; 
	}
	Node top;

	Stack() { this.top = null; }

	public void push(int x) 
	{
		Node temp = new Node();
		if (temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}
		temp.data = x;
		temp.link = top;
		top = temp;
	}
	public boolean isEmpty() { return top == null; }
	public int peek()
	{
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}}
	public void pop(){
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}
		top = (top).link;
	}

	public void display()
	{
		if (top == null) {
			System.out.printf("\nStack Underflow");

		}
		else {
			Node temp = top;
			while (temp != null) {
				System.out.print(temp.data);

				temp = temp.link;
				if(temp != null)
					System.out.print(" -> ");
			}
		}
	}
}
