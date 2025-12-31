import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //바구니 개수
        int M = sc.nextInt(); //바구니 역순으로 하는 방법 가짓수
        int[] arr = new int[N];
        for(int i = 1; i<=N; i++){ //바구니에 번호 적기 1~N
            arr[i-1] = i;
        }
        for(int t = 0; t<M; t++){
            int i = sc.nextInt() -1; //바구니 범위 i~j
            int j = sc.nextInt() -1;
            while(i<j){ //while 사용해서 i<j동안 역순으로 바꾸기
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}