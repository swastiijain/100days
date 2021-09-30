import java.util.Scanner;
public class day19 {
        public static int factorial(int n){
        int f =1;
        for(int i= 1;i<=n;i++){
            f = f * i;
        }
        return f;
    }
    public static boolean prime(int num1){
    int d = 2;
    while(d<num1){
        if(num1%d==0){
            return false;
        }
        d++;
    }
    return true;
    }
    public static int print(int m){
        int a=1;
        while(a<m){
            System.out.println(a);
            a++;
        }
        return a;
    }
//    public static void print(int m){
//        for(int a=1;a<m;a++){
//            System.out.println(a);
//        }
//    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = s.nextInt();
        System.out.print("ENter r:");
        int r = s.nextInt();

        int num = factorial(n);
        int den1 = factorial(r);
        int den2 = factorial(n-r);

        System.out.print(n+" C "+r+"= ");
        int ans = num / (den1 *den2);
        System.out.println(ans);

        System.out.println("Enter number:");
        int num1 = s.nextInt();
        boolean res = prime(num1);
        System.out.println(res);

        System.out.println("Enter n:");
        int m = s.nextInt();
        int b = print(m);
        System.out.println(b);

    }
}
