public class Buah {
    String nama;
    double berat;
    double harga;
    double jumlah;
    double diskon;
    double harga_setelah_diskon;
    double harga_sebelum_diskon;

    public Buah(String nama, double berat, double harga , double jumlah){
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public void menghitung_harga_buah(){
        harga_sebelum_diskon = (harga/berat) * jumlah;
        diskon = Math.floor(jumlah/4) * 0.02 * (4 * harga);
        harga_setelah_diskon = harga_sebelum_diskon - diskon;
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", harga_sebelum_diskon);
        System.out.printf("Total Diskon: Rp%.2f\n", diskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", harga_setelah_diskon);
    }

    public void info(){
        System.out.println("Nama buah: " +nama);
        System.out.println("Berat: " +berat);
        System.out.println("Harga: " +harga);
        System.out.println("Jumlah Beli: " +jumlah+"kg");
        menghitung_harga_buah();
    }
}