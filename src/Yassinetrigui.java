public class Trigui_yassine {

   // Function to calculate the GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //// Function to calculate the PPCC (LCM)
    public static int ppcc(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    // Function to check if a number is odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
// Conflit avec la branche master