public class PrimeChecker {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for divisors from 2   up to n - 1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }

        return true; // No divisors found, so it's prime
    }

    public static void main(String[] args) {
        int number = 29;

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");

        }
    }
}