package chap02;

import java.util.Random;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		 Random rn=new Random();
	     Scanner sc =new Scanner(System.in);
	     
	     System.out.println("키의 최댓값을 구합니다 ");
	   
	     
	      
	    	int num=rn.nextInt(10);
	      
	}
static int MAXOF(int[] a){
	int max =a[0];
	for(int i=1;i<a.length;i++){
		if(max<a[i]){
			max=a[i];
		}
	}
	return max;
	
}
}
