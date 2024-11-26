public class OralPresentation extends Conference {
    private String presenterName;

    public OralPresentation(String title, Author[] authors, Publisher publisher, int year, String conferenceName,
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
        String msg = super.toString() + " In fact, it is an oral presentation presented by " + getPresenterName();
        return msg;
    }
}
