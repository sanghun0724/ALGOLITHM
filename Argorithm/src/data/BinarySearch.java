package data;

public class BinarySearch {
	static int BinSearch(int [] a,int n ,int key){
		int pl =0;
		int pr= n-1;
		do{
			int pc =(pl +pr)/2;
			if(a[pc] == key){
				return pc;
			}
			else if(a[pc]<key){
				pl=pc+1;
			}
			else pr= pc-1;
		}while(pl<=pr);
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
