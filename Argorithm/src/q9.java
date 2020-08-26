
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int sum=0;
	static int sumof(int a,int b){
	int max;
	int min;
	if(a<b){
		max=b;
		min=a;
	}
	else{
		max=a;
		min=b;
	}
	for(int i=min;i<=max;i++){
		sum+=i;
	}

	return sum;}
	}


