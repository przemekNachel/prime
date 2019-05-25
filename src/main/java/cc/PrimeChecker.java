package cc;

public class PrimeChecker {

    public boolean isPrime(int number) {
        for(int divider = 2; divider < number; divider++) {
            if(number%divider == 0) {
                return false;
            }
        }
        return number >= 2;
    }
}
