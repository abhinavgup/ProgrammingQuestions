 /*
Question-

Whis and Beerus are playing a new game today . They form a tower of N coins and make a move in alternate turns . 
Beerus being the God plays first . In one move player can remove 1 or X or Y coins from the tower .
The person to make the last move wins the Game . Can you find out who wins the game ?

*/

public class solution {

	public  String solve(int n,int x,int y){
		
		
      
      int storage[]=new int[n+1];
      
      storage[1]=1;
      storage[x]=1;
      storage[y]=1;
      
      for(int i=2;i<=n;i++){
        
        
        if (storage[i]==0){
        
        storage[i]=storage[i-1]^1;
        
      
      if(i-x>=1){
        storage[i]=Math.max(storage[i],storage[i-x]^1);
      }
		
      
      if(i-y>=1){
          storage[i]=Math.max(storage[i],storage[i-y]^1);
      }
    }
      }
