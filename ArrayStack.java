package ArrayStack;

import java.util.EmptyStackException;

public class ArrayStack<T> {

	private Object[] stack; // An initially a non-empty array
	private int top;        // index of the top element, init to -1

	public ArrayStack()
	{
		this(10);
	}
	
	public ArrayStack(int capacity)
	{
		stack = new Object[capacity];
		top = -1;
	}

	public void push(T element)
	{
		if (top == stack.length - 1)
		{
			Object[] newStack = new Object[stack.length * 2];
			for (int i = 0; i < stack.length; i++)
			{
				newStack[i] = stack[i];
			}
			stack = newStack;
		}
		top++;
		stack[top] = element;
	}
	
	public T pop()
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		
		Object removedElement = stack[top];
		top--;
		removedElement = null; // not necessarily
		return (T)removedElement;
	}

	public T peek()
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
	
		return (T)stack[top];
	}
	
	public boolean isEmpty() {
		
		return top == -1;
	}
	
	public int size()
	{
		return top + 1;
	}
	
	
}












