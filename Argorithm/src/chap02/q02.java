package chap02;

import java.util.Scanner;

public class q02 {
	int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a =new int[]{1,2,3,4,5};
       
       Scanner sc= new Scanner(System.in);
       System.out.println("ù���� �迭 ���� �Է�");
       int num1=sc.nextInt();
       System.out.println("�ι�° �迭 ���� �Է�");
       int num2=sc.nextInt();
       System.out.printf("a[%d]�� a[%d]�� ��ȯ�մϴ�",num1,num2);
       System.out.println();
       swap(a,num1,num2);
         for(int i=0;i<a.length;i++){
        	 System.out.print(a[i]);
         }
	}

	
	static void swap(int[] a,int dx1,int dx2){
		int t=a[dx1]; a[dx1]=a[dx2];a[dx2]=t;
	}
	
	
	static void reverse(int[] a){
		for(int i=0;i<a.length/2;i++){
			swap(a,i,a.length-1-i);
		}
	}
     
	 int sumOf(int[] a){
	for(int i=0;i<a.length;i++){
		 sum+=a[i];
	}
	return sum;
	}
}
