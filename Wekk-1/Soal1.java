public class Soal1 {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1 + angka2);

        System.out.println("hasil1 : "+hasil);
    }
}

//Penjelasan
//Hasil dari source code : -125
//Alasan: Karena kemampuan kapasitas nilai yang dapat ditampung tipe data byte adalah -128 sampai 127. Sedangkan source code diatas mencoba untuk
//menjumlahkan variabel angka1 dengan tipe data byte dan nilai 125 ditambahkan dengan variabel angka2 dengan nilai 6 dan hasilnya disimpan variabel hasil
//dengan tipe data byte yang tadi telah dijelaskan hanya dapat menampunag nilai mulai dari -128 sampai dengan 127 sedangkan hasil penjumlahan variabel angka1 dan angka2 adalah 131.
//otomatis disini terjadi kondisi overflow.

//Mengapa hasilnya -125?
//Secara matermatis byte terdiri dari 8 bit. Variabel angka1 dengan nilai 125 memiliki nilai bit 01111101 dan variabel angka2 memiliki nilai bit 00000110 yang apabila dijumlahkan menghasilkan
//10000011. Nilai `10000011` ini perlu diinterpretasikan dalam konteks dua's complement sebagai bilangan negatif.
//`10000011` dalam dua's complement diartikan sebagai angka negatif karena bit paling kiri adalah `1`.
//- Untuk menemukan angka negatifnya:
//  - Balik semua bit: `01111100`
//  - Tambahkan `1`: `01111101` (yang dalam desimal adalah `125`)
//
//- Jadi, `10000011` mewakili `-125`.
