public class Task2 implements StackList{
	int size;
	Node top;
	
	public Task2(Object expression) {
		size = 0;
		top = null;
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(Object elem) {
		Node newNode = new Node(elem);
		newNode.nextLoc = top;
		top = newNode;
		size++;
	}
	
	public Object pop() throws StackUnderflowException{
		if(isEmpty()) {
			throw new StackUnderflowException();
		}else {
			Node n = top;
			top = n.nextLoc;
			size--;
			return n.data;
		}
	}
	
	public Object peek() throws StackUnderflowException{
		if(isEmpty()) {
			throw new StackUnderflowException();
		}else {
			Node n = top;
			return n.data;
		}
	}
	
	public void listCheck(String s) throws StackOverflowException, StackUnderflowException {
		Task2 bracketsStack = new Task2(s);
		Task2 posStack = new Task2(s);
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
