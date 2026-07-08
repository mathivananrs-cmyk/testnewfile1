package Pack2;

public class prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12, 35, 1, 10, 34, 1};
		int largest = -1;
		int secondlargest = -1;
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest = largest;
				largest = arr[i];
			
			}
			else if(arr[i]<largest && arr[i]>secondlargest)
			{
				secondlargest = arr[i];
				
			}
		}

		System.out.println(secondlargest);
	}

}
