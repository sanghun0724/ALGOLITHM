import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
   System.out.println("입력해라 마 ~");	
		int n = sc.nextInt();
		int sum=0;
   for(int i=1;i<=n;i++){
	   sum+=i;
	   if(i==n){
		   System.out.print(i);
	   }
	   else{
		   System.out.print(i+"+");
	   }
   }
   System.out.print("="+sum);
	}
int sum1=0;
	void gause(int n){
		for(int i=1;i<=n/2;i++){
			for(int j=n;j>n/2;j--){
				sum1+=i+j;
			}
		}
		System.out.println(sum1);
	}
	int a=1;
	
}
