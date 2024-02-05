//6- String metotlarını araştırınız. Her bir metot için örnek yapınız.

package javahomework1;

public class Homework_6 {
	public static void main(String[] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();
	
		System.out.print("toLowerCase:");
		
		String lower = s.toLowerCase();
		
		System.out.println(lower);
		
		System.out.println("--------------------------------------");
		
		System.out.print("toUpperCase:");
		
		String upper = s.toUpperCase();
		
		System.out.println(upper);
		
		System.out.println("--------------------------------------");
		
		System.out.print("Lenght:");
		
		System.out.printf("Yazının Uzunluğu:%d%n", s.length());

		System.out.println("--------------------------------------");
		
		System.out.print("charAt:");
		
		int len = s.length();
		
		for (int i = 0; i < len; ++i)
			System.out.printf("%c ", s.charAt(i));
		
		System.out.println();	
		
		System.out.println("--------------------------------------");

		System.out.println("equals:");
		
		System.out.println("Birinci yazıyı giriniz:");
		String s1 = kb.nextLine();
		
		System.out.println("İkinci yazıyı giriniz:");
		String s2 = kb.nextLine();
		
		System.out.println(s1.equals(s2) ? "Aynı yazı" : "Farklı yazılar");
		
		System.out.println("--------------------------------------");
		
		System.out.print("concat:");
		
		String concatString = s1.concat(" ").concat(s2);
		
		System.out.println(concatString);
			
	}
}
