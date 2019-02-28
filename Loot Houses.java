/*
  A thief wants to loot houses. He knows the amount of money in each house. 
   He cannot loot two consecutive houses. Find the maximum amount of money he can loot.
*/




public class Solution {
	public static int getMaxMoney(int arr[], int n){
  
  /*Your class should be named Solution. 
		*Don’t write main(). 
	 	*Don’t take input, it is passed as function argument.
	 	*Don’t print output.
	 	*Taking input and printing output is handled automatically.
		*/ 		
    

	int storage[]=new int[n];
      
      storage[0]=arr[0];
      
      
      storage[1]=Math.max(arr[0],arr[1]);
      
      for(int i=2;i<n;i++){
        
        int op1=arr[i]+storage[i-2];
        int op2=storage[i-1];
        storage[i]= Math.max(op1,op2);
        
      }
      
      return storage[n-1];
      
      
	}
}
