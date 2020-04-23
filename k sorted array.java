
/// k sorted array 

import java.util.*;
import java.io.*;

class GFG {
    
    public static sortedKarray(int arr[],int k){
        
        
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        
        for(int i=0;i<k;i++){
        pq.add(arr[i]);
        }
        
    
    for(int i=k;i<arr.length;i++){
        arr[i-k]=pq.remove();
        pq.add(arr[i]);
    }    
        

   for(int i=arr.length-k;i<arr.length;i++){
       arr[i]=pq.remove();
   }
        
    }
    
    
    
    
    
    
    
    
    
    
    
