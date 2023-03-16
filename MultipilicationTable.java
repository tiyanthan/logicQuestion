package sgic.assignment.java;

public class MultipilicationTable {

	public static void main(String[] args) {
	MultipilicationTable mul =new MultipilicationTable();
	mul.forloop(6);
	mul.whileloop(5);
	}
	void forloop(int num)
	{
		for(int i=1;i<=10;i++)
		{
			int x=i*num;
			System.out.println(i+"	*	"+num+"	=	" + x);
		}

	}
	void whileloop(int num)
	{
		int i=1;
		while(i<=10)
		{
			int x=i*num;
			System.out.println(i+"	*	"+num+"	=	" + x);
			i++;
		}
	}

}
