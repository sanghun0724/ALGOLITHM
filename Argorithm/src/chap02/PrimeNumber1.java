package chap02;

public class PrimeNumber1 {
 //1000이하 소수 열거 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int counter =0;
       
       for(int n=2; n<=1000;n++){
    	   int i;
    	   for(i=2;i<n;i++){
    		   counter++;
    		  if(n%i == 0){
    			   break;}
    		  if(n == i)
    			  System.out.println(n);
    		   }
    	   }
       }
	}


