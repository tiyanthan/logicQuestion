package sgic.assignment.java;

public class ReverseDigits {

	public static void main(String[] args) {
		
		int Originalnum=123456;
		int ReverseNum = 0;
		
		while(Originalnum!=0)
		{
			int l=Originalnum%10;
			ReverseNum =ReverseNum*10+l;
			Originalnum /=10;

		}
		System.out.println(ReverseNum);
		
		
		/*int arr[]= {0,1,2,3,4};
		int i=0;
		while(i<(arr.length)/2)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-i-1]=temp;
		
			i++;
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}*/
		
	}
	
	
	

}
