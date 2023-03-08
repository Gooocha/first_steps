package homework;
import java.util.Scanner;
public class ex6 {
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in); //ax^2+bx+c = 0
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = b^2 - 4*a*c;
        if (d == 0 ){
            System.out.print("1 корень");
        }
        if (d < 0){
            System.out.print("нет корней");
        }
        if (d > 0){
            System.out.print("2 корня");
        }


    }
}
