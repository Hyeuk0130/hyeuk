import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // 색종이 개수 입력
        int[][] paper = new int[100][100]; // 100x100 도화지를 2차원 배열로 표현
        int area = 0;                      // 색종이가 차지하는 넓이

        for (int k = 0; k < n; k++) {      // 색종이 개수만큼 반복
            int x = sc.nextInt();          // 색종이의 왼쪽 아래 x좌표
            int y = sc.nextInt();          // 색종이의 왼쪽 아래 y좌표

            // 색종이 크기는 항상 10x10
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    paper[i][j] = 1;       // 색종이가 덮인 칸을 1로 표시
                }
            }
        }

        // 도화지 전체를 돌면서 색종이가 덮인 칸 개수 세기
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    area++;
                }
            }
        }

        System.out.println(area);          // 최종 넓이 출력
    }
}