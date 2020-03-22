package binarysearchtree;
public class Inorder {
 static boolean isInorder(int[] arr, int n) { 
       if(n==0||n==1){
       return true;
       } for(int i=0; i<n;i++){
       if(arr[i]<arr[i-1]){
           return false;}}
       return true;
    } 
    public static void main(String[] args) { 
        int arr[] = {16, 20, 25, 50}; 
        int n = arr.length; 
        if (isInorder(arr, n)) { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No"); 
        } 
    } 
} 
