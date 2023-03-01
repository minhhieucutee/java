package java1;
import java.util.Scanner;
public class Java70 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                sum++;
            }
        }
        System.out.print(sum);
    }
}
