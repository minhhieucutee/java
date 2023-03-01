package java1;
import java.util.Scanner;
public class Java41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        if (x>0){
            if(y>0){
                System.out.println("This point lies in the First quadrant");
            }
            else{
                System.out.println("This point lies in the Fourth quadrant");
            }
        }
        else{
            if(y>0) {
                System.out.println("This point lies in the Second quadrant");
            }
            else{
                System.out.println("This point lies in the third quadrant");
            }
        }
    }
}
