package com.polban.jtk.jadwal;

import java.util.ArrayList;
import java.util.List;

public class MataKuliah {
    private String namaMataKuliah;
    private short semester;
    private String jenisMataKuliah;
    private List<Dosen> dosen;


    // Konstruktor
    public MataKuliah(String namaMataKuliah, short semester, String jenisMataKuliah, List<Dosen> dosen) {
        this.namaMataKuliah = namaMataKuliah;
        this.semester = semester;
        this.jenisMataKuliah = jenisMataKuliah;
        this.dosen = dosen;
    }

    // Getter dan Setter untuk namaMataKuliah
    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    // Getter dan Setter untuk semester
    public short getSemester() {
        return semester;
    }

    public void setSemester(short semester) {
        this.semester = semester;
    }

    // Getter dan Setter untuk jenisMataKuliah
    public String getJenisMataKuliah() {
        return jenisMataKuliah;
    }

    public void setJenisMataKuliah(String jenisMataKuliah) {
        this.jenisMataKuliah = jenisMataKuliah;
    }

    // Getter dan Setter untuk dosen
    public Dosen getDosen(String nama) {
        for (Dosen d : dosen) {
            if (d.getName().equalsIgnoreCase(nama)) {
                return d;
            }
        }
        return null;
    }

    public void setDaftarDosen(List<Dosen> dosen) {
        this.dosen = dosen;
    }


}
