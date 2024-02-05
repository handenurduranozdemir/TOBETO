//7- kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,1.sınav notu,2.sınav notu,3.sınav notu isteyen 
//ve daha sonra not ortalamasını hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)

package javahomework1;

public class Homework_7 {
	public static void main(String[] args)
	{
		Classroom.run();
	}
}
class Classroom {
	public static void run()
	{
		createClassroom();
	}
	public static void createClassroom()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Öğrenci sayısını giriniz: ");
		int numberOfStudents = kb.nextInt();
		
		for(int i = 0; i <= numberOfStudents; i++) {
			for(int j = 0)
		}
	}
}
