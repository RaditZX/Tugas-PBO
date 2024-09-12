import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class soal1 {
    public static void main(String[] args) {
        Product product = new Product("ROG GL 505VX",10000000, 10 );
        Sales sales = new Sales(product);
        sales.sellProduct(5);
        sales.restockProduct(12);
        sales.updateProductPrice(13000000);
        sales.updateProductPrice(-13000000);
    }
}
