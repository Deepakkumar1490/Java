package Array;
import java.util.Scanner; 

public class BasicArray {
       
	public int max(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		BasicArray a=new BasicArray();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int value=a.max(arr);
		System.out.println("Maxmimum value"+" "+value);
		

	}
}
