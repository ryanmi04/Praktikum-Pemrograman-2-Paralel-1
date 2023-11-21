package soal1;

import java.util.Scanner;

public class HewanPeliharaan {
    private String nama;
    private String ras;
    Scanner userinput = new Scanner(System.in);

    public HewanPeliharaan(String r, String n){
        this.ras = r;
        this.nama = n;
    }

    public void display(){
        System.out.print("Nama Hewan Peliharaan: ");
        nama = userinput.nextLine();
        System.out.print("Ras: ");
        ras = userinput.nextLine();
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}