import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // 방 번호 입력

        int N = 1; // 층 번호 (시작은 1층)
        int max = 1; // 현재 층의 마지막 번호

        // X가 속한 층을 찾을 때까지 반복
        while (X > max) {
            max += 6 * N; // 다음 층의 마지막 번호
            N++;
        }

        System.out.println(N);
    }
}