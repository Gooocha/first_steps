package homework;
import java.util.Scanner;

public class ex9 {
    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        if (n <= k){
            System.out.print(m*2);
        }
        if ((n > k)&&(n%k == 0)){
            System.out.print(m*2*2);
        }
        if ((n > k)&&(n%k != 0)){
            System.out.print(n/k*m*2+m);
        }

    }
}

