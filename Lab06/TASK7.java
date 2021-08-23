
public class TASK7 {

 public static void main(String[] args) {
  System.out.println(fib(8));

 }
 
 public static int fib(int num) {
  int[] a = new int[1000];
   
  if(num <= 1) {
   return num;
  }
   
  if(a[num] != 0) {
   return a[num];
  }else {
   a[num] = fib(num-1) + fib(num-2);
   return a[num];
  }
 } 

}
