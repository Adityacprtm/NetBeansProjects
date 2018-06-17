package Contact;

public class Address {

    private String city;
    private String country;
    private String poBox;
    private String province;
    private String street;
    private String streetNumber;

    public void finalize() throws Throwable {

    }

    public Address() {

    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPoBox(String pobox) {
        this.poBox = pobox;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNumber(String streetnumber) {
        this.streetNumber = streetnumber;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPoBox() {
        return this.poBox;
    }

    public String getProvince() {
        return this.province;
    }

    public String getStreet() {
        return this.street;
    }

    public String getStreetNumber() {
        return this.streetNumber;
    }
}
