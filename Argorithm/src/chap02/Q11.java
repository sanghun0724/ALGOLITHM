package chap02;

public class Q11 {
	
  static class YMD{
	 static int y;
	 static int m;
	 static int d; 
  
  YMD(int y,int m,int d){
	this.y=y;
	this.m=m;
	this.d=d;
  }
   static void after(int n){
	  d+=n;
	  
	  if(d>31){
		  m+=d/31;  d=d%31;
		  if(m>12){
			  m=m%12; y+=m/12;
		  }
	  }
   }
   
   
   static void before(int n){
	  d-=n;
	  if(d<0){
		  d=-d%31; m-=-d/31;
		  if(m<0){
			  y-=-m/12;
			  m=-m%12; 
		  }
	  }
	   
	   
	   
   }
   
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
