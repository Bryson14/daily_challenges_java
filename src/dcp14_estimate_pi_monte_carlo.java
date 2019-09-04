import java.util.Random;

public class dcp14_estimate_pi_monte_carlo {

    public static void main(String[] args) {
    Random ran = new Random();

    int insideCircle = 0;
    int insideSquare = 0;

    for (int i = 0; i < 1000000; i++) {
        float x = ran.nextFloat();
        float y = ran.nextFloat();

        if (x*x + y*y < 1) {
            insideCircle++;
        }
        insideSquare++;
    }
    double pi = 4.0 * insideCircle / insideSquare;

    System.out.printf("estimation of pi %.3f", pi);
    }
}
