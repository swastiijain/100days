import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            char c = scan.next().charAt(0);
            int m1 = scan.nextInt();
            int m2 = scan.nextInt();
            int m3 = scan.nextInt();
            int avg= (m1+ m2+ m3)/3;
            System.out.println(c);
            System.out.println(avg);

        }
}
