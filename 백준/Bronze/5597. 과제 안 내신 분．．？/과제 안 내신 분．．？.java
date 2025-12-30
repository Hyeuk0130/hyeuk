import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];   // 1~30 학생 번호
        for(int i=0; i<30; i++){
            arr[i] = i+1;
        }

        // 입력받은 28명 제거
        for(int i=0; i<28; i++){
            int num = sc.nextInt();
            arr[num-1] = 0;   // 제출한 학생은 0으로 표시
        }

        // 남은 번호만 모으기
        int[] remain = new int[2];
        int idx = 0;
        for(int i=0; i<30; i++){
            if(arr[i] != 0){
                remain[idx++] = arr[i];
            }
        }

        // 정렬 후 출력
        Arrays.sort(remain);
        for(int r : remain){
            System.out.println(r);
        }

        sc.close();
    }
}