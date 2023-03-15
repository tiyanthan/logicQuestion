package sgic.assignment.java;

public class FibonanccialNumber {

	public static void main(String[] args) {
		FibonanccialNumber fib=new FibonanccialNumber();
		int x=fib.fibonancci(7);
		System.out.println(x);
		
	}
	
	int fibonancci(int m)
	{
		int n1=1;
		int n2=1;
		int n3=0;
		if(m==1)
		{
		
			return n1;
		}
		else if(m==2)
		{
			return n2;
		}
		else
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			return fibonancci(m-1)+fibonancci(m-2);
		}
		
		
	}

}
