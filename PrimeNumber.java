import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i==0) {
                System.out.println("Not prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
