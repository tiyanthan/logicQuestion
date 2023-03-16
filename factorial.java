package sgic.assignment.java;

public class factorial {

	public static void main(String[] args) 
	{
		factorial fac=new factorial();
		int x=fac.Factorial(5);
		System.out.println(x);
	}
	static int Factorial(int m)
	{
		if(m==0)
		{
			return 1;
		}
		else
		{
			return(m*Factorial(m-1));
		}
		
	}

}
