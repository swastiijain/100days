import java.util.Scanner;

public class day20 {

    public static boolean prime(int n){
        int d = 2;
        while (d < n) {
            if (n % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }

    public static void print(int n) {
    for (int i = 2; i < n; i++) {
        boolean prime = prime(i);
        if (prime) {
            System.out.println(i);
        }
    }
}
public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = s.nextInt();
        System.out.println("prime Numbers from 1 to "+n);
        print(n);
        System.out.println();

    }
}
