import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r=1,c=1;
        int i = 1, j = 1;
        int n = s.nextInt();
        while(r<=n){
            c=n-1;
            while(c>=r){
                System.out.print(" ");
                //t++;
                c--;
            }
            int t=r;
            c=1;
            while(c<=r){
                System.out.print(t);
                t++;
                c++;
            }
            System.out.println();
            r++;
        }

    }
}
