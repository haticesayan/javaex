
package javaapplication8;
import java.util.Stack;
import java.lang.Math;

public class JavaApplication8 {

  static String Addresses[]={"192.0.0.2","192.0.0.3","192.0.0.100","192.0.0.101"};
  static int Addressbook[][]={{0,0,1,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
  static boolean CanSend(int sender,int receiver){
  boolean res=(Addressbook[sender][receiver]==1)? 
          true:
          false;
  return res;
  }
  static int findTheComputer(int n){
  int client=2;
 if(CanSend(n,client)==false){return n;}
 return -1;
  
  }
   public static void main(String[] args) {
   int n=2;
   int result= findTheComputer(n);
   if(result==-1){System.out.println("Server not found.");
   }
   else{System.out.println("Server IP"+Addresses[result]);}
    }
    
}
