import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double creditSum = 0; // 학점 합

        for (int i = 0; i < 20; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            double grades = Double.parseDouble(parts[1]);
            String grade = parts[2];

            if (grade.equals("A+")) {
                sum += grades * 4.5;
                creditSum += grades;
            } else if (grade.equals("A0")) {
                sum += grades * 4.0;
                creditSum += grades;
            } else if (grade.equals("B+")) {
                sum += grades * 3.5;
                creditSum += grades;
            } else if (grade.equals("B0")) {
                sum += grades * 3.0;
                creditSum += grades;
            } else if (grade.equals("C+")) {
                sum += grades * 2.5;
                creditSum += grades;
            } else if (grade.equals("C0")) {
                sum += grades * 2.0;
                creditSum += grades;
            } else if (grade.equals("D+")) {
                sum += grades * 1.5;
                creditSum += grades;
            } else if (grade.equals("D0")) {
                sum += grades * 1.0;
                creditSum += grades;
            } else if (grade.equals("F")) {
                creditSum += grades;
            } else if (grade.equals("P")) {
                continue; // P는 계산에서 제외
            }
        }

        double avg = sum / creditSum;
        System.out.println(avg);
    }
}