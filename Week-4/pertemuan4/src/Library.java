import java.util.List;

class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Book: " + book.getTitle());
        }
    }
}