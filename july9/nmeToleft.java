package july9;

import java.util.ArrayList;
import java.util.Stack;

public class nmeToleft {
  public static void nme(int[] arr){
    int n=arr.length;
    Stack<Integer> stack=new Stack<>();
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++){
      if(stack.size()==0){
        list.add(-1);
      }
      else if(stack.peek() < arr[i]){
        list.add(stack.peek());
      }
      else{
        while(stack.size()>0 && stack.peek()>=arr[i]){
          stack.pop();
        }
        if(stack.size()==0){
          list.add(-1);
        }
        else{
          list.add(stack.peek());
        }
      }
      stack.push(arr[i]);
    }
        // Collections.reverse(list);
System.out.println("Next Greater to Left: " + list);    
  }
    public static void main(String[] args) {
      int[] arr = {4, 5, 2, 10};
        nme(arr);
  }
}
