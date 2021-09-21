import java.util.Scanner;

public class blahh {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);


            System.out.println("1. factorial()");
            System.out.println("2. testArmstrong()");
            System.out.println("3. testPalindrome()");
            System.out.println("4. testPrime()");
            System.out.println("5. fibonacciSeries()");
            System.out.println("enter your choice:");
            int c = s.nextInt();
           // while(c!=0) {
    switch (c) {
        case 1: {
            System.out.println("Enter your number:");
            int n = s.nextInt();
            int fact = 1, i;
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.print("Factorial of " + n);
            System.out.println(" is " + fact);
            break;
        }
        case 2: {
            System.out.println("Enter your number:");
            int n = s.nextInt();
            int sum = 0, r;
            int nn = n;
            while (n > 0) {
                r = n % 10;
                sum = sum + r * r * r;
                n = n / 10;
            }
            if (nn == sum) {
                System.out.println("yes it is a angstrom number");
            } else {
                System.out.println("no it is not a angstrom number");
            }
            break;
        }
        case 3: {
            System.out.println("Enter your number:");
            int n = s.nextInt();
            int r, sum = 0;
            int nn = n;
            while (n > 0) {
                r = n % 10;
                sum = sum * 10 + r;
                n = n / 10;
            }
            if (nn == sum) {
                System.out.println("It is a palindrome no");
            } else
                System.out.println("Its not a paindrome number");
            break;
        }
        case 4: {
            System.out.println("Enter your number:");
            int n = s.nextInt();
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    System.out.println("it is not a prime number");
                    return;
                }
                i++;
            }
            System.out.println("It is a prime");
            break;
        }
        case 5: {
            System.out.println("prime" );
            break;
        }
    }
//}

        }
    }

