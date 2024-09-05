import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        ArrayList<Barang> listBarang = new ArrayList<>();
        Peminjam peminjam = new Peminjam();

        Barang barang1 = new Barang();
        barang1.setNamaBarang("Proyektor");
        barang1.setJenisBarang("elektronik");
        barang1.setJumlahBarang(10);
        barang1.setMerek("Panasonic");
        listBarang.add(barang1);

        // Add second Barang object
        Barang barang2 = new Barang();
        barang2.setNamaBarang("Terminal");
        barang2.setJenisBarang("elektronik");
        barang2.setJumlahBarang(10);
        barang2.setMerek("Xiaomi");
        listBarang.add(barang2);

        Teknisi listTeknisi[] = new Teknisi[2];

        listTeknisi[0] = new Teknisi();
        listTeknisi[0].setNama("Daffa");
        listTeknisi[0].setNoTelp("083123123");

        listTeknisi[1] = new Teknisi();
        listTeknisi[1].setNama("Pace");
        listTeknisi[1].setNoTelp("083123124");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama peminjam : ");
        String nama = scanner.next();

        System.out.print("Masukkan jabatan peminjam : ");
        String jenis = scanner.next();

        System.out.println("Masukkan noTelp");
        String noTelp = scanner.next();

        peminjam.setNama(nama);
        peminjam.setJabatan(jenis);
        peminjam.setNoTelp(noTelp);

        for (int i = 0; i < listBarang.size(); i++) {
            System.out.print((i + 1)+".");
            System.out.println(listBarang.get(i).getNamaBarang());
        }

        System.out.println("Masukkan nomor barang yang ingin di pinjam");
        int noBarang = scanner.nextInt();

        System.out.println("Masukkan jumlah barang yang ingin di pinjam");
        int jmlBarang = scanner.nextInt();

        for (int i = 0; i < listTeknisi.length; i++) {
            System.out.print((i + 1)+".");
            System.out.println(listTeknisi[i].getNama());
        }

        System.out.println("Masukkan nomor teknisi yang meminjamkan");
        int noTeknisi = scanner.nextInt();

        peminjam.pinjamBarang(listBarang.get(noBarang - 1), jmlBarang, listTeknisi[noTeknisi - 1]);




    }
}