package Numbers;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0,b=1,sum,count=10;
		for(int i=1;i<count;i++){
			sum=a+b;
			System.out.print(sum+",");
			a=b;
			b=sum;
		}

	}

}
