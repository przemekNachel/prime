package cc;

public class PrimeChecker {

    public boolean isPrime(int number) {
        int dividers = 0;
        for(int divider = 1; divider <= number; divider++) {
            if(number%divider == 0) {
                dividers++;
            }
        }
        return dividers == 2;
    }
}
