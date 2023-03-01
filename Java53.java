package java1;
import java.util.Scanner;
public class Java53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = 1;
        while (b > 0) {
            t *= a;
            b--;
        }
        System.out.print(t);
    }
}
