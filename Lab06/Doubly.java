
public class Doubly {
	Node2 head;
	
	public Doubly(int[] a) {
		for(int num : a) {
			Node2 newNode = new Node2(num);
			
			if(head == null) {
				head = newNode;
			}else {
				Node2 n = head;
				while(n.nextLoc != null) {
					n = n.nextLoc;
				}
				n.nextLoc = newNode;
				newNode.prevLoc = n;
			}
		}
	}
	
	public void showList() {
		if(head == null) {
			System.out.println("Empty List");
			return;
		}
		
		for(Node2 n = head; n != null; n = n.nextLoc) {
			System.out.print(n.data+" ");
		}
		
		System.out.println();
	}
}
