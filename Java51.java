package java1;
import java.util.Scanner;
public class Java51 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n<=100){
            if(n % 2 == 0){
                System.out.print(n + " ");
            }
            n++;
        }
    }
}
