package chap02;

public class Q10 {
  static final int VMAX=21;
   static class physcData {
	   double vision;
   
   physcData (double vision){
	   this.vision=vision;
   }}
   static void distVision(physcData[] dat,int[] dist){
	   int i=0;
	   dist[i]=0;
	   for(i=0;i<dat.length;i++)
		   if(dat[i].vision>=0.0 && dat[i].vision <= VMAX / 10.0)
			   dist[(int)(dat[i].vision * 10)]++;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     physcData[] x = {
    		 new physcData(0.3),
    		 new physcData(0.7),
    		 new physcData(1.2),
    		 new physcData(0.7),
    		 new physcData(0.4)
     };
     int[] vdist = new int[VMAX];
     distVision(x,vdist);
     System.out.println("시력분포");
     for(int i=0;i<VMAX;i++){
    	 System.out.printf("%3.1f~: ",i/10.0);
    	if(vdist[i]>0){ 
    	 for(int j=1;j<= vdist[i];j++){
    		 System.out.print("*");
    	 } System.out.println();}
    	else System.out.println();
     }
     
     
	}

}
