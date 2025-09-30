import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = N/4;
        
        for(int i = 0; i < A; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}