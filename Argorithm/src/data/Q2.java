package data;

import java.util.Scanner;

public class Q2 {
 
	 static int seq(int[] a,int n,int key){
		 a[n] =key;

	       System.out.println("   | 0 1 2 3 4 5 6   ");
	       System.out.println("---+-----------------");  
		 for(int i =0;i<n;i++){
			 for(int z=0;z<=i;z++){
				 System.out.print("  ");
			 }
			 System.out.print("  *");
			 System.out.println();
			 System.out.print( i +" |" );
			 
			 
			 
			 for(int j=0;j<=a.length-1;j++){
				 System.out.printf("%2d",a[j]);
			 }
			 System.out.println();
			 if(a[i]==key) return i;
		 }return -1;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      Scanner sc= new Scanner(System.in);
      System.out.println("요솟수:");
      int num =sc.nextInt();
      int[] x =new int[num+1];
      
      for(int i=0; i<num;i++){
    	  System.out.print("추가");
    	  x[i] =sc.nextInt();
      }
      System.out.println("검색값");
       int key =sc.nextInt();
      
      seq(x,num,key);
     
	}

}
