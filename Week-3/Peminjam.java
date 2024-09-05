public class Peminjam {
    private String nama;
    private String jabatan;
    private String noTelp;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public void pinjamBarang(Barang barang, int jumlahBarang, Teknisi teknisi ) {
        barang.setJumlahBarang(barang.getJumlahBarang() - jumlahBarang );
        System.out.printf("Barang %s dipinjam oleh %s, dipinjamkan oleh %s dan sisa barang sekarang adalah %d", barang.getNamaBarang(), nama, teknisi.getNama() ,barang.getJumlahBarang() );
    }

}
