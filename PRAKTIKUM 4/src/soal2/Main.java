package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        String nama, ras, warnabulu, kemampuanInput;

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukan pilihan: ");
        int pilihan = userinput.nextInt();
        userinput.nextLine();

        switch (pilihan){
            case 1:
                System.out.print("Nama hewan peliharaan: ");
                nama = userinput.nextLine();
                System.out.print("Ras: ");
                ras = userinput.nextLine();
                System.out.print("Warna Bulu: ");
                warnabulu = userinput.nextLine();
                Kucing k = new Kucing(ras, nama, warnabulu);
                k.displayDetailKucing();
                break;

            case 2:
                System.out.print("Nama hewan peliharaan: ");
                nama = userinput.nextLine();
                System.out.print("Ras: ");
                ras = userinput.nextLine();
                System.out.print("Warna Bulu: ");
                warnabulu = userinput.nextLine();
                System.out.print("Kemampuan : ");
                kemampuanInput = userinput.nextLine();
                String[] kemampuan = kemampuanInput.split(", ");
                Anjing a = new Anjing(ras, nama, warnabulu, kemampuan);
                a.displayDetailAnjing();
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}