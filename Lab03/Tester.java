package Lab03_20201220;

public class Tester {

 public static void main(String[] args) {
  Object[] a = {10,20,30,40,50};
  DoublyList list = new DoublyList(a);
  list.showList();
  System.out.println();
  Node newElement = new Node(60);
  list.insert(newElement);
  list.showList();
  System.out.println();
  list.insert(70, 6);
  list.showList();
  System.out.println();
  list.remove(7);
  list.showList();
  System.out.println();
  list.removeKey(70);
  list.showList();
  System.out.println();
  System.out.println(list.countNodes());
 }

}
