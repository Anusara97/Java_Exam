public class JournalArtical extends Publication {
    private Journal journal;

    public JournalArtical(String title, Author[] authors, Publisher publisher, int year, Journal journal) {
        super(title, authors, publisher, year);
        setJournal(journal);
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public Journal getJournal() {
        return journal;
    }

    @Override
    public String toString() {
        String msg = super.toString() + " In fact, it is a journal artical that is published in " + getJournal()
                + " in year " + getYear();
        return msg;
    }
}
