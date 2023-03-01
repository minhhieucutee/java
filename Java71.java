package java1;
import java.util.Scanner;
public class Java71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int a = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                a = i;
                break;
            }
        }
        System.out.print(a);
    }
}