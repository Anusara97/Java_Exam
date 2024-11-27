public class AbstractPaper extends JournalArtical {
    private String keywords;

    public AbstractPaper(String title, Author[] authors, Publisher publisher, int year, Journal journal,
            String keywords) {
        super(title, authors, publisher, year, journal);
        setKeywords(keywords);
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getKeywords() {
        return keywords;
    }

    @Override
    public String toString() {
        String msg = super.toString() + ". However, the keywords of its abstract are " + getKeywords();
        return msg;
    }

}
