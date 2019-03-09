/*
Problem:

Implement kReverse( int k ) in a linked list i.e. you need to reverse first K elements then reverse next k elements 
and join the linked list and so on.
Indexing starts from 0. If less than k elements left in the last, you need to reverse them as well. If k is greater 
than length of LL, reverse the complete LL.
You don't need to print the elements, just return the head of updated LL.

*/

Solution:

/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */

public class Solution {
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
	   LinkedListNode<Integer>  l = head;
     int c =0;
      while(l!=null){
        c++;
        l=l.next;
      }
      if(head == null || head.next == null){
          return head;
        }  
     LinkedListNode<Integer>  temp = head;
      int i=1;
      int z;
      if(k>c){
        z=c;
      }else{
        z=k;
      }
      while(i<z){
        temp=temp.next;
        i++;
      }
 LinkedListNode<Integer> temp2 = temp.next;
      temp.next = null;
      head = reverse(head);
    LinkedListNode<Integer> x =	kReverse(temp2,k);
      temp = head;
       i=1;
      while(i<z){
        temp=temp.next; 
        i++;
      }
      temp.next = x;
      return head; 
      
    }
