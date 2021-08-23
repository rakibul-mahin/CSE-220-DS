public class Task1 implements StackArray{
	Object[] a;
	int size;
	
	public Task1(String expression) {
		a = new Object[expression.length()];
		size = 0;
	}
	
	public void push(Object elem) throws StackOverflowException {
		if(size == a.length) {
			throw new StackOverflowException();
		}else {
			a[size] = elem;
			size++;
		}
	}
	
	public Object peek() throws StackUnderflowException{
		if(size == 0) {
			throw new StackUnderflowException();
		}else {
			Object val = a[size - 1];
			return val;
		}
	}
	
	public Object pop() throws StackUnderflowException{
		if(size == 0) {
			throw new StackUnderflowException();
		}else {
			Object val = a[size - 1];
			a[size - 1] = null;
			size--;
			return val;
		}
	}
	
	public boolean isEmpty() {
		if(size <= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void arrayCheck(String s) throws StackOverflowException, StackUnderflowException {
		Task1 bracketsStack = new Task1(s);
		Task1 posStack = new Task1(s);
		String finalMessage = s+"\nThis Expression is correct";
		int pos = 1;
		
		for(char c : s.toCharArray()) {
			if(c == '(' || c == '[' || c == '{') {
				bracketsStack.push(c);
				posStack.push(pos);
				pos++;
			}else if(c == ')') {
				if(bracketsStack.isEmpty()) {
					finalMessage = s+"\nThis Expression is not correct.\nError at character #"+pos+". '"+c+"' - not oppened";
					System.out.println(finalMessage);
					return;
				}else {
					if((char)bracketsStack.peek() == '(') {
						bracketsStack.pop();
						posStack.pop();
						pos++;
					}else {
						finalMessage = s+"\nThis Expression is not correct.\nError at character #"+posStack.peek()+" '"+bracketsStack.peek()+"' - not closed";
						System.out.println(finalMessage);
						return;
					}
				}
			}else if(c == ']') {
				if(bracketsStack.isEmpty()) {
					finalMessage = s+"\nThis Expression is not correct.\nError at character #"+pos+". '"+c+"' - not oppened";
					System.out.println(finalMessage);
					return;
				}else {
					if((char)bracketsStack.peek() == '[') {
						bracketsStack.pop();
						posStack.pop();
						pos++;
					}else {
						finalMessage = s+"\nThis Expression is not correct.\nError at character #"+posStack.peek()+" '"+bracketsStack.peek()+"' - not closed";
						System.out.println(finalMessage);
						return;
					}
				}
			}else if(c == '}') {
				if(bracketsStack.isEmpty()) {
					finalMessage = s+"\nThis Expression is not correct.\nError at character #"+pos+". '"+c+"' - not oppened";
					System.out.println(finalMessage);
					return;
				}else {
					if((char)bracketsStack.peek() == '{') {
						bracketsStack.pop();
						posStack.pop();
						pos++;
					}else {
						finalMessage = s+"\nThis Expression is not correct.\nError at character #"+posStack.peek()+" '"+bracketsStack.peek()+"' - not closed";
						System.out.println(finalMessage);
						return;
					}
				}
			}else {
				pos++;
			}
		}
		
		if(bracketsStack.isEmpty()) {
			System.out.println(finalMessage);
		}else {
			finalMessage = s+"\nThis Expression is not correct.\nError at character #"+posStack.peek()+" '"+bracketsStack.peek()+"'- was never closed";
			System.out.println(finalMessage);
		}
	}
}
