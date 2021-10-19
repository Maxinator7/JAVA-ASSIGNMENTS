import java.util.Scanner;

public class practise {
	public static void main(String[]args) {
		
		// TODO Auto-generated method stub
		int sum=0;
		boolean flag=true;
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
		
		for(int i=0;i<rows;i++) {
			sum=0;
			for(int j=0;j<col;j++) {
				if(j==col-1 && sum!=arr[i][j]) {
					flag=false;
					break;
				}
				sum+=arr[i][j];
				}
			if(!flag) {
				break;
			}
			}
		System.out.println(flag);
	}

}