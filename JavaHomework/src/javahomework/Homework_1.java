//Switch case ile müşteriden alınan sipariş numarasına göre hangi ürünün sipariş edildiğini belirleyen algoritma yazınız.
//Input için Scanner kullanınız

package javahomework;

public class Homework_1 {
	public static void main(String[] args)
	{
		homework1();
	}
	
	public static void homework1() 
	{
		for (;;) {
			java.util.Scanner kb = new java.util.Scanner(System.in);
			System.out.print("2 haneli siparişi numaranızı giriniz: ");
			int orderId = kb.nextInt();
			
			makeHyphens();
			orderDetails(orderId);
			makeHyphens();
		}
	}

	public static void orderDetails(int orderId)
	{
		switch (orderId) {
		case 10:
			System.out.println("10 numaralı siparişin ürünlerini görüntülüyorsunuz...");
			break;
		case 11:
			System.out.println("11 numaralı siparişin ürünlerini görüntülüyorsunuz...");
			break;
		case 12:
			System.out.println("12 numaralı siparişin ürünlerini görüntülüyorsunuz...");
			break;
		case 13:
			System.out.println("13 numaralı siparişin ürünlerini görüntülüyorsunuz...");
			break;
		case 14:
			System.out.println("14 numaralı siparişin ürünlerini görüntülüyorsunuz...");
			break;
		case 15:
			System.out.println("15 numaralı siparişin ürünlerini görüntülüyorsunuz...");
			break;
		case 16:
			System.out.println("16 numaralı siparişin ürünlerini görüntülüyorsunuz...");
			break;
		default:
			System.out.println("Geçersiz sipariş numarası girdiniz...");
		}
	}
	
	public static void makeHyphens()
	{
		System.out.println("--------------------------------------------------------");
	}
}

