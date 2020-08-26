
public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//           triangleLB();
//           triangleLU();
//		    triangleRU(5);
		triangleRB(5);
	}

	static void triangleLB(){
		for(int i=1;i<=5;i++){
		
			for(int j=1;j<=i;j++){
			  System.out.print("*"); 
			}System.out.println();
	}
	}
	
    static void triangleLU(){
    	for(int i=5;i>=1;i--){
    		for(int j=1;j<=i;j++){
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
    static void triangleRU(int n){
   for(int i=1;i<=n;i++){
	   for(int j=1;j<=i-1;j++){
		   System.out.print(" ");
	   }
	   for(int j=1;j<=n-i+1;j++){
		   System.out.print("*");
	   }
	   System.out.println();
   }
    }
    static void triangleRB(int n){
    	for(int i=1;i<=n;i++){
    	       for(int j=n;j>=i;j--){
    	    	   System.out.print("2");
    	       }
    	       for(int j=1;j<=i;j++){
    	    	   System.out.print("*");
    	       }
    	       System.out.println();
    	}
    }
}						
