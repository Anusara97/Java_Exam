public class FullPaper extends AbstractPaper {
    private String pages;

    public FullPaper(String title, Author[] authors, Publisher publisher, int year, Journal journal,
            String keywords, String pages) {
        super(title, authors, publisher, year, journal, keywords);
        setPages(pages);
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPages() {
        return pages;
    }

    @Override
    public String toString() {
        String msg = super.toString() + " Moreover, the full paper is in pages from " + getPages();
        return msg;
    }
}
