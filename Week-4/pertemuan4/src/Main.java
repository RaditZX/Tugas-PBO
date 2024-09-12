import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Order order = new Order("12345");
        Customer customer = new Customer();
        customer.placeOrder(order);

        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Design Patterns");
        List<Book> books = Arrays.asList(book1, book2);

        Library library = new Library(books); // Aggregation: Library has books
        library.displayBooks();

        Animal myDog = new Dog(); // Inheritance: Dog inherits from Animal
        myDog.sound();

    }

}