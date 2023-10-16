public class Kopi {
    public String namaKopi;
    public String ukuran;
    public double harga;
    private double pajak;
    private String Pembeli;

    public String getPembeli() {
        return Pembeli;
    }

    public void setPembeli(String pembeli){
        Pembeli = pembeli;
    }

    public double getPajak() {
        pajak = harga * 0.11;
        return pajak;
    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: " + harga);
    }

}