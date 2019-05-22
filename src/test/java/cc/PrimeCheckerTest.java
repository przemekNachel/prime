package cc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeCheckerTest {

    private PrimeChecker primeChecker;

    @Before
    public void setUp() {
        primeChecker = new PrimeChecker();
    }

    @Test
    public void test_two() {
        Assert.assertTrue(primeChecker.isPrime(2));
    }

    @Test
    public void test_three() {
        Assert.assertTrue(primeChecker.isPrime(3));
    }

    @Test
    public void test_four() {
        Assert.assertFalse(primeChecker.isPrime(4));
    }
}
