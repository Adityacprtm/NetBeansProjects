package Contact;

public class PhoneNumber {

    public static final int MOBILE_PHONE_NUMBER_TYPE = 101;
    public static final int FAX_NUMBER_TYPE = 102;
    public static final int WORK_PHONE_NUMBER_TYPE = 103;
    private String phoneNumber;
    private int type;
    public void finalize() throws Throwable {

    }

    public PhoneNumber() {
        this.phoneNumber = "";
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phonenumber) {
        this.phoneNumber = phonenumber;
    }
    public void setType (int type) {
        this.type = type;
    }
    public int getType(){
        return this.type;
    }
}
