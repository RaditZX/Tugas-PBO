public class hasilSoal1 {
    String nilai;
    boolean isShort;
    boolean isInteger;
    boolean isLong;

    public hasilSoal1(String nilai, boolean isShort, boolean isInteger, boolean isLong) {
        this.nilai = nilai;
        this.isShort = isShort;
        this.isInteger = isInteger;
        this.isLong = isLong;
    }

    public void printResult() {
        if(!isShort && !isInteger && !isLong) {
            System.out.println("Value: " + nilai);
            System.out.println("Doesn't fit anywhere");
            System.out.println("------------------------");
        }else {
            System.out.println("Value: " + nilai);
            System.out.println("Fits in Short: " + isShort);
            System.out.println("Fits in Integer: " + isInteger);
            System.out.println("Fits in Long: " + isLong);
            System.out.println("------------------------");
        }
    }
}
