import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();

        int org = a;
        int rev = 0;

        while (a > 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }

        System.out.println("reverse number: " + rev);

        if (rev == org) {
            System.out.println("palindrome number");
        } else {
            System.out.println("non palindrome number");
        }
    }
}