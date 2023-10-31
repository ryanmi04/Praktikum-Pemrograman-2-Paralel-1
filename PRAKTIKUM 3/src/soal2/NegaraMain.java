package soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class NegaraMain {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int jumlahNegara = userinput.nextInt();
        LinkedList<Negara> daftarNegara = new LinkedList<>();
        userinput.nextLine();

        for (int i = 0; i < jumlahNegara; i++){
            String namaNegara = userinput.nextLine();
            String jenisKepemimpinan = userinput.nextLine();
            String namaPemimpin = userinput.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                Negara N = new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, 0, 0, 0);
                daftarNegara.add(N);
            }
            else {
                int tanggalKemerdekaan = userinput.nextInt();
                int bulanKemerdekaan = userinput.nextInt();
                int tahunKemerdekaan = userinput.nextInt();
                userinput.nextLine();

                Negara N = new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
                daftarNegara.add(N);
            }
            }

        for (Negara N : daftarNegara){
            if (N.getJenisKepemimpinan().equalsIgnoreCase("monarki")){
                System.out.println("Negara " + N.getNamaNegara() + " mempunyai Raja bernama " + N.getNamaPemimpin() + "\n");
            }
            else if (N.getJenisKepemimpinan().equalsIgnoreCase("presiden")) {
                System.out.println("Negara " + N.getNamaNegara() + " mempunyai Presiden bernama " + N.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + N.getTanggalKemerdekaan() + " " + N.namaBulan(N.getBulanKemerdekaan()) + " " + N.getTahunKemerdekaan() + "\n");
            }
            else if(N.getJenisKepemimpinan().equalsIgnoreCase("perdana menteri")) {
                System.out.println("Negara " + N.getNamaNegara() + " mempunyai Perdana Menteri bernama " + N.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + N.getTanggalKemerdekaan() + " " + N.namaBulan(N.getBulanKemerdekaan()) + " " + N.getTahunKemerdekaan() + "\n");
            }
        }
        }
}