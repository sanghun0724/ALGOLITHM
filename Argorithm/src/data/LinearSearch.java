package data;

public class LinearSearch {

	static int seqSearchSen(int[] a,int n ,int key){
		int i=0;
		a[n] = key;
		
		while(true){
			if(a[i] == key)
				break;
			i++;
		}
		return i==n ? -1 : i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
