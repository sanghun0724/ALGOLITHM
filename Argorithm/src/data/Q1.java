package data;

public class Q1 {

	static int seqSearch(int[] a,int n,int key){
		
		
		a[n] = key;
		for(int i = 0;i<=n;i++){
			if(a[i]==key){
				return i;
			}	
	}
		return -1; 
	
				
	}
	
	public static void main(String[] args) {
		

	}

}
