package javaapplication10;
import java.util.*;
/**
 *
 * @author Hatice
 */
public class JavaApplication10 {


 public static void ngeLeftToRight(int[] a) throws Exception {
  Stack < Integer > myStack = new Stack < Integer > ();
  for (int i = 0; i < a.length; i++) {
   if (myStack.isEmpty())
    myStack.push(a[i]);
   else {
    while (!myStack.isEmpty() && myStack.peek() < a[i]) {
     System.out.println(myStack.pop() + " next greater" +" --> " + a[i]);
    }
    myStack.push(a[i]);
   }
  }
  while (!myStack.isEmpty())
   System.out.println(myStack.pop() +" next greater" +" --> -1");
 } public static void ngeLeftToLeft(int[] a) throws Exception {
  Stack < Integer > myStack = new Stack < Integer > ();
  for (int i = 0; i < a.length; i++) {
   if (myStack.isEmpty())
    myStack.push(a[i]);
   else {
    while (!myStack.isEmpty() && myStack.peek() > a[i]) {
     System.out.println(myStack.pop() + " next smaller" +" --> " + a[i]);
    }
    myStack.push(a[i]);
   }
  }
  while (!myStack.isEmpty())
   System.out.println(myStack.pop()+" next smaller" + " --> -1");
 }

 public static void main(String[] arg) throws Exception {
  int[] a = {
    3, 0, 11, 9, 2, 1, 10, 5
  };
  ngeLeftToRight(a);
  ngeLeftToLeft(a);
 }
}
