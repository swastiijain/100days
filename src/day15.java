import java.util.Scanner;


public class day15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int r=1,c=1;
//        int i = 1, j = 1;
        int n = s.nextInt();
//        while(r<=n){
//            c=n-1;
//            //int t=1;
//            while(c>=r){
//                System.out.print(" ");
//                //t++;
//                c--;
//            }
//            int t=1;
//            c=1;
//            while(c<=r){
//                System.out.print("*");
//                t++;
//                c++;
//            }
//            //r=1;
//            t=r-1;
//            c=1;
//            while(c<=r-1){
//                System.out.print("*");
//                t--;
//                c++;
//            }
//            System.out.println();
//            r++;
//        }
//        Scanner s = new Scanner(System.in);
//        int r=1,c=1;
//        int i = 1, j = 1;
//        int n = s.nextInt();
//        while(r<=n){
//            c=n-1;
//            //int t=r;
//            while(c>=r){
//                System.out.print(" ");
//                //t++;
//                c--;
//            }
//            int t=r;
//            c=1;
//            while(c<=r){
//                System.out.print(t);
//                t++;
//                c++;
//            }
//            //r=1;
//            int m=2;
//            int o=m;
//            c=1;
//            //t=t+2;
//            while(c<=r-1){
//                //t=t+2;
//                System.out.print(o);
//                o--;
//                c++;
//            }
//            o=o+2;
//            System.out.println();
//            r++;
//        }
        int rows = (n+1)/2;

        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--)
        {
            for (int j = rows - 1; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
