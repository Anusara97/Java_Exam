public class Conference extends Publication {
    private String conferenceName;
    private String location;

    public Conference(String title, Author[] authors, Publisher publisher, int year, String conferenceName,
            String location) {
        super(title, authors, publisher, year);
        setConferenceName(conferenceName);
        setLocation(location);
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        String msg = super.toString() + " However, it is published in the conference of " + getConferenceName()
                + " that is held in " + getLocation() + " in year " + super.getYear();
        return msg;
    }
}
