public class PosterPresentation extends Conference {
    private String presenterName;

    public PosterPresentation(String title, Author[] authors, Publisher publisher, int year, String conferenceName,
            String location, String presenterName) {
        super(title, authors, publisher, year, conferenceName, location);
        setPresenterName(presenterName);
    }

    public void setPresenterName(String presenterName) {
        this.presenterName = presenterName;
    }

    public String getPresenterName() {
        return presenterName;
    }

    @Override
    public String toString() {
        String msg = super.toString() + ". In fact, it is a poster presentation of size " + getPresenterName();
        return msg;
    }
}
