import java.util.*;
public class day12 {
    public static void main(String[] args) {

         Scanner s= new Scanner(System.in);
//
//        int r=1;
//        int c=1;
//
//        System.out.println("Enter n:");
//        int n = s.nextInt();
//
//        while(r<=n){
//            System.out.print("*");
//            r=r+1;
//
//            while(c<=n){
//                System.out.print("*");
//                c = c +1;
//            }
//            System.out.println();
//        }
        System.out.println("Enter num;");
        int n = s.nextInt();
        int n1 = (n+1)/2;
        int n2 = n/2;;


        for(int i=1;i<=n1;i++) {
            for(int j=1;j<=n1-i;j++) {
                System.out.print(" ");
            }

            for(int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=1; i<=n2; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= n - 2*i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
