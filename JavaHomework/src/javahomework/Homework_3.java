//3- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.
//Do-While döngüsü kontrolün sonda yapıldığı while döngüsüdür. while'ın içerisindeki kısım true oldukça döngü devam eder. 
//Koşul gerçekleşse de gerçekleşmese de döngü do while ifadesine geldiğinde bir kez çalışır.

package javahomework;

public class Homework_3 {
	public static void main(String[] args)
	{
		int i = 10;
		int n = 8;
		loopWhile(i, n);
		loopDoWhile(i, n);
		}
		
		public static void loopWhile(int i, int n)
		{
			while(i < n) {
				System.out.printf("While döngüsü içi n: %d%n", n);
				i++;
				}
		}	
		public static void loopDoWhile(int i, int n)
		{
			do {
				System.out.printf("Do-While döngüsü içi n: %d%n", n);
				i++;
			} while (i < n);
			
			System.out.printf("Döngü dışı n: %d%n", n);
		}
			
}
