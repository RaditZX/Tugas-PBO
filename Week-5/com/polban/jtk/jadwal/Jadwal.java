package com.polban.jtk.jadwal;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Jadwal {
    private String hari;
    private MataKuliah matakuliah;
    private LocalTime waktuMulai;
    private LocalTime waktuSelesai;
    private String ruangan;
    private List<Mahasiswa> daftarMahasiswa;
    private String namaDosen;

    // Constructor
    public Jadwal(String hari, MataKuliah matakuliah, LocalTime waktuMulai, LocalTime waktuSelesai, String ruangan, String namaDosen) {
        this.hari = hari;
        this.matakuliah = matakuliah;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.ruangan = ruangan;
        this.daftarMahasiswa = new ArrayList<>();
        this.namaDosen = namaDosen;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public MataKuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public LocalTime getWaktuMulai() {
        return waktuMulai;
    }

    public void setWaktuMulai(LocalTime waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    public LocalTime getWaktuSelesai() {
        return waktuSelesai;
    }

    public void setWaktuSelesai(LocalTime waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public List<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public void setDaftarMahasiswa(List<Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        this.daftarMahasiswa.add(mahasiswa);
    }

    public void hapusMahasiswa(Mahasiswa mahasiswa) {
        this.daftarMahasiswa.remove(mahasiswa);
    }

    public void displayJadwal() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.printf("| %-17s | %-17s | %-17s | %-17s | %-17s | %-17s  | Mahasiswa:\n",
                hari,
                waktuMulai.format(timeFormatter),
                waktuSelesai.format(timeFormatter),
                ruangan,
                matakuliah.getNamaMataKuliah(),
                matakuliah.getDosen(namaDosen).getName());

        // Menampilkan daftar mahasiswa
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.printf("|                   |                   |                   |                   |                   |                    | %-20s |\n", mhs.getName());
        }
        System.out.println("+-------------------+-------------------+-------------------+-------------------+-------------------+--------------------+----------------------+");
    }
}
