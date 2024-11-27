public class Journal {
    private String journalName;
    private int volume;
    private int issue;

    public Journal(String jounalName) {
        this(jounalName, 1, 1);
    }

    public Journal(String jounalName, int volume, int issue) {
        setJournalName(jounalName);
        setVolume(volume);
        setIssue(issue);
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public void setVolume(int volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            System.out.println("Volume number cannot be negetive.");
        }
    }

    public void setIssue(int issue) {
        if (volume > 0) {
            this.issue = issue;
        } else {
            System.out.println("Issue number cannot be negetive.");
        }
    }

    public String getJournalName() {
        return journalName;
    }

    public int getVolume() {
        return volume;
    }

    public int getIssue() {
        return issue;
    }

    @Override
    public String toString() {
        String msg = "Issue " + getIssue() + " of volume " + getVolume() + " of Journal of " + getJournalName();
        return msg;
    }
}
