package sgic.assignment.java;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char a = scan.next().charAt(0);
        CheckVowel cv=new CheckVowel();
        //cv.checkAlphabet(a);
        cv.checkalphabet(a);

	}
	void checkAlphabet(char alphabet)
	{
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println(alphabet + " is a vowel.");
        } else {
            System.out.println(alphabet + " is a consonant.");
        }
	}
	void checkalphabet(char alphabet)
	{
		switch(alphabet)
		{
		case 'a':
			System.out.println(alphabet+" is is a vowel");
			break;
		case 'e':
			System.out.println(alphabet+" is is a vowel");
			break;
		case 'i':
			System.out.println(alphabet+" is is a vowel");
			break;
		case 'o':
			System.out.println(alphabet+" is is a vowel");
			break;
		case 'u':
			System.out.println(alphabet+" is is a vowel");
			break;
			default: 
			 System.out.println(alphabet + " is a consonant.");
			
			
		}
	}

}
