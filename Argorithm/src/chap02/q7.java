package chap02;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("10������ ��� ��ȯ�մϴ�");
        System.out.println("��ȯ�ϴ� ���̾ƴ� ���� :");
        int x=sc.nextInt();
        System.out.println("� ������ ��ȯ�ұ��?(2~36):");
        int r=sc.nextInt();
        
        
        char[] dd =new char[7];
        int namugi;
        System.out.printf("%d |%5d",x,r);
        System.out.println();
        System.out.println("------------");
        do{
        	
        	
           x/=r; namugi=x%r;
        	System.out.printf("%d |%5d  * * *%d",r,x,namugi);
        	System.out.println();
        	System.out.println("------------");
        
	}while(x!=0);
     System.out.println();
   System.out.printf("%d *******%d",x,namugi);
   System.out.println();
    cardConvR(x,r,dd);
}
	
	
	
	static void cardConvR(int x,int r,char[] d){
		int digits =0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUWXYZ";
		
		do{
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		 for(int i=0;i<d.length;i++){
			 System.out.print(d[i]);
			 
		}
	}
	
}