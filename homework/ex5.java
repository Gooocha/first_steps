package homework;
import java.util.Scanner;
public class ex5 {
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in); /// a*x+b=0
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == 0 && b ==0  ){

            System.out.print("inf");

        }
        if (a > b){
            System.out.println("1  ");
        }
        if ( a < b ){
            System.out.println("0");

        }
    }
}
