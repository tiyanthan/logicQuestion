package sgic.assignment.java;

public class Findfactors {

	public static void main(String[] args) {
		int num =20;
		for(int i=1;i<=num;i++)
		{
			int x=num%i;
			if(x==0)
			{
				System.out.println(i);
			}
		}

	}

}
