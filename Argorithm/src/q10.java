import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int result;
		System.out.println("a�ǰ��� �Է��ϼ���");
		int a=sc.nextInt();
	    System.out.println("b�ǰ��� �Է��ϼ���");
	    int b=sc.nextInt();
	    while(true){
	    	if(a>=b){
	    	System.out.println("b�� �ٽ��Է��ϼ���");
	    	b=sc.nextInt();
	    }
	    	else{
	    		break;
	    	}
	    }
	   
	    	result=b-a;
	    	System.out.printf("b-a�� %d�Դϴ�.",result);
	    
		

	}

}
