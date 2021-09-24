import java.util.*;
public class day13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r=1;
        int c=1;
        System.out.println("Enter n:");
        int n = s.nextInt();
//        while(r<=n){
//            c=1;
//            while(c<=n){
//                System.out.print(n);
//                c = c +1;
//            }
//            System.out.println();
//            r = r + 1;
//        }
// ----------------------------------------------------
//        while(r<=n){
//            c=1;
//            while(c<=n){
//                System.out.print(r);
//                c++;
//            }
//            System.out.println();
//            r++;
//        }
// -------------------------------------------------
//        while(r<=n){
//            c=1;
//            while(c<=n){
//                System.out.print(c);
//                c++;
//            }
//            System.out.println();
//            r++;
//        }
//-------------------------------------------------
//        while(r<=n){
//            c=1;
//            while(c<=n){
//
//                System.out.print(n-c+1);
//                c++;
//               // n--;
//            }
//            System.out.println();
//            r++;
//        }
// -----------------------------------------------------
//        while(r<=n){
//            c=1;
//            while(c<=r){
//                System.out.print(c);
//                c++;
//            }
//            System.out.println();
//            r++;
//        }
// ----------------------------------------------------
//        int t= 1;
//        while(r<=n){
//            c=1;
//
//            while(c<=r){
//
//                System.out.print(t);
//                t++;
//                c++;
//
//            }
//            System.out.println();
//            r++;
//        }
//-----------------------------------------------------
//        while(r<=n){
//            c=1;
//int t =r;
//            while(c<=r){
//
//                System.out.print(t);
//                t++;
//                c++;
//
//            }
//            System.out.println();
//            r++;
//        }
//--------------------------------------------------------
//        char i = 'A';
//        while(r<=n){
//            c=1;
//            i = 'A';
//            while(c<=n){
//                System.out.print(i);
//                i = ((char)(i + 1));
//                c++;
//
//            }
//            System.out.println();
//            r++;
//        }
//-------------------------------------------------------
//        char i = 'A';
//        while(r<=n){
//            c=1;
//            i = 'A';
//            while(c<=n){
//                System.out.print((char)(i+c-1));
//                c++;
//
//            }
//            System.out.println();
//            r++;
//        }
//--------------------------------------------------
//        char i = 'A';
//        while(r<=n) {
//            c = 1;
//            while (c <= r) {
//                System.out.print(i);
//                c++;
//            }
//            i = ((char) (i + 1));
//            System.out.println();
//            r++;
//        }
 //--------------------------------------------------------
//        char i = 'A';
//        while(r<=n) {
//            c = 1;
//
//            while (c <= r) {
//                System.out.print((char)(i+c-1));
//                c++;
//
//            }
//            i = ((char) (i + 1));
//            System.out.println();
//            r++;
//        }
//---------------------------------------------------------

//        int r,c;
//
//            for(r=n;r>=1;r--)
//            {
//                for(c=r;c<=n;c++)
//                {
//                    System.out.print((char)(c+64));
//                }
//                System.out.println("");
//            }
//---------------------------------------------------------------
        while(r<=n){
            c = 1;
            while(c<=n-r){
                System.out.print(" ");
                c++;
            }
            c=1;
            while(c<=r){
                System.out.print("*");
                c++;
            }
            System.out.println();
            r++;
        }
//-----------------------------------------------------------------
//        while(r<=n){
//            c = 1;
//            while(c<=n-r){
//                System.out.print(" ");
//                c++;
//            }
//            c=1;
//            int t=1;
//            while(c<=r){
//                System.out.print(t);
//                t++;
//                c++;
//            }
//            System.out.println();
//            r++;
//        }
//------------------------------------------------------
//        while(r<=n){
//            c = 1;
//            while(c<=n-r+1){
//                System.out.print("*");
//                c++;
//            }
//
//            System.out.println();
//            r++;
//        }
//-------------------------------------------------------
//        int t=n;
//        while(r<=n){
//            c = 1;
//
//            while(c<=n-r+1){
//                System.out.print(t);
//                c++;
//            }
//            t--;
//
//            System.out.println();
//            r++;
//        }

    }
}
