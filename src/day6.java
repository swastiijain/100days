import java.util.Scanner;
public class day6 {
    public static void main(String[] args) {
        int i=1;
        Scanner s = new Scanner(System.in) ;
        System.out.println("Enter n:");
        int n = s.nextInt();
        while(i<=n){
            int j=1;
            while(j <= i) {
                System.out.print(j);
                j = j + 1;
            }
            System.out.println( );
            i = i + 1;
        }
        System.out.println();
        System.out.println("Enter n:");
        int m = s.nextInt();
        int x = 1;
        int j=1;
        while(i<=m){

            while(i <= j) {
                System.out.print(x);
                x=x+1;
                j = j + 1;
            }
            System.out.println( );
            i = i + 1;
        }
        Given a number N, print sum of all even numbers from 1 to N.
        int sum=0;
        int k = s.nextInt();
        while(i<=k)
        {
            if(i%2==0){
                sum=sum+i;
            }
            i = i+1;
        }
        System.out.println(sum);

        int f = s.nextInt();
        int e = s.nextInt();
        int w = s.nextInt();
        while(f<=w ){
            int c =(int)( (f - 32)*(5.0/9) ) ;
            System.out.println(f);
            System.out.print("");
            System.out.print(c);
            f= f+20;

        }

        int basic = s.nextInt();
        char c = s.next().charAt(0);
        int hra   =  (int)(basic * (20.0/100));
        int da    = (int)(basic * (50.0/100));

        int pf    = (int)(basic * (11.0/100));
                int sal = basic + hra +da - pf;
                if(c=='A'){
                    int allow = 1700;
                    int totalsalary = allow +sal;
                    System.out.println(totalsalary);
                    return;
                }
        if(c=='B'){
            int allow = 1500;
            int totalsalary = allow +sal;
            System.out.println(totalsalary);
            return;
        }
        if(c=='C'){
            int allow = 1300;
            int totalsalary = allow +sal;
            System.out.println(totalsalary);
            return;
        }




    }
}
