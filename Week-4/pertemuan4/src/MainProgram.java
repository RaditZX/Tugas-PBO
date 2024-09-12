import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class MainProgram {
    public static void main(String[] args) {
        Product product = new Product("ROG GL 505VX",10000000, 10 );
        Sales sales = new Sales(product);

        System.out.println(sales);
    }
}
