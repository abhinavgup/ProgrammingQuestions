// 
Problem :

Given an integer array (of length n), find and print all the subsets of input array.

//

public class solution {
	public static void printSubsets(int input[],int si,int outputso[]) {
		
      
      if (input.length==si){
               
        for(int i=0;i<outputso.length;i++){
          System.out.print(outputso[i]+" ");
        }
	   
	System.out.println();
        return;
            }
	
       int[]  newoutputso=new int[outputso.length+1];
            
      	  printSubsets(input,si+1,outputso);
	newoutputso[outputso.length]=input[si];
     for(int i=0;i<outputso.length;i++){
                                           
      newoutputso[i]=outputso[i];
     }
      printSubsets(input,si+1,newoutputso);
    }
      
      		
