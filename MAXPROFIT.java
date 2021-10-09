package arrayy;
import java.util.Arrays;

public class MAXPROFIT {
	
	 public static void main(String[]args){
         
         int price[]={7,1,5,3,6,4};
         
         int max = 0;
         
         for (int i=0;i<price.length;i++) {
        	 if (price [i]>max) {
        		 max =price[i];
        	 }
         }
         
         System.out.println(max);
         
         int min = price[0];
         
         for (int i=0;i<price.length;i++) {
        	 if (price[i]<min) {
        		 min =price[i];
        	 }
         }
         System.out.println(min);
         
         
         int buy =min;
         
         int sell= max;
         
        int  profit = (sell-buy);
        
        System.out.println("congratulations you have made profit of "+ profit);
}
}