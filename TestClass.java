import java.util.Scanner;

public class TestClass {
    public static final int MAX_PUBLICATIONS = 100;
    public static int index = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Publication[] publication = new Publication[MAX_PUBLICATIONS];
        int choice;

        do {
            printMainMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:
                    publication[index] = inpuBook();
                    index++;
                    break;
                case 3:
                    printPublications(publication);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        } while (choice != 4);
    }

    public static void printMainMenu() {
        System.out.println("\n\t\tMain Menu");
        System.out.println("\t\t==========");
        System.out.println("(1)Add hard coded objects");
        System.out.println("(2)Add a book");
        System.out.println("(3)Print publications");
        System.out.println("(4)Exit\n");
        System.out.print("\nEnter your choice[1-4]: ");
    }

    public static void printPublications(Publication[] publication) {
        /*
         * for (int i = 0; i < index; i++) {
         * publication[i].toString();
         * }
         */

        for (Publication index : publication) {
            if (index != null) {
                System.out.println(index.toString());
            }
        }
    }

    public static Contacts inputContact() {
        Scanner input = new Scanner(System.in);
        String email;
        String telephone;
        String address;

        System.out.print("Enter Email: ");
        email = input.nextLine();
        System.out.print("Enter Telephone: ");
        telephone = input.nextLine();
        System.out.print("Enter Address: ");
        address = input.nextLine();

        Contacts c = new Contacts(email, telephone, address);
        return c;
    }

    public static Author inputAuthor() {
        Scanner input = new Scanner(System.in);
        String authorName;

        System.out.print("Enter Author Name: ");
        authorName = input.nextLine();

        System.out.println("Enter Author Contact Details: ");
        Contacts c = inputContact();

        Author a = new Author(authorName, c);
        return a;
    }

    public static Publisher inputPublisher() {
        Scanner input = new Scanner(System.in);
        String publisherName;

        System.out.print("Enter Publisher Name: ");
        publisherName = input.nextLine();

        System.out.println("Enter Publisher Contact Details: ");
        Contacts c = inputContact();

        Publisher p = new Publisher(publisherName, c);
        return p;
    }

    public static Book inpuBook() {
        Scanner input = new Scanner(System.in);
        String bookName;
        String isbn;
        String edition;
        double price;
        int year;

        System.out.print("Enter Title of the Book: ");
        bookName = input.nextLine();

        Author a = inputAuthor();
        Author[] authors = { a };

        System.out.print("Enter ISBN of the Book: ");
        isbn = input.nextLine();
        System.out.print("Enter Edition of the Book: ");
        edition = input.nextLine();
        System.out.print("Enter Year of Published: ");
        year = input.nextInt();

        Publisher p = inputPublisher();

        System.out.print("Enter Price of the Book: ");
        price = input.nextDouble();

        Book b = new Book(bookName, authors, p, year, isbn, edition, price);

        return b;
    }
}
