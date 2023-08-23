import java.util.Scanner;

public class sixthTask {
    public static void main(String[] args) {
        System.out.println("Please input a number!");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i ==0) {
                isPrime = false;
                break;
            } else if (num < 2) {
                System.out.println("False Error");
                isPrime = false;

            }

        }
        if (isPrime){
            System.out.println(num  + " Is a prime number");
        } else {
            System.out.println( num  + " Is not a prime number" );
        }
    }
}
