public class Book extends Publication {
    private String isbn;
    private String edition;
    private double price;

    public Book(String title, Author[] authors, Publisher publisher, int year, String isbn) {
        this(title, authors, publisher, year, isbn, "First", 0.0);
    }

    public Book(String title, Author[] authors, Publisher publisher, int year, String isbn, String edition) {
        this(title, authors, publisher, year, isbn, edition, 0.0);
    }

    public Book(String title, Author[] authors, Publisher publisher, int year, String isbn, String edition,
            double price) {
        super(title, authors, publisher, year);
        setIsbn(isbn);
        setEdition(edition);
        setPrice(price);
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEdition() {
        return edition;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String msg = super.toString() + " In fact , it is the " + getEdition() + " of a book under the ISBN "
                + getIsbn() + " in year " + super.getYear() + " worth Rs: " + getPrice();
        return msg;
    }
}