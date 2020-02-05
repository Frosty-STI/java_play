import java.util.Scanner;
class Break_Primes {
    public static void main(final String[] args) {
        System.out.println("Enter a prime number.");
        final Scanner pribreak = new Scanner(System.in);
        final int primebreak = pribreak.nextInt();
        final double reverse = 1.0 / primebreak;
        final double extrapolation = primebreak * primebreak;
        System.out.println("Sorry, that isn't a prime. " + primebreak +  " is actually comprised of " + reverse + " * " + extrapolation + ". This is, in essence,"  + (reverse*extrapolation) + ".");
        pribreak.close(); 
    }
}