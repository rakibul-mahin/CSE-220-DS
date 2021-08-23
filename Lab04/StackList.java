public interface StackList {
		
	public void push(Object elem);
	public Object pop() throws StackUnderflowException;
	public Object peek() throws StackUnderflowException;
	public boolean isEmpty();
	
}

