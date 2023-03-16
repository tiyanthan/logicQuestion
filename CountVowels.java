package sgic.assignment.java;

public class CountVowels {

	public static void main(String[] args) {
		CountVowels cou =new CountVowels();
		cou.countvowels("aeioU");

	}
	void countvowels(String word)
	{
		int count=0;
		char arr[]=new char[word.length()];
		for(int i=0;i<word.length();i++)
		{
			arr[i]=word.toLowerCase().charAt(i);
		}
		for(int i=0 ;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				count++;
			}
		}
		System.out.println("vowel count is : "+count);
		System.out.println("consonants count is : "+(word.length()-count));
	}

}
