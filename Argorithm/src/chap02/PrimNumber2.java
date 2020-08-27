package chap02;

public class PrimNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int counter =0; //나눗셈의 횟수
          int ptr =0; //찾은 소수의 개수 
          int[] prime =new int [500];
          
          prime[ptr++] =2;  // index 0 에 2 들어가고 후위연산자~ 
          
          for(int n=3;n<=1000;n+=2){
        	  int i;
        	  for(i=1;i<ptr;i++){
        		  counter++;
        		  if(n % prime[i] == 0){
        			  break;
        		  }
        	  if(ptr ==i) prime[ptr++] =n;
        	  }
        	 
          }
          for(int i=0;i<ptr;i++){
    		  System.out.println(prime[i]);
    	  }
	}

}
