package week1.day2;

public class SumofDigits {

	public static void main(String[] args) 
	{
		int input = 246;
		int sum = 0;
		while (input > 0)
		{
			int rem = input % 10;  //246 %10 =6  -- 24 %10 = 4
			sum = sum + rem;  //sum =0 + 6    -- sum = 6+4 =10
			input =input / 10;  // 246 /10 = 24  --24/10= 2
			
			
		}
		System.out.println("Sum of digits ="+sum);
		

	}

}
