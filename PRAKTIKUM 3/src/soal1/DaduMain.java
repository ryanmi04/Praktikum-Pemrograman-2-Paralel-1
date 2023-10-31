package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class DaduMain {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        LinkedList<Dadu> daduList = new LinkedList<>();

        int jumlahDadu = userinput.nextInt();

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            dadu.acakNilai();
            daduList.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
        }


        int totalNilai = 0;
        for (Dadu dadu : daduList) {
            totalNilai += dadu.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
    }
}