import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initiazlization
        float nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        Scanner scanner = new Scanner(System.in);
        char nilaiIndex;

        //Input Nilai Mahasiswa
        System.out.println("Masukan Nilai Tugas: ");
        nilaiTugas = scanner.nextFloat();

        System.out.println("Masukan Nilai UTS: ");
        nilaiUTS = scanner.nextFloat();

        System.out.println("Masukan Nilai UAS: ");
        nilaiUAS = scanner.nextFloat();

        //Kalkulasi Nilai
        nilaiAkhir = (nilaiTugas * 20 / 100 ) + (nilaiUTS * 35 / 100) + (nilaiUAS * 45 / 100);

        //Penenentuan Nilai Index
        if(nilaiAkhir >= 80){
            nilaiIndex = 'A';
        }else if(nilaiAkhir >= 75 && nilaiAkhir < 80){
            nilaiIndex = 'B';
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 75) {
            nilaiIndex = 'C';
        } else if (nilaiAkhir >= 49 && nilaiAkhir < 65) {
            nilaiIndex = 'D';
        }else
            nilaiIndex = 'E';

        //Print nilai akhir dan nilai index akhir
        System.out.println("\nnilai Akhir : " + nilaiAkhir);
        System.out.println("Nlai Index Akhir : " + nilaiIndex);
        System.out.printf("Nilai Tugas : %f", nilaiTugas);
    }
}