public class Test {
    public static void main(String[] args) {
        Contacts c1 = new Contacts("saman@sjp.ac.lk", "071-7206401", "No 2, Colombo 07");
        Author a1 = new Author("Saman Perera", c1);

        Contacts c2 = new Contacts("dean@sjp.ac.lk", "011-2500400", "Nugegoda");
        Publisher p1 = new Publisher("SJP", c2);

        Author aus[] = new Author[3];
        aus[0] = a1;

        Book b1 = new Book("IoT in Medicine", aus, p1, 2016, "1307894566", "Second", 1650.00);
        Conference conf1 = new Conference("Iot in Medicine", aus, p1, 2018, "iCMA", "Galle");
        OralPresentation o1 = new OralPresentation("Iot in Medicine", aus, p1, 2018, "iCMA", "Galle", "Nuwan");
        PosterPresentation pos1 = new PosterPresentation("Iot in Medicine", aus, p1, 2018, "iCMA", "Galle", "6x4");

        Journal j1 = new Journal("IEEE", 18, 8);
        JournalArtical ja1 = new JournalArtical("Cyber Security", aus, p1, 2018, j1);
        AbstractPaper ap1 = new AbstractPaper("Cyber Security", aus, p1, 2018, j1, "CIA, ECC.");

        // System.out.println(c1);
        // System.out.println(a1);
        // System.out.println(p1);
        // System.out.println(b1);
        // System.out.println(conf1);
        // System.out.println(o1);
        // System.out.println(pos1);
        // System.out.println(j1);
        // System.out.println(ja1);
        System.out.println(ap1);
    }
}
