package com.polban.jtk.jadwal;

import java.util.List;

public class Mahasiswa extends Person {
    private String nim;
    private int semester;
    private String jurusan;
    private String Prodi;


    public Mahasiswa(String nama, int age,String NIM,short semester, String Jurusan, String Prodi) {
        super(nama, age);
        this.nim = NIM;
        this.semester = semester;
        this.jurusan = Jurusan;
        this.Prodi = Prodi;


    }

    public String getNIM() {
        return nim;
    }

    public int getSemester() {
        return semester;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getProdi() {
        return Prodi;
    }


    public void setNIM(String NIM) {
        this.nim = NIM;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }
}
