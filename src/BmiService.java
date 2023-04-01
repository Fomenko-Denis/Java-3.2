public class BmiService {
    public int calculate(double heightInMeters, double weightInKg) {
        double imt = weightInKg / Math.pow(heightInMeters, 2);
        return (int) imt;
    }
}
