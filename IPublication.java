public interface IPublication {
    public void setTitle(String title);

    public void setAuthor(Author[] authors);

    public void setPublisher(Publisher publisher);

    public void setYear(int year);

    public String getTitle();

    public Author[] getAuthors();

    public Publisher getPublisher();

    public int getYear();

    public String toString();
}
