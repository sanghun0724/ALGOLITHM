package chap02;

public class q4or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    static void copy(int[] a,int[] b){
    	
    	for(int i=0;i<a.length;i++){
    	         a[i]=b[i];
    	}
    }
    static void swap(int[] a,int dx1,int dx2){
    	    int t=a[dx1]; a[dx1]=a[dx2];a[dx2]=t;
    }
    static void reverse(int[] a){
    	for(int i=0;i<a.length/2;i++){
    		swap(a,a[0],a[a.length-i-1]);
    	}}
    
    	static void rcopy(int[] a,int[] b){
    		reverse(b);
    		for(int i=0;i<b.length;i++){
    			a[i]=b[i];
    		}
    	
    	}
    
}
