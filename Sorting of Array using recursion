
public class arraysorted {

/*
	public static boolean checksorted(int  input[]) {
if (input.length<=1) {
	return true;
}
	int smallinput[]=new int[input.length-1];
	for(int i=1;i<input.length;i++) {
		
		smallinput[i-1]=input[i];
	}
	
	boolean ans=checksorted(smallinput);
	if (!ans) {
		return false;
	}
	
	if (input[1]>input[0]) {
		return true;
	}
	
	else {
		return false;
	}
	
	}
	
	
	
	public static void main(String[] args) {
int input[]= {1,2,4,3};
System.out.print(checksorted(input));

		
	}}

*/
public static boolean checksortedbetter(int  input[],int startindex) {
	
	if (startindex==input.length-1) {
		return true;
	}
	
	if (input[startindex]>input[startindex+1]) {
		
		return false;}
				
				
	boolean a=checksortedbetter(input,startindex+1);
	return a;
}
		
		
public static void main(String[] args) {
int input[]= {1,2,3,4};
System.out.print(checksortedbetter(input,0));
}}
