package sgic.assignment.java;

public class Removeallwhitespaces {

	public static void main(String[] args) {
		
		Removeallwhitespaces rem=new Removeallwhitespaces();
		//rem.removeallwhitespaces("remove  space");
		rem.removeallwhitespacesWithF("remove   space");
		
		
	}
	void removeallwhitespaces(String word)
	{
		
		String word1 ="";
		char arr[]=word.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] !=' ')
			{
				word1=word1+arr[i];
			}
		}
		System.out.println(word1);
	}
	
	void removeallwhitespacesWithF(String word)
	{
		String word1=word.replaceAll(" ","");
		System.out.println(word1);
	}

}
