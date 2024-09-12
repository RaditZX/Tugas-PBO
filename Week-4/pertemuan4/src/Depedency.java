public class Depedency {
    public static void main(String[] args) {
        Order order = new Order("12345");
        Customer customer = new Customer();
        customer.placeOrder(order); // Dependency: Customer uses Order
    }
}

