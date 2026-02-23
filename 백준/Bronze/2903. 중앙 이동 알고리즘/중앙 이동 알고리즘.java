import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 단계 입력
        int side = (int)Math.pow(2, N) + 1; // 한 변의 점 개수
        int result = side * side;           // 전체 점 개수
        System.out.println(result);
    }
}