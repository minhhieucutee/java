package java1;
import java.util.Scanner;
public class Java64 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0 && arr[i] % 2 != 0){
                temp += arr[i];
            }
        }
        System.out.print(temp);
    }
}
