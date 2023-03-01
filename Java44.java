package java1;
import java.util.Scanner;
public class Java44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = n; i >= -n; i--) {
                System.out.print(i + " ");
            }
        } else if (n < 0) {
            for (int i = n; i <= -n; i++) {
                System.out.print(i + " ");
            }
        } else{
            System.out.println(n);
        }
    }
}
