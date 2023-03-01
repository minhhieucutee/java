package java1;
import java.util.Scanner;
public class Java52 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int temp = 0;
        while(i <= n){
            if(n % i == 0){
                temp++;
            }
            i++;
        }
        System.out.println(temp);
    }
}
