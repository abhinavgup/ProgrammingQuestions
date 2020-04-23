// comparators in heaps 

import java.io.*;



class MinPQComparator implements Comparator<Integer>{


	public int compare(Integer o1, Integer o2) {
	
		if(o1 < o2){
			return -1;     // this is for min priority queue
		}else if(o1 > o2){
			return 1;
		}
		return 0;
	}

}

class MaxPQComparator implements Comparator<Integer>{
    
    
    public int compare(Integer o1,Integer o2){
        
        
        
        if(o1<o2){
            
            return 1;
        }
        
        else if(o1>o2){
            return -1 ;      // this is for max priority queue
        }
        
        return 0;
        
    }
    
    
}


class StringLengthComparator implements Comparator<String>{


	public int compare(String o1, String o2) {
		if(o1.length() < o2.length()){
			return 1;
		}else if(o1.length() > o2.length()){
			return -1;
		}else{
			return 0;
		}
	}
	
}

class GFG {
    
    
    
    
    
    
    MaxPQComparator maxPQComparator = new MaxPQComparator(); 
    PriorityQueue<Integer> pq = new PriorityQueue<>(maxPQComparator);
    
    
    MinPQComparator minComparator = new MinPQComparator();
    PriorityQueue<Integer> pq = new PriorityQueue<>(minPQComparator);
    
    
    
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());   // no need to call comparator it automatically makes a max prio queue
    
    // String arr[] = {"this", "at", "a", "their", "queues"};
	StringLengthComparator stringComparator = new StringLengthComparator();
	PriorityQueue<String> pq = new PriorityQueue<>(stringComparator);
   
    
    
    
    
    
    
    
    
    
    
    
    
