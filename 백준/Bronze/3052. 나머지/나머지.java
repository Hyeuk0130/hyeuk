import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; // 입력값 저장
        int[] nar = new int[10]; // 나머지 저장

        // 입력 받기
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        // 나머지 계산
        for(int i = 0; i < 10; i++){
            nar[i] = arr[i] % 42;
        }

        // 정렬
        Arrays.sort(nar);

        // 서로 다른 값 개수 세기
        int count = 1; // 첫 번째 값 포함
        for(int i = 1; i < nar.length; i++){
            if(nar[i] != nar[i-1]){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}