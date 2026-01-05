import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] alpha = new int[26];
        for(int i = 0; i<26; i++){
            alpha[i] = -1;
        }
        for(int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            int idx = ch - 'a';
            if(alpha[idx] == -1){
                alpha[idx] = i;
            }
        }
        for(int i = 0; i<26; i++){
            System.out.print(alpha[i]+" ");
        }
    }
}