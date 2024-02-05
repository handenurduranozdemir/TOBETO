//4-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve doğru tahmin edene kadar devam eden bir program yazınız.
//(While döngüsü ile yapınız ve rastgele sayı üretmek için Random sınıfını kullanınız)

package javahomework1;

public class Homework_4 {
    public static void main(String[] args) {
        GuessGame.run();
    }
}

class GuessGame {
    public static void run() {
        guessNumber();
    }

    public static int generateNumber() {
        return (int) (Math.random() * 10);
    }

    public static void guessNumber() {
        int secretNumber = generateNumber();  
        int attempts = 10;
        int i = 0;

        while (i < attempts) {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.print("Tahminizi yapınız: ");
            int guess = kb.nextInt();
            i++;

            if (guess == secretNumber) {
                System.out.println("Tebrikler! Doğru tahmin!");
                break;
            }
            else
            	System.out.printf("%d tahmin hakkınız kaldı.%n", attempts - i);
        }

    }
}
