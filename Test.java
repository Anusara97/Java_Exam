public class Test {
    public static void main(String[] args) {
        Contacts c1 = new Contacts("saman@sjp.ac.lk", "071-7206401", "No 2, Colombo 07");
        Author a1 = new Author("Saman Perera", c1);

        Contacts c2 = new Contacts("dean@sjp.ac.lk", "011-2500400", "Nugegoda");
        Publisher p1 = new Publisher("SJP", c2);

        Author aus[] = new Author[3];
        aus[0] = a1;

        Book b1 = new Book("IoT in Medicine", aus, p1, 2016, "1307894566", "Second", 1650.00);

        // System.out.println(c1);
        // System.out.println(a1);
        // System.out.println(p1);
        System.out.println(b1);
    }
}
