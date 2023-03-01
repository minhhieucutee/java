package java1;
import java.util.Scanner;
public class Java46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        if(n>0){
            for(int i = 0; i <=n; i++){
                if (i % 2 != 0){
                    temp += i;
                }
            }
        }else if(n<0) {
            for(int i = 0; i>=n; i--){
                if (i % 2 != 0){
                    temp +=i;
                }
            }
        }
        System.out.println(temp);
    }
}
