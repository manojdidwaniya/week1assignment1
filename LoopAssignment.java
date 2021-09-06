package week1day2;

public class LoopAssignment {

	public static void main(String[] args) {
		System.out.println("------------------------------------ Assignment-1(Palidrom number)---------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");


		// assignment 1 palidrome
		int num = 434;
		int temp = num;

		int sum = 0;
		int n;
		while (num > 0) {
			n = num % 10;
			sum = (sum * 10) + n;
			num = num / 10;

		}
		if (temp == sum) {
			System.out.println("This number is palidram number");
		} else {
			System.out.println("This number is not palidrom");
		}
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");

		
		System.out.println("------------------------------------ Assignment-2(Counting Frequency)---------------------------------------------------------------------");

		// assignment 2
		int[] arr = new int[] { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
		int[] fr = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 1;
			
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i] == arr[j])
				{
					count++;
					// To avoid counting same element again
					fr[j] = visited;
				}
			}
			if (fr[i] != visited)
			{
				fr[i] = count;
			}
		}
			for (int k = 0; k < fr.length; k++) {
				if(fr[k]!=visited)
				System.out.println(arr[k] + " is repeted by " + fr[k] + " time");

			}

		}

	}
