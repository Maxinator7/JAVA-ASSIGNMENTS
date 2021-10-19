import java.util.Scanner;

public class Digonal2darray {
public static void main(String[]args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter No of rows");
	int rows = scan.nextInt();
	System.out.println("Enter No of columns");
	int col = scan.nextInt();
	int[][] arr = new int[rows][col];
	System.out.println("Enter the Numbers");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<col;j++) {
			arr[i][j]=scan.nextInt();
		}
	}
	
	scan.close();
	 int n = arr [0][0];
	 boolean flag = true;
	for (int i=0; i<rows;i++ ) {
		for (int j=0;j<col;j++) {
			
			if (i==j && arr[i][j]!=n) {
				
				 flag = false;
				break;
				
				
			}
			
		}
	if (flag == false ) {
		break;
	}
	}
	System.out.println(flag);
}
}
