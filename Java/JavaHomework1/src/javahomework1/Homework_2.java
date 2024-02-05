//2- kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak toplam alışveriş tutarını hesaplayan bir algoritma yazınız.
//(Input için Scanner ve döngü için for döngüsü kullanınız)

package javahomework1;

public class Homework_2 {
	public static void main(String[] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Kaç ürün almak istersiniz: ");
		int productCount = kb.nextInt();
		
		int total = 0;
		
		for(int i = 0; i < productCount; i++){
			System.out.printf("%d. ürünün fiyatini giriniz: ", i + 1);
			int productPrice = kb.nextInt();
			total += productPrice;
			
		}
		 System.out.printf("Toplam alışveriş tutarınız: %d%n", total);
	}
}
