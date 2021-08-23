public class Tester {

	public static void main(String[] args) throws StackOverflowException, StackUnderflowException{
		//All Test Cases
		String s1 = "1+2*(3/4)";
		String s2 = "1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14";
		String s3 = "1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14";
		String s4 = "1+2]*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14";
		
		//Parenthesis Balance with Array
		Task1 a1 = new Task1(s1);
		Task1 a2 = new Task1(s2);
		Task1 a3 = new Task1(s3);
		Task1 a4 = new Task1(s4);
		
		a1.arrayCheck(s1);
		a1.arrayCheck(s2);
		a2.arrayCheck(s3);
		a3.arrayCheck(s4);
		a4.arrayCheck(s4);
		
		System.out.println("=======================================================");
		
		//Parenthesis Balance with Linked List
		Task2 l1 = new Task2(s1);
		Task2 l2 = new Task2(s2);
		Task2 l3 = new Task2(s3);
		Task2 l4 = new Task2(s4);
		
		l1.listCheck(s1);
		l2.listCheck(s2);
		l3.listCheck(s3);
		l4.listCheck(s4);
		
		
		
	}
}
