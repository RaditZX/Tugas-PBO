import com.polban.jtk.jadwal.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Dosen> listDosen = new ArrayList<>();

        // Membuat objek Dosen
        Dosen dsn1 = new Dosen("Dr. Budi", 45, "12321511321");
        Dosen dsn2 = new Dosen("Dr. Sari", 40, "12321511322");
        Dosen dsn3 = new Dosen("Dr. Andi", 50, "12321511323");
        Dosen dsn4 = new Dosen("Dr. Rina", 35, "12321511324");
        Dosen dsn5 = new Dosen("Dr. Ali", 55, "12321511325");
        Dosen dsn6 = new Dosen("Dr. Maya", 42, "12321511326");
        Dosen dsn7 = new Dosen("Dr. Johan", 48, "12321511327");
        Dosen dsn8 = new Dosen("Dr. Lisa", 38, "12321511328");
        Dosen dsn9 = new Dosen("Dr. Agus", 52, "12321511329");
        Dosen dsn10 = new Dosen("Dr. Tina", 37, "12321511330");

        listDosen.add(dsn1);
        listDosen.add(dsn2);
        listDosen.add(dsn3);
        listDosen.add(dsn4);
        listDosen.add(dsn5);
        listDosen.add(dsn6);
        listDosen.add(dsn7);
        listDosen.add(dsn8);
        listDosen.add(dsn9);
        listDosen.add(dsn10);

        List<Mahasiswa> listMahasiswa = new ArrayList<>();

        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Andi", 20, "1900001", (short) 3, "Teknik Informatika", "S1 Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Budi", 21, "1900002", (short) 3, "Teknik Informatika", "S1 Informatika");
        Mahasiswa mhs3 = new Mahasiswa("Cici", 19, "1900003", (short) 3, "Teknik Informatika", "S1 Informatika");
        Mahasiswa mhs4 = new Mahasiswa("Dina", 22, "1900004", (short) 3, "Teknik Informatika", "S1 Informatika");
        Mahasiswa mhs5 = new Mahasiswa("Eko", 20, "1900005", (short) 3, "Teknik Informatika", "S1 Informatika");
        Mahasiswa mhs6 = new Mahasiswa("Fina", 21, "1900006", (short) 3, "Teknik Informatika", "S1 Informatika");
        Mahasiswa mhs7 = new Mahasiswa("Gilang", 19, "1900007", (short) 3, "Teknik Informatika", "S1 Informatika");
        Mahasiswa mhs8 = new Mahasiswa("Hana", 20, "1900008", (short) 3, "Teknik Informatika", "S1 Informatika");
        Mahasiswa mhs9 = new Mahasiswa("Ivan", 22, "1900009", (short) 3, "Teknik Informatika", "S1 Informatika");
        Mahasiswa mhs10 = new Mahasiswa("Joko", 21, "1900010", (short) 3, "Teknik Informatika", "S1 Informatika");

        listMahasiswa.add(mhs1);
        listMahasiswa.add(mhs2);
        listMahasiswa.add(mhs3);
        listMahasiswa.add(mhs4);
        listMahasiswa.add(mhs5);
        listMahasiswa.add(mhs6);
        listMahasiswa.add(mhs7);
        listMahasiswa.add(mhs8);
        listMahasiswa.add(mhs9);
        listMahasiswa.add(mhs10);

        List<MataKuliah> listMataKuliah = new ArrayList<>();
        
        List<Dosen> dosenPemrograman = new ArrayList<>();
        dosenPemrograman.add(dsn1);
        dosenPemrograman.add(dsn2);

        List<Dosen> dosenStrukturData = new ArrayList<>();
        dosenStrukturData.add(dsn3);
        dosenStrukturData.add(dsn4);

        List<Dosen> dosenBasisData = new ArrayList<>();
        dosenBasisData.add(dsn5);

        List<Dosen> dosenSistemOperasi = new ArrayList<>();
        dosenSistemOperasi.add(dsn6);
        dosenSistemOperasi.add(dsn7);

        List<Dosen> dosenJaringanKomputer = new ArrayList<>();
        dosenJaringanKomputer.add(dsn8);
        dosenJaringanKomputer.add(dsn9);
        dosenJaringanKomputer.add(dsn10);

        // Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah("Pemrograman Java", (short) 3, "Wajib", dosenPemrograman);
        MataKuliah mk2 = new MataKuliah("Struktur Data", (short) 3, "Wajib", dosenStrukturData);
        MataKuliah mk3 = new MataKuliah("Basis Data", (short) 3, "Wajib", dosenBasisData);
        MataKuliah mk4 = new MataKuliah("Sistem Operasi", (short) 3, "Wajib", dosenSistemOperasi);
        MataKuliah mk5 = new MataKuliah("Jaringan Komputer", (short) 3, "Wajib", dosenJaringanKomputer);

        listMataKuliah.add(mk1);
        listMataKuliah.add(mk2);
        listMataKuliah.add(mk3);
        listMataKuliah.add(mk4);
        listMataKuliah.add(mk5);


        List<Jadwal> listJadwal = new ArrayList<>();

        Jadwal jadwal1 = new Jadwal("Senin", mk1, LocalTime.of(8, 0), LocalTime.of(10, 0), "Ruang 101", dosenPemrograman.get(0).getName());
        jadwal1.setDaftarMahasiswa(new ArrayList<>(listMahasiswa.subList(0, 5)));  // Mahasiswa 1-5

        Jadwal jadwal2 = new Jadwal("Senin", mk2, LocalTime.of(10, 0), LocalTime.of(12, 0), "Ruang 102", dosenStrukturData.get(0).getName());
        jadwal2.setDaftarMahasiswa(new ArrayList<>(listMahasiswa.subList(5, 10)));  // Mahasiswa 6-10

        Jadwal jadwal3 = new Jadwal("Selasa", mk3, LocalTime.of(8, 0), LocalTime.of(10, 0), "Ruang 103", dosenBasisData.get(0).getName());
        jadwal3.setDaftarMahasiswa(new ArrayList<>(listMahasiswa.subList(0, 3)));  // Mahasiswa 1-3

        Jadwal jadwal4 = new Jadwal("Selasa", mk4, LocalTime.of(10, 0), LocalTime.of(12, 0), "Ruang 104", dosenSistemOperasi.get(0).getName());
        jadwal4.setDaftarMahasiswa(new ArrayList<>(listMahasiswa.subList(3, 7)));  // Mahasiswa 4-7

        Jadwal jadwal5 = new Jadwal("Rabu", mk5, LocalTime.of(8, 0), LocalTime.of(10, 0), "Ruang 105", dosenJaringanKomputer.get(0).getName());
        jadwal5.setDaftarMahasiswa(new ArrayList<>(listMahasiswa.subList(7, 10)));  // Mahasiswa 8-10

        Jadwal jadwal6 = new Jadwal("Kamis", mk1, LocalTime.of(10, 0), LocalTime.of(12, 0), "Ruang 101", dosenPemrograman.get(1).getName());
        jadwal6.setDaftarMahasiswa(new ArrayList<>(listMahasiswa));  // Semua Mahasiswa

        listJadwal.add(jadwal1);
        listJadwal.add(jadwal2);
        listJadwal.add(jadwal3);
        listJadwal.add(jadwal4);
        listJadwal.add(jadwal5);
        listJadwal.add(jadwal6);




        // Menampilkan menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Tampilkan list mahasiswa");
        System.out.println("2. Tampilkan list Dosen");
        System.out.println("3. Tampilkan jadwal (senin-jumat)");
        System.out.println("Masukan Pilihan: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("List Mahasiswa : \n");
                for (Mahasiswa mhs : listMahasiswa) {
                    System.out.println(mhs.getName());
                }
                break;

            case 2:
                System.out.println("List Dosen : \n");
                for (Dosen dsn : listDosen) {
                    System.out.println(dsn.getName());
                }
                break;

            case 3:
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t TABEL JADWAL KULIAH");
                System.out.println("+-------------------+-------------------+-------------------+-------------------+-------------------+--------------------+----------------------+");
                System.out.println("|        Hari       |   Waktu Mulai     |  Waktu Selesai    |     Ruangan       |    Mata Kuliah    |       Dosen        | Mahasiswa ");
                System.out.println("+-------------------+-------------------+-------------------+-------------------+-------------------+--------------------+----------------------+");

                for (Jadwal jadwal : listJadwal) {
                    jadwal.displayJadwal();
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}

