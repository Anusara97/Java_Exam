public abstract class Publication implements IPublication {
    private String title;
    private Author[] authors;
    private Publisher publisher;
    private int year;

    public Publication(String title, Author[] authors, Publisher publisher, int year) {
        setTitle(title);
        setAuthor(authors);
        setPublisher(publisher);
        setYear(year);
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setAuthor(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("The year cannot be negetive");
        }
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Author[] getAuthors() {
        return authors;
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        String msg = " The publication " + getTitle() + " is written by " + getAuthors()[0].toString()
                + getPublisher().toString();
        return msg;
    }

}