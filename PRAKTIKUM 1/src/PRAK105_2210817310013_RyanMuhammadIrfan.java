import java.util.Scanner;
public class PRAK105_2210817310013_RyanMuhammadIrfan {
    public static void main(String[] args) {
        final double phi = 3.14;
        Scanner userinput = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = userinput.nextDouble();
        System.out.print("Masukan tinggi: ");
        double height = userinput.nextDouble();

        double volume = phi * (radius*radius) * height;

        System.out.printf("Volume tabung dengan jari jari volume %.1f cm " +
                "dan tinggi %.1f cm adalah %.3f m3",radius, height, volume);
    }
}