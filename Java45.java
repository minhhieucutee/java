package java1;
import java.util.Scanner;
public class Java45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        if(a<b){
            for (int i = a; i <= b; i++) {
                temp += i;
            }
            System.out.println(temp);
        }
        else if(a>b){
            for (int i = a; i >= b; i--) {
                temp += i;
            }
            System.out.println(temp);
        }
        else{
            System.out.println("a equal b");
        }
    }
}
