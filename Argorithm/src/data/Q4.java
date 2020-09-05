package data;

import java.util.Scanner;

public class Q4 {
 static int Quiz(int[] a,int n,int key){
	    System.out.println("   |  0  1  2  3  4  5  6  ");
	    System.out.println("---+-----------------------");
	    int pr=a[0];
	    int pl= a[n-1];
	    //가상의 배열을 만들어보자하하하하하하하
	    char b[]=new char[n];
	    for(int i=0;i<n;i++){
	    	b[i]=' ';
	    }
	    int pr2=b[0];
	    int pl2=b[n-1];
	  
	    
	    do{
	    int pc =a[pr+pl/2];
	    b[pc]='+'; b[pr2]='<'; b[pl2]='>';
	  
	    if(a[pc]==key){
	    	
	    	for(int i=0;i<n;i++){
	    		System.out.println("   | "+b[i]);
	    		System.out.println("   | "+a[i]);
	    	}
	    	
	    	return pc;
	    	
	    }
	    else if(key<a[pc]){
	    	pl=pc-1;
	    	pl2=pc-1;
	    	for(int i=0;i<n;i++){
	    		System.out.println("   | "+b[i]);
	    		System.out.println("   | "+a[i]);
	    	}
	    }
	    else if(key<a[pc]){
	    	pr=pc+1;
	    	pr2=pc+1;}
	    for(int i=0;i<n;i++){
    		System.out.println("   | "+b[i]);
    		System.out.println("   | "+a[i]);
    	}
	    
	    }while(pl>=pr);
	    return -1;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("요소수를 입력해주세요 ");
           int n = sc.nextInt();
           
            int[] a=new int[n];
           for(int i=0;i<n;i++){
        	   System.out.println("입력");
        	   a[i]+=sc.nextInt();
           }
           System.out.println("키를 입력해주세요 ");
           int key=sc.nextInt();
           
           Quiz(a,n,key);
	}

}
