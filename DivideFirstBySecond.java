package rajasoft.in;

public class DivideFirstBySecond {

	public static int divide(int x, int y)
	{	x = Math.abs(x);
		y = Math.abs(y);

		while (x >= y) {
			x = x - y;		
		}
		if (y == 0)
		{
			System.out.printf("Error!! Divisible by 0");
			System.exit(1);
		}
		return x;
	}

	public static void main(String[] args)
	{
		int dividend = 22;
		int divisor = 7;

		System.out.println("Remainder is " + divide(dividend, divisor));
	}
}