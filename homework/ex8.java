package homework;
import java.util.Scanner;
public class ex8 {
    static public void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (Math.abs(a - b) == Math.abs(c- d)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
