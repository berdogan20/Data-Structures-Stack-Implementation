package LinkedStack;


public class LinkedStack<T> {

	private Node<T> top;
	
	private static class Node<T>
	{
		private T data;
		private Node<T> next;
		
		public Node (T data)
		{
			this.data = data;
		}
	}
	
	public void push (T data)
	{
		Node<T> newNode = new Node(data);
		
		if (top == null)
		{
			top = newNode;
		}
		else
		{
			newNode.next = top;
			top = newNode;
		}
	}
	
	public T pop()
	{
		if (top == null)
		{
			throw new RuntimeException("Stack is empty");
		}
		
		Node<T> removedNode = top;
		top = top.next;
		return removedNode.data;
	}
	
	public T peek()
	{
		if (top == null)
		{
			throw new RuntimeException("Stack is empty");
		}
		
		return top.data;
	}
	
	public int size()
	{
		int size = 0;
		Node<T> current = top;
		
		while (current != null)
		{
			size++;
			current = current.next;
		}
		
		return size;
	}

	
	
}




