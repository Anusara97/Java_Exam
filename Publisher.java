public class Publisher {
    private String publisherName;
    private Contacts contact;

    public Publisher(String publisherName, Contacts contact) {
        setPublisherName(publisherName);
        this.contact = contact;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String toString() {
        String msg = " The publisher is " + getPublisherName() + " and its contact details are " + contact.toString();
        return msg;
    }
}
