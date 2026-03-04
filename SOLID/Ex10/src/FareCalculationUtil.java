public class FareCalculationUtil {
    public static double calculateFare(double km) {
        return Math.round((50.0 + km * 6.6666666667) * 100.0) / 100.0;
    }
}
