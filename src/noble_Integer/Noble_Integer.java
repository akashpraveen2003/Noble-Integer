package noble_Integer;

import java.util.Arrays;
import java.util.Scanner;

/*
  Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.

	Input 1:
	
	A = [3, 2, 1, 3]
	
	Input 2:
	
	A = [1, 1, 3, 3]
	
	Output 1:
	
	1
	
	Output 2:
	
	-1
 */
public class Noble_Integer {
	
	private static int is_Noble_Integer_or_not(int[] array) {
		
		int n=array.length;
		
		Arrays.sort(array);		
		
		if(array[n-1]==0)			// If the last element is "0", then all elements are -ve and 0 elements are greater, then it is noble element
		{
			return 1;
		}
		if(array[n-1]<0)
		{
			return -1;				// If the last element is -ve, then impossible for noble element
		}
		for(int i=0;i<n-1;i++)
		{
			if(array[i]!=array[i+1] && (array[i]==n-i-1))	// If they are not duplicates and a[i]==no.of.elements on right side 
			{
				
				return 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println(is_Noble_Integer_or_not(array));
		
	}

	

}
