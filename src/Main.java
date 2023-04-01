public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.80;
        double weightInKg = 90;
        int imt = service.calculate(heightInMeters, weightInKg);
        System.out.println("Ваш индекс массы тела" + imt);
    }
}