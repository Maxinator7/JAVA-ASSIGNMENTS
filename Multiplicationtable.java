package MULTI;

public class Multiplicationtable {
	
 static void multiplication (int n) {
	for (int i=1;i<=10;i++) {
		System.out.format(" %d x %d = %d \n",n,i,n*i);
		
	}
	System.out.println(" ");
	}
	
       public static void main(String[]args){
    	   multiplication (5 );
    	   
    	  
    	   multiplication (20 );
}
       
     
}
