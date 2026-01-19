import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                arr[i][j] = sc.nextInt();
                if(max<arr[i][j]){
                    max = arr[i][j];
                    max1 = i;
                    max2 = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((max1+1)+" "+(max2+1));
    }
}