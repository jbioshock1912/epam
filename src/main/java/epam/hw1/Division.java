package epam.hw1;

class Division {

    static int divide(int divisible, int divisor) {
        int count = 0;
        while ((divisible - divisor) >= 0) {
            count++;
            divisible = divisible - divisor;
        }
        return count;
    }
}
