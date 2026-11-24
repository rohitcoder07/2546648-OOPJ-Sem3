import java.util.Scanner;
class T1Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        if (n < 0) {
            System.out.println("Not an Armstrong Number");
        } else {
            while (num > 0) {
                int digit = num % 10;
                sum += (int) Math.pow(digit, digits);
                num /= 10;
            }

            if (sum == n) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not an Armstrong Number");
            }
        }

        sc.close();
    }
}
