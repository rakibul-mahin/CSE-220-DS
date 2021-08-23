
public class SinglyLinkedList {
	Node head;
	
	public SinglyLinkedList(int[] array) {
		for(int i : array) {
			Node newNode = new Node(i);
			
			if(head == null) {
				head = newNode;
			}else {
				Node n = head;
				while(n.nextLoc != null) {
					n = n.nextLoc;
				}
				n.nextLoc = newNode;
			}
		}
	}
	
	
}
