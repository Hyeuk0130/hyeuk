import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for(int i = 0; i<N; i++){
            for(int t = 0; t<M; t++){
                arr[i][t] = sc.nextInt();
            }
        }
        for(int i = 0; i<N; i++){
            for(int t = 0; t<M; t++){
                arr[i][t] += sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int t = 0; t<M; t++){
                System.out.print(arr[i][t]+" ");
            }
            System.out.println();
        }
    }
}