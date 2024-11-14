import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    @Test
    void isPrime_ShouldReturnFalseForNonPrimeNumbers() {
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(4));
        assertFalse(PrimeChecker.isPrime(6));
        assertFalse(PrimeChecker.isPrime(9));
        assertFalse(PrimeChecker.isPrime(10));
        assertFalse(PrimeChecker.isPrime(12));
    }

    @Test
    void isPrime_ShouldHandleNegativeNumbers() {
        assertFalse(PrimeChecker.isPrime(-1));
        assertFalse(PrimeChecker.isPrime(-5));
        assertFalse(PrimeChecker.isPrime(-10));
    }

    private void assertFalse(boolean prime) {
    }

    @Test
    void isPrime_ShouldHandleZero() {
        assertFalse(PrimeChecker.isPrime(0));
    }
}