import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,1,2,2,2,8};
        int rrr[] = {0,0,0,0,0,0};
        for(int i=0; i<6; i++){
            int num = sc.nextInt();
            rrr[i] = num;
        }
        for(int i = 0; i<6; i++){
            System.out.print(arr[i]-rrr[i]+" ");
        }
    }
}