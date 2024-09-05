import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaItem = 50000;
        double totalBonus, totalGaji, totalDenda;

        System.out.print("Masukkan jumlah penjualan : ");
        int jml = sc.nextInt();

        long totalPenjualan = hargaItem * jml;

        if( jml >= 40 && jml <80){
            totalBonus = totalPenjualan * 25/100;
            totalDenda = 0;

        }else if( jml >= 80){
            totalBonus = totalPenjualan * 35/100;
            totalDenda = 0;

        } else if (jml < 15) {
            totalBonus =0;
            totalDenda = ((15 - jml) * hargaItem) * 15/100;

        } else{
            totalBonus = 0;
            totalDenda = 0;
        }

        totalGaji = 500000 + (jml > 15 && jml < 40? (totalPenjualan * 10 /100) : 0) + totalBonus - totalDenda;
        System.out.println("Total Gaji = " + totalGaji);



    }
}
