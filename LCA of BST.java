/*

Problem :

Given a binary search tree and two nodes, find LCA(Lowest Common Ancestor) of the given two nodes in the BST. 
Read about LCA if you are having doubts about the definition.

*/



public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/

	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
		
    if (root==null){
        return -1;
      }
      if (root.data==a || root.data==b){
        return root.data;
      }
     
     int l= lcaInBST(root.left,a,b);
       
      
    int r=  lcaInBST(root.right,a,b);
      
      if (l!=-1 && r==-1){
        return l;
      }
      else if (l==-1 && r!=-1){
        return r;
      }
	
     else  if (l==-1 && r==-1){
       return -1;
     }
      
      else{
        return root.data;
      }
}
}
