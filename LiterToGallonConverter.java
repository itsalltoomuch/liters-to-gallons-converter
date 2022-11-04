
public class LiterToGallonConverter {
    public static void main(String[] args) {
        double liters, gallons;

        // 1 liter equals 3.7854 gallons
        System.out.println("LITERS\t\t\t\tGALLONS");
        for (liters = 1; liters <= 5; liters++) {
            gallons = liters * 0.2642;
            System.out.println(String.format("%.2f", liters) + "\t\t\t\t" + String.format("%.4f", gallons));
        }
    }
}
