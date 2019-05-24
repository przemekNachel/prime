package cc;

public class PrimeChecker {

    public boolean isPrime(int number) {
        if (number < 2) return false;
        for(int divider = 2; divider < number; divider++) {
            if(number%divider == 0) {
                return false;
            }
        }
        return true;
    }
}
