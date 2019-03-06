/* 

Problem :

Given an array with N elements, you need to find the length of the longest subsequence of a given sequence such that all 
elements of the subsequence are sorted in strictly increasing order.

*/

public class Solution {

	public static int lis(int arr[]) {
      int n=arr.length;
		
		int storage[]=new int [n];
      
       storage[0]=1;
	
	for(int i=1;i<n;i++){
        storage[i]=1;
      
      for(int j=i-1;j>=0;j--){
        
        if (arr[j]>=arr[i]){
          continue;
        }
      
