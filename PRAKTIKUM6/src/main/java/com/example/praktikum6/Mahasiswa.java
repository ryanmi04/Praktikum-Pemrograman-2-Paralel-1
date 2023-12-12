package com.example.praktikum6;

public class Mahasiswa {
    private String nama, nim;

    public Mahasiswa(String nama, String nim) {
        this.nim = nama;
        this.nama = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}