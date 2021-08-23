public interface StackArray {
	
	public void push(Object elem) throws StackOverflowException;
	public Object pop() throws StackUnderflowException;
	public Object peek() throws StackUnderflowException;
	public boolean isEmpty();
	
}
