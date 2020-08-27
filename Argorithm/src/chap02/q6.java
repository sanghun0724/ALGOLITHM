package chap02;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
static void CardConvR9(int x,int r,char[] d) {
	int digits =0;
	
	String dchar="0123456789ABCDEFGHIHJKLMNOPQRSTUWXYZ";
	
	do{
		d[digits++]=dchar.charAt(x % r);
		x/=r;
	}while(x !=0);
	/*swap*/
	
     }
}


