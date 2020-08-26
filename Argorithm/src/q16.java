
public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              spira(4);
              
	}
static void spira(int n){
	for(int i=1;i<=n;i++){
		for(int j=n-1;j>=i;j--){
			System.out.print(" ");
		}
		for(int j=1;j<=(i-1)*2+1;j++){
			System.out.print(i);
		}
		System.out.println();
	   
		  
			
		
	}
}
}
