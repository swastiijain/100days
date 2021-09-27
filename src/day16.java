import java.util.Scanner;
public class day16 {
    public static void main(String[] args) {
//         int a= 2&3;
//         int b = 2|3;
//         int c = 2^3;
//         int d = ~2;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
//        for(int i = 1;i<=n;i++){
//
//            for(int j=1;j<=i;j++){{
//                System.out.print("*");
//            }
//                System.out.println();
}
            for(int i = 1;i<=n;i++) {
                for (int j = n; j >= i; j--) {
                    System.out.print("*");
                }
            }


    }


    }}
