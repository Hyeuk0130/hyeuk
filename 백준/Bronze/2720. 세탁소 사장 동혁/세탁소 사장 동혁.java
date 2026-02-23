import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            int C = sc.nextInt(); // 센트 입력

            int Q = C / 25;   // 쿼터 개수
            C %= 25;

            int D = C / 10;   // 다임 개수
            C %= 10;

            int N = C / 5;    // 니켈 개수
            C %= 5;

            int P = C;        // 페니 개수 (나머지)

            System.out.println(Q + " " + D + " " + N + " " + P);
        }
    }
}