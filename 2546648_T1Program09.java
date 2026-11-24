import java.util.Scanner;

class T1Program09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = Math.abs(n);
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (n < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}
