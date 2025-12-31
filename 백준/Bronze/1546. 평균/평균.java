import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i<N; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        double[] nar = new double[N];
        for(int i = 0; i<N; i++){
            nar[i] = (double)arr[i]/max*100;
        }
        double avg = 0;
        double count = 0;
        for(double val : nar){
            count +=val;
        }
        avg = count/nar.length;
        System.out.println(avg);
    }
}