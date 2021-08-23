package Lab02_19241003;

public class Tester {

 public static void main(String[] args) {
  
  //TASK 2 - NUMBER 1
  
  //a
  System.out.println("BEGIN");
  MyList l1 = new MyList();
  l1.showList();
  System.out.println();
  
  //b
  System.out.println("BEGIN");
  int[] a = {1,2,5,3,8};
  MyList l2 = new MyList(a);
  l2.showList();
  System.out.println();
  
  //c
  System.out.println("BEGIN");
  MyList l3 = new MyList(l2);
  l3.showList();
  System.out.println();
  
  //TASK 2 - NUMBER 2
  //showList(); used in all other tasks
  
  //TASK 2 - NUMBER 3
  System.out.println("BEGIN");
  System.out.println(l1.isEmpty());
  System.out.println();
  System.out.println(l2.isEmpty());
  System.out.println();
  System.out.println(l3.isEmpty());
  System.out.println();
  
  
  //TASK 2 - NUMBER 4
  System.out.println("BEGIN");
  int[] b = {1,2,5,3,8};
  MyList l4 = new MyList(b);
  l4.showList();//This is before clearing
  System.out.println();
  l4.clear();
  l4.showList();//This is after clearing
  System.out.println();
  
  //TASK 2 - NUMBER 5
  System.out.println("BEGIN");
  int[] c = {1,2,5,3,8};
  MyList l5 = new MyList(c);
  Node node1 = new Node(9);
  l5.insert(node1);
  l5.showList();
  System.out.println();
  
  //TASK 2 - NUMBER 6
  System.out.println("BEGIN");
  int[] d = {1,2,5,3,8};
  MyList l6 = new MyList(d);
  l6.insert(9, 0);
  l6.showList();
  System.out.println();
  l6.insert(10, 6);
  l6.showList();
  System.out.println();
  l6.insert(11, -1);
  l6.showList();
  System.out.println();
  l6.insert(12, -1);
  l6.showList();
  System.out.println();
  
  //TASK 2 - NUMBER 7
  System.out.println("TASK 2 BEGIN");
  int[] e = {1,2,5,3,8};
  MyList l7 = new MyList(e);
  l7.remove(1);
  l7.showList();
  System.out.println();
  l7.remove(5);
  l7.showList();
  System.out.println();
  
  //TASK 3 - NUMBER 1
  System.out.println("BEGIN");
  int[] f = {1,2,5,3,8};
  MyList l8 = new MyList(f);
  l8.evenList();
  System.out.println();
  
  //TASK 3 - NUMBER 2
  System.out.println("BEGIN");
  int[] h = {1,2,5,3,8};
  MyList l10 = new MyList(h);
  System.out.println(l10.isAt(7));
  System.out.println();
  
  //TASK 3 - NUMBER 3
  System.out.println("BEGIN");
  int[] i = {1,2,5,3,8};
  MyList l11 = new MyList(i);
  l11.reverse();
  System.out.println();
  
  //TASK 3 - NUMBER 4
  System.out.println("BEGIN");
  int[] k = {1,2,5,3,8};
  MyList l13 = new MyList(k);
  l13.sort();
  System.out.println();
  
  //TASK 3 - NUMBER 5
  System.out.println("BEGIN");
  int[] l = {1,2,5,3,8};
  MyList l14 = new MyList(l);
  l14.sum();
  System.out.println();
  
  //TASK 3 - NUMBER 6
  System.out.println("BEGIN");
  int[] m = {1,2,5,3,8};
  MyList l15 = new MyList(m);
  l15.rotate("right", 2);
  System.out.println();
  MyList l15Alt = new MyList(m);
  l15Alt.rotate("left", 2);
  System.out.println();
  
 }

}
