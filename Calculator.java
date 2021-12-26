package week1.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Calculator 
{
	public int add(int num1, int num2)
	{
		return num1+num2;
		
	}
	public int sub(int num1, int num2)
	{
		return num1 - num2;
		
	}
	public int mul(int num1, int num2)
	{
		return num1 * num2;
		
	}
	public int div(int num1, int num2)
	{
		return num1 / num2;
		
	}
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		int add = calculator.add(10, 20);
		System.out.println("Addition = " +add);
		int sub = calculator.sub(40, 20);
		System.out.println("Subtraction = " +sub);
		int mul =calculator.mul(10, 10);
		System.out.println("Multiply = "+mul);
		int div = calculator.div(10,5);
		System.out.println("division = "+div);
	}

}
