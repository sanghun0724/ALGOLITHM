import java.util.Scanner;

public class chap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int a=1;
		int b=2;
		int c=0;
		int x;
	
		x=chappp1(a,b,c);
        System.out.println(x);
	}


	static int chappp1(int a,int b,int c){
		if(a>=b){
			if(b<=c){
				return b;
				}
			else if(a<=c){
				return a;
			}
			else
				return c;
		}
		else if(b<c){
			return b;
		}
		else if (a>c){
			return a;
		}
		else { return a;}
	}
}
