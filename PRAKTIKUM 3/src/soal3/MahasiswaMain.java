package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        while(true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int opsi = userinput.nextInt();

            switch (opsi) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    userinput.nextLine();
                    String nama = userinput.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = userinput.nextLine();

                    boolean nimUnik = true;
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        if(mahasiswa.getNim().equals(nim)){
                            nimUnik = false;
                            break;
                        }
                    }
                    if(nimUnik){
                        Mahasiswa mhs = new Mahasiswa(nama, nim);
                        daftarMahasiswa.add((mhs));
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    }
                    else {
                        System.out.println("Mahasiswa dengan NIM " + nim + " sudah ada" );
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String hapusNim = userinput.next();
                    for (Mahasiswa mahasiswa : daftarMahasiswa){
                        if (mahasiswa.getNim().equals(hapusNim)){
                            daftarMahasiswa.remove(mahasiswa);
                            System.out.println("Mahasiswa dengan NIM "+ hapusNim + " dihapus.");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukan NIM Mahasiswa yang akan dicari: ");
                    String cariNim = userinput.next();
                    for (Mahasiswa mahasiswa : daftarMahasiswa){
                        if (mahasiswa.getNim().equals(cariNim)){
                            System.out.println("Mahasiswa dengan NIM "+ cariNim + " atas nama " + mahasiswa.getNama() + " ditemukan.");
                            break;
                        }
                        else {
                            System.out.println("Mahasiswa dengan NIM "+ cariNim + " tidak ditemukan.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mahasiswa : daftarMahasiswa){
                        System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                    }
                    break;

                case 0:
                    System.out.println("Terima Kasih!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silahkan pilih lagi.");
            }
        }
    }
}