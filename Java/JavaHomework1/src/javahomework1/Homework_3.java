//3- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.
//Do-While döngüsü kontrolün sonda yapıldığı while döngüsüdür. while'ın içerisindeki kısım true oldukça döngü devam eder. 
//Koşul gerçekleşse de gerçekleşmese de döngü do while ifadesine geldiğinde bir kez çalışır.

package javahomework1;

public class Homework_3 {
	public static void main(String[] args)
	{
		int i, n;
		i = 10;
		n = 8;
		
		do {
			System.out.printf("Do-While döngüsü içi n: %d%n", n);
			i++;
		} while (i < n);
		
		System.out.printf("Döngü dışı n: %d%n", n);
		
		while(i < n) {
			System.out.printf("While döngüsü içi n: %d%n", n);
		}
			
	}
}
