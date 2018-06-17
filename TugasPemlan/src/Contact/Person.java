package Contact;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;
    private PhoneNumber[] phoneNumber = new PhoneNumber[10];
    private static int phoneNumberCount = 0;
    private PhoneNumber[] findPhoneNumber = new PhoneNumber[10];
    private Address addr;
    private Group groups;
    private Event[] events = new Event[10];
    private static int eventsCount;
    private int id;

    public void finalize() throws Throwable {
    }

    public Person() {
        this.fullName = "";
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setMiddleName(String middlename) {
        this.middleName = middlename;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFullName(String fullname) {
        this.fullName = fullname;
        String[] names = this.fullName.split(" ");
        if (names.length == 1) {
            this.firstName = names[0];
        } else if (names.length == 2) {
            this.firstName = names[0];
            this.lastName = names[1];
        } else if (names.length == 3) {
            this.firstName = names[0];
            this.middleName = names[1];
            this.lastName = names[2];
        } else if (names.length == 4) {
            this.firstName = names[0];
            this.middleName = names[1] + " " + names[2];
            this.lastName = names[3];
        }
    }

    public String getFullName() {
        if (this.middleName == (null)) {
            return this.firstName + " " + this.lastName;
        }
        else if (this.lastName == (null)) {
            return this.firstName;
        }
        else {
        return this.firstName + " " + this.middleName + " " + this.lastName;
        }
    }
    public PhoneNumber[] hasPhoneNumber (){
        return phoneNumber;
    }
    public String getPhoneNumber(int type) {
        for (int i = 0; i < phoneNumber.length; i++) {
            if (phoneNumber[i].getType() == type){
                return phoneNumber[i].getPhoneNumber();
            }
            
        }
        return null;
    }

    public void addPhoneNumber(int type, PhoneNumber phoneNumber) {
        phoneNumber.setType(type);
        this.phoneNumber[phoneNumberCount] = phoneNumber;
        phoneNumberCount++;
    }

    public void deletePhoneNumber(int index) {
        this.phoneNumber[index] = null;
        phoneNumberCount--;
        for (int i = index; i < phoneNumberCount; i++) {
            phoneNumber[i] = phoneNumber[i + 1];

        }
        phoneNumber[phoneNumberCount - 1] = null;
    }

    public void editPhoneNumber(int type, PhoneNumber phoneNumber) {
        this.phoneNumber[type] = phoneNumber;
    }

    public void addEvent(int type, Event events) {
        events.setType(type);
        this.events[eventsCount++] = events;
    }

    public void deleteEvent(int index) {
        this.events[index] = null;
        eventsCount--;
        for (int i = index; i < eventsCount-1; i++) {
            events[i] = events[i + 1];
            

        }
        events[eventsCount - 1] = null;
    }

    public void editEvent(int type, Event events) {
        this.events[type] = events;
    }
    
    public String getEvent (int index){
        if (this.events[index] == null) {
            return " ";
        }
        return this.events[index].getDate();
    }
    

}
