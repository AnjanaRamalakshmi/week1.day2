package week1.day2;

public class ArmstrongNum {

	public static void main(String[] args)
	{
		int input = 153;
		int originalnum = input;
		int rem,result = 0;
		while ( originalnum != 0)
		{
			rem = originalnum % 10;
			result += Math.pow(rem,3);
			originalnum /= 10;
			
		}
		if( result == input)
		{
			System.out.println(input +" is armstrong number ");
			
		}
		else
		{
			System.out.println(input + " is not armstrong number ");
		}
	}

}
