package java1;
import java.util.Scanner;
public class Java74 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                sum++;
            }
        }
        System.out.print(sum);
    }
}
