package arrayy;

public class INTERSECTION {
public static void main(String[]args) {
	int arr1 []= {5,7,8,6,1,2,9};
	
	int arr2 []= {7,1,5,3,2,6,4};
	
	

	for (int i = 0 ;i < arr1.length; i++) {
	 for (int j = 0; j <arr2.length; j++) {
		       if(arr1[i] == arr2[j]) {
			System.out.print( arr1[i]+" ");
		        	
		 }
		 }
	 }	
	
	 }
}

