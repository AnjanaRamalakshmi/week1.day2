package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args)
	{
		int[] data = {3,2,11,4,6,7};
		
		//sort array
		Arrays.sort(data);
		
		int secondLargest =data.length-2;
		int[] newArray = new int[data.length];
		
		System.out.println(data[secondLargest]);
		

		
		
	}

}
