import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {          // 다음 줄이 있으면 true, 없으면 false
            String line = sc.nextLine();    // 한 줄 읽기
            System.out.println(line);       // 그대로 출력
        }
    }
}