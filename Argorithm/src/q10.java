import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int result;
		System.out.println("a의값을 입력하세요");
		int a=sc.nextInt();
	    System.out.println("b의값을 입력하세요");
	    int b=sc.nextInt();
	    while(true){
	    	if(a>=b){
	    	System.out.println("b값 다시입력하세요");
	    	b=sc.nextInt();
	    }
	    	else{
	    		break;
	    	}
	    }
	   
	    	result=b-a;
	    	System.out.printf("b-a는 %d입니다.",result);
	    
		

	}

}
