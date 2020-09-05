package data;

public class Q3 {
	static int searchIdx(int[] a,int n ,int key,int[] idx){
		int q=0;
		for(int i =0;i<n;i++){
		 if(a[i]==key){
			 idx[q]+=i;
			 q++;
		 } 
		}
		return q;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}

}
