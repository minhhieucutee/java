package java1;
import java.util.Scanner;
public class Java32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println("a is an evan number");
        }
        else{
            System.out.println("a is an odd number");
        }
    }
}
