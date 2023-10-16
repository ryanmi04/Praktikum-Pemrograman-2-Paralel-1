public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Pada baris ini terjadi error karena kurangnya titik koma (;)
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //p1.umur tidak memiliki nilai sehingga harus diisi  17 untuk menghasilkan output yang sesuai
        p1.umur = 17;
        //Pada baris ini harus nya mengasilkan output Nama bukan Nama Pegawai. "Nama Pegawai" idubah menjadi "Nama"
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Menambahkan text "tahun" dalam print setelah nilai p1.umur agar sesuai dengan output
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " Tahun");
    }
}