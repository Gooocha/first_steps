package homework;
import java.util.Scanner;
public class ex4 {
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if ((a % 4 == 0 || a % 400 == 0) & a % 100 != 0){
            System.out.print("высокосный");
        }
        else {
            System.out.println("невысокосный");
        }
    }
}
