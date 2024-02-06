package javahomework;

import java.util.Scanner;

public class Homework_7 {
    public static void main(String[] args) {
        Classroom.run();
    }
}

class Classroom {
    public static void run() {
        createClassroom();
    }

    public static void createClassroom() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Öğrenci sayısını giriniz: ");
        int numberOfStudents = kb.nextInt();

        String[] names = new String[numberOfStudents];
        String[] surnames = new String[numberOfStudents];
        int[][] examNotes = new int[numberOfStudents][3]; 

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%d. Öğrencinin adını giriniz: %n", i + 1);
            kb.nextLine(); 
            names[i] = kb.nextLine();

            System.out.printf("%d. Öğrencinin soyadını giriniz: ", i + 1);
            surnames[i] = kb.nextLine();

            System.out.printf("%d. Öğrencinin 1. sınav notunu giriniz: ", i + 1);
            examNotes[i][0] = kb.nextInt();

            System.out.printf("%d. Öğrencinin 2. sınav notunu giriniz: ", i + 1);
            examNotes[i][1] = kb.nextInt();

            System.out.printf("%d. Öğrencinin 3. sınav notunu giriniz: ", i + 1);
            examNotes[i][2] = kb.nextInt();
        }

        for (int i = 0; i < numberOfStudents; i++) {
            double average = (examNotes[i][0] + examNotes[i][1] + examNotes[i][2]) / 3.0;
            System.out.printf("%s %s'nin not ortalaması: %.2f%n", names[i], surnames[i], average);
        }
    }
}
