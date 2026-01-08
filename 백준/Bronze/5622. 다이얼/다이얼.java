import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int time = 0;
        for(int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            
            if("ABC".indexOf(c) >= 0) time += 3;
            else if("DEF".indexOf(c)>=0) time +=4;
            else if("GHI".indexOf(c)>=0) time +=5;
            else if ("JKL".indexOf(c) >= 0) time += 6;
            else if ("MNO".indexOf(c) >= 0) time += 7;
            else if ("PQRS".indexOf(c) >= 0) time += 8;
            else if ("TUV".indexOf(c) >= 0) time += 9;
            else if ("WXYZ".indexOf(c) >= 0) time += 10;
        }
        System.out.println(time);
    }
}