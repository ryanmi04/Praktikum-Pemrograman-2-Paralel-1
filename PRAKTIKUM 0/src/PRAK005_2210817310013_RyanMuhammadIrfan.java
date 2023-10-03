import java.util.Scanner;

public class PRAK005_2210817310013_RyanMuhammadIrfan {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Masukan Makanan Favorit: ");
        String makananfavorit = userinput.nextLine();
        System.out.print("Masukan Hobi: ");
        String hobi = userinput.nextLine();

        System.out.println("Aku Suka Makan " + makananfavorit + ", dan Hobiku " + hobi);
    }
}