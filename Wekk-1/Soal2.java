public class Soal2 {
    public static void main(String[] args) {
        int i = 42;
        String a = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
        System.out.println(a);
    }
}

//hasil
//hasil: everything

//Penjelasan
//Source code ini mengandung kosep tenary untuk menentukan value dari variabel a yang bertipe data string. Nilai dari variabel a ini akan bergantung dengan nilai
//i. Dalam konsep tenary ini mirip dengan konsep if else dimana terdapat kondisi yang menentukan value dari variabel a, dimana untuk gambaran sistem mengeksekusi kode ini adalah sebagai berikut:
//1. Saat masuk pada proses assignment variabel a sistem akan mencoba menentukan apakah i lebih kecil dari 40 (i disini bernilai 42)? ternyata i lebih besar dari 40 maka kalimat life tidak akan di assign ke variabel a
//   karena life akan di assign ke a jiga i < 40 (apabila premis di sebelah tanda tanya bernilai benar)
//2. Sistem akn masuk ke kondisi false dari tenary yang disini berisi tenary kemnbali (nested tenary) yang kembali menanyakan apakah i > 50 yang kembali lagi ternyata i tidak lebih besar dari 50 maka akan masuk ke kondisi false
//   yaitu kalimat everything maka dari itu kalimat everything la yang di assign ke variabel a dan ketika variabel a di print menampilkan kalimat everything
