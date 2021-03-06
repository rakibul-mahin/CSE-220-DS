package Lab02_19241003;

public class MyList {
 
 Node head;
 
 public MyList() {
  head = null;
 }
 
 public MyList(int[] a) {
  for(int i = 0; i < a.length; i++) {
   Node node = new Node(a[i]);
   
   if(head == null) {
    head = node;
   }else {
    Node n = head;
    while(n.nextLoc != null) {
     n = n.nextLoc;
    }
    n.nextLoc = node;
   }
  }
 }
 
 public MyList(MyList a) {
  Node temp = a.head;
  while(temp != null) {
   Node node = new Node(temp.data);
   if(head == null) {
    head = node;
   }else {
    Node n = head;
    while(n.nextLoc != null) {
     n = n.nextLoc;
    }
    n.nextLoc = node;
   }
   temp = temp.nextLoc; 
  }
 }
 
 public void showList() {
  Node n = head;
  int count = 0;
  while(n != null) {
   count++;
   System.out.print(n.data+" ");
   n = n.nextLoc;
  }
  
  if(count == 0) {
   System.out.println("Empty List");
  }
 }
 
 public boolean isEmpty() {
  Node n = head;
  int count = 0;
  while(n != null) {
   count++;
   n = n.nextLoc;
  }
  
  if(count == 0) {
   return true;
  }
  
  return false;
 }
 
 public void clear() {
  head = null;
 }
 
 public void insert(Node newElement) {
  Node n = head;
  while(n != null) {
   if(n.data == newElement.data) {
    break;
   }
   
   if(n.nextLoc == null) {
    Node newNode = new Node(newElement.data);
    n.nextLoc = newNode;
    break;
   }else {
    n = n.nextLoc;
   }
  }
 }
 
 public void insert(int newElement, int index) {
  int totalNodes = countNodes();
  Node n = head;
  int count = 1;
  
  while(n != null) {
   if(n.data == newElement) {
    break;
   }else if(index == 0) {
    Node newNode = new Node(newElement);
    Node tempHead = head;
    head = newNode;
    newNode.nextLoc = tempHead;
    break;
   }else if(index > 0 && index <= totalNodes) {
    if(count == index) {
     Node newNode = new Node(newElement);
     Node temp = n.nextLoc;
     n.nextLoc = newNode;
     newNode.nextLoc = temp;
     break;
    }
   }else if(index < 0 || index > totalNodes) {
    System.out.println("WRONG INDEX");
    break;
   }
   
   n = n.nextLoc;
   count++;
   
  }
 }
 
 public int remove(int deleteKey) {
  Node n = head;
  Node prev = null;
  int count = 1;
  while(n != null) {
   if(n.data == deleteKey) {
    if(count == 1) {
     head = n.nextLoc;
     break;
    }else {
     prev.nextLoc = n.nextLoc;
     break;
    }
   }else {
    count++;
    prev = n;
    n = n.nextLoc;
   }
  }
  return n.data;
 }
 
 public void evenList() {
  MyList m = new MyList();
  Node temp = head;
  
  while(temp != null) {
   
   if(temp.data % 2 == 0) {
    
    Node node = new Node(temp.data);
    
    
    if(m.head == null) {
     m.head = node;
    }else {
     Node n = m.head;
     while(n.nextLoc != null) {
      n = n.nextLoc;
     }
     n.nextLoc = node;
    }
   }
   
   temp = temp.nextLoc;
  }
  
  m.showList();
 }
 
 public boolean isAt(int value) {
  boolean result = false;
  Node n = head;
  while(n != null) {
   if(n.data == value) {
    result = true;
    break;
   }else {
    result = false;
   }
   n = n.nextLoc;
  }
  return result;
 }
 
 public void reverse() {
  Node cur = head;
  Node next = null;
  Node prev = null;
  
  while(cur.nextLoc != null) {
   next = cur.nextLoc;
   cur.nextLoc = prev;
   prev = cur;
   cur = next;
  }
  cur.nextLoc = prev;
  head = cur;
  
  showList();
 }
 
 public void sort() {
  int temp;
  Node cur = head;
  Node next = null;
  
  while(cur != null) {
   next = cur.nextLoc;
   while(next != null) {
    if(cur.data > next.data) {
     temp = cur.data;
     cur.data = next.data;
     next.data = temp;
    }
    
    next = next.nextLoc;
   }
   
   cur = cur.nextLoc;
  }
  
  showList();
  
 }
 
 public void sum() {
  int sum = 0;
  Node n = head;
  while(n != null) {
   sum += n.data;
   n = n.nextLoc;
  }
  
  System.out.println(sum);
 }
 
 public void rotate(String direction, int place) {
  
  int counts  = countNodes();
  
  if(direction == "right") {
   place = counts - place;
  }
  
  for(int i = 1; i <= place; i++) {
   int count = 1;
   Node temp2 = head;
   Node n = head;
   while(n != null) {
    if(count == 2) {
     temp2 = n;
     break;
    }else {
     n = n.nextLoc;
     count++;
    }
   }
    
   Node last = head;
   while(last.nextLoc != null) {
    last = last.nextLoc;
   }
    
   last.nextLoc = head;
   head.nextLoc = null;
   head = temp2;
    
  }
  
  showList();
 }
 
 public int countNodes() {
  int count = 0;
  
  Node n = head;
  while(n != null) {
   count++;
   n = n.nextLoc;
  }
  
  return count;
 }
  
}
 

