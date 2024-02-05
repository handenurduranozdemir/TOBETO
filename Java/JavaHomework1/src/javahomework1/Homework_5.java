//5- Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.

package javahomework1;

public class Homework_5 {
	public static void main(String[] args)
	{
		int number = 29;
		
		if (isPerfect(number) == true)
			System.out.printf("%d sayısı mükemmel sayıdır.", number);	
		else
			System.out.printf("%d sayısı mükemmel sayı değildir.", number);	
	}
	
	public static boolean isPerfect(int val)
	{
		return sumFactors(val) == val;
	}
	
	public static long sumFactors(long val)
	{
		long result = 1;

		for (long i = 2; i * i <= val; ++i)
			if (val % i == 0)
				result += (i == val / i) ? i : (i + val / i); 

		return result;
	}
}
