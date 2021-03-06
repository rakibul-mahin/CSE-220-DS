package Lab03_20201220;

public class DoublyList {
 Node head;
 
 //This Constructor will take an Array as a parameter and convert it to a DHCDLL
 public DoublyList(Object[] a) {
  //First I am going to create a Dummy Node and head will point towards this Node
  Node dummyNode = new Node(null);
  head = dummyNode;
  head.nextLoc = head;
  head.prevLoc = head;
  
  //Here I will take each element in array and create nodess and link them with the previous
  for(int i = 0; i < a.length; i++) {
   Node newNode = new Node(a[i]);
   if(head.nextLoc == head) {
    head.nextLoc = newNode;
    head.prevLoc = newNode;
    newNode.nextLoc = head;
    newNode.prevLoc = head;
   }else {
    Node n = head.nextLoc;
    while(n.nextLoc != head) {
     n = n.nextLoc;
    }
    newNode.prevLoc = n;
    newNode.nextLoc = head;
    head.prevLoc = newNode;
    n.nextLoc = newNode;
   }
  }
 }
 
 //This method will print the List in forward direction
 public void showList() {
  Node n = head.nextLoc;
  while(n != head) {
   System.out.print(n.data+" ");
   n = n.nextLoc;
  }
  
  if(head.nextLoc == head) {
   System.out.println("Empty List");
  }
 }
 
 /*
 //This method will print the list in reverse order
 public void showListRev() {
  Node n = head.prevLoc;
  while(n != head) {
   System.out.print(n.data+" ");
   n = n.prevLoc;
  }
  
  if(head.prevLoc == head) {
   System.out.println("Empty List");
  }
 }
 */
 
 //This method will take a node as a parameter and insert it in the list
 public void insert(Node newElement) {
  boolean check = false;
  Node n = head.nextLoc;
  while(n != head) {
   if(n.data == newElement.data) {
    check = true;
    break;
   }
   
   n = n.nextLoc;
  }
  
  if(!check) {
   n = head.nextLoc;
   while(n.nextLoc != head) {
    n = n.nextLoc;
   }
   
   Node newNode = new Node(newElement.data);
   n.nextLoc = newNode;
   newNode.prevLoc = n;
   newNode.nextLoc = head;
   head.prevLoc = newNode;
  }
 }
 
 //This method will take an element and an index and then it will put that element in the given index
 public void insert(int newElement, int index) {
  int totalNodes = countNodes();
  Node n = head.nextLoc;
  int count = 0;
  Node newNode = new Node(newElement);
  Node tail = head;
  
  if(index < 0 || index > totalNodes) {
   System.out.println("Wrong Index");
   return;
  }
  
  while(n != head) {
   if((int) n.data == newElement) {
    System.out.println("Value already exists");
    return;
   }
   
   n = n.nextLoc;
  }
  
  n = head.nextLoc;
  while(n != head) {
   if(count == index && count == 0) {
    tail.nextLoc = newNode;
    newNode.prevLoc = tail;
    newNode.nextLoc = n;
    n.prevLoc = newNode;
    return;
   }else if(count == index){
    tail.nextLoc = newNode;
    newNode.prevLoc = tail;
    newNode.nextLoc = n;
    n.prevLoc = newNode;
    return;
   }
   
   tail = n;
   n = n.nextLoc;
   count++;
  }
  
  insert(newNode); //Please check the immediate above method
  
 }
 
 //This method will remove any element in the list of a given index as a parameter
 public void remove(int index) {
  int count = 0;
  int totalNodes = countNodes();
  Node curr = head.nextLoc;
  Node next = null;
  Node prev = null;
  
  if(index < 0 || index >= totalNodes) {
   System.out.println("Wrong Index");
   return;
  }
  
  while(curr != head) {
   next = curr.nextLoc;
   prev = curr.prevLoc;
   if(count == index) {
    prev.nextLoc = next;
    next.prevLoc = prev;
    return;
   }
   
   curr = curr.nextLoc;
   count++;
  }
 }
 
 //This method will find the key passed in the parameter and remove it from the list
 public Node removeKey(int deleteKey) {
  Node curr = head.nextLoc;
  int count = 0;
  
  while(curr != head) {
   if((int) curr.data == deleteKey) {
    remove(count); //Please check the immediate above method.
    break;
   }
   
   curr = curr.nextLoc;
   count++;
  }
  
  return curr;
  
 }
 
 //This method will count the number of nodes in a certain list
 public int countNodes() {
  int count = 0;
  Node n = head.nextLoc;
  while(n.data != null) {
   count++;
   n = n.nextLoc;
  }
  
  return count;
 }
}

