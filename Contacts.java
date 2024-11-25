public class Contacts {
    private String email;
    private String telephone;
    private String address;

    public Contacts(String email) {
        this(email, "not given");
    }

    public Contacts(String email, String telephone) {
        this(email, telephone, "not given");
    }

    public Contacts(String email, String telephone, String address) {
        setEmail(email);
        setTelephone(telephone);
        setAddress(address);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        String msg = "Email: " + getEmail() + " Telephone: " + getTelephone() + " Address: " + getAddress();
        return msg;
    }
}