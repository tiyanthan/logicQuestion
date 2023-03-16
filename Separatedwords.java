package sgic.assignment.java;

public class Separatedwords {

	public static void main(String[] args) {
		Separatedwords sep=new Separatedwords();
		sep.separatedwords("orange,apple,mango");
		sep.separatedwordsWithF("orange,apple,mango");

	}
	void separatedwords(String words)
	{
		
		int j=0;
		char letter[]=words.toCharArray();
		String word[] = new String[3];
		for(int i=0;i<3;i++)
		{
			word[i]="";
		}
		
		for(int i=0;i<letter.length;i++)
		{
			if(letter[i]!=',')
			{
				
				word[j]=word[j]+letter[i];
			}
			else
			{
				j++;
			}
		}
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
		
	}
	
	
	void separatedwordsWithF(String words)
	{
		String wordsarr[]=words.split(",");
		for(int i=0;i<wordsarr.length;i++)
		{
			System.out.println(wordsarr[i]);
		}
	}

}
