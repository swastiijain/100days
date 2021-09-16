import java.util.Scanner;
public class day5 {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in) ;

        System.out.println("Enter your num:");
            int n = s.nextInt();
            if(n%2==0){
                System.out.print(n);
                System.out.println(" is even.");
            return;}
            {
                System.out.print(n);
                System.out.println(" is odd");}

        System.out.println("Enter three numbers:");
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            if(x >= y && x >= z){
                System.out.print(x);
                System.out.println(" is the largest");}
            else if(y >= x && y >= z) {
                System.out.print(y);
                System.out.println(" is the largest");}
            else{
                System.out.print(z);
             System.out.println(" is the largest");}

        System.out.println("Enter your number:");
            int num = s.nextInt();
            int i=1;
            while(i <= num){
                System.out.println(i);
                i++;
            }

        System.out.println("Enter your number:");
        int a = s.nextInt();
        int j=2;
        while(j<a){
            if(a%j == 0){
                System.out.println("Not prime");
                return;
            }
            j++;

        }
        System.out.println("prime");





    }
    }






