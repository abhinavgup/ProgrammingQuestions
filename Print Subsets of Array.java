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
