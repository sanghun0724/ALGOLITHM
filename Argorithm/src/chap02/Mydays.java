package chap02;

import java.util.Scanner;

public class Mydays {
	static int[][] mdays = {
			{31,28,31,30,31,30,31,30,31,30,31,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}
	};

	 static int isleap(int year){
		 return (year % 4 == 0 && year %100 != 0 || year % 400 ==0 ) ? 1 : 0;
	 }
	 static int dayOfYear (int y,int m,int d){
		 int days =d;
		 for(int i =1;i<m;i++)
			 days +=mdays[isleap(y)][i-1];
		 return days;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
	  int retry;
	  System.out.println("그 해 결과 일수를 구합니다");
	  
	  do{
		 System.out.println("년  :"); int year =sc.nextInt();
		 System.out.println("월   :");int month =sc.nextInt();
		 System.out.println("일   :");int day =sc.nextInt();
		 
		 System.out.printf("그래 %d일 째입니다 ",dayOfYear(year,month,day));
	  }
	}

}
