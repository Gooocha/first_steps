import java.util.Scanner;
public class ex2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int time = scan.nextInt();
        if ((h * 3600 + m * 60) >= time)
        {
            System.out.println("УСПЕЛ");
        }
        else {
            System.out.println("ОПОЗДАЛ");
        }
    }
}