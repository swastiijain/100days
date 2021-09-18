import java.util.*;
public class day7 {
    public static void main(String[] args){

                Scanner s = new Scanner(System.in);

//        char ch = s.next().charAt(0);
//
//        if(ch>='A' && ch<='Z') {
//            System.out.println("upercase");
//        }
//        else if(ch>='a' && ch<='z'){
//            System.out.println("lowercase");
//        }
//        else {
//            System.out.println("incorrect");
////------------------------------------------------
//        System.out.println("Enter number:");
//        int n = s.nextInt();
//        int even = 0,odd = 0;
//        while(n>0){
//            int m = n%10;
//            int r = n%2;
//
//            if(r==0){
//                even = even + m;
//
//            }
//            else{
//                odd = odd + m;
//
//            }
//            n = n / 10;
//
//        }
//        System.out.print("sum of even digits of "+n);
//        System.out.println(even);
//        System.out.print("sum of odd digits of "+n);
//        System.out.println(odd);
///-----------------------------------------------------
        System.out.println("Enter x:");
        int x = s.nextInt();
        System.out.println("Enter n:");
        int nn = s.nextInt();
        int y=1,p=1;
        while(y<=nn){
           p = p * x;
           y++;
    }
        System.out.print(x);
        System.out.print("^"+nn);
        System.out.print("="+p);
//--------------------------

}}
