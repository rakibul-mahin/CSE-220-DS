
public class Singly {
	Node head;
	
	public Singly(int[] a) {
		for(int num : a) {
			Node newNode = new Node(num);
			
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
	
	public void display() {
		if(head == null) {
			System.out.println("Empty List");
			return;
		}
		
		for(Node n = head; n != null; n = n.nextLoc) {
			System.out.print(n.data+" ");
		}
		
		System.out.println();
	}
}
