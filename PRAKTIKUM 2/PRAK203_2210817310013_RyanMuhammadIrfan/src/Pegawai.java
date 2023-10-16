public class Pegawai {
    public String nama;
    //Pada baris ini terjadi error karena variabel asal bertipe data char tidak sesuai dengan method. Sehingga variabel asal di ubah menjadi String.
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //Pada baris ini terjadi error karena tidak menerima argumen atau parameter . Sehingga perlu ditambahkan argumen yang sesuai dengan tipe data dari parameter yaitu String.
    //public void setJabatan()
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}