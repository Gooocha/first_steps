package homework;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a > b & a > c){
            System.out.print("наибольшее: "+a);
        }
        if (b > a & b > c){
            System.out.print("наибольшее: "+b);
        }
        if (c > a & c > b){
            System.out.print("наибольшее: "+c);
        }
    }

}
