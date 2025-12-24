import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<M; i++){
            int h = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int t=h-1; t<=j-1; t++){
                arr[t] = k;
                }
            }
        for(int val : arr){
            System.out.print(val + " ");
        }
        sc.close();
        }
    }