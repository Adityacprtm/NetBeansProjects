package Contact;

public class MainContact {

    public static void main(String[] args) {
        Contacts contact = new Contacts();
        
        Person person1 = new Person();
        person1.setFullName("Muhammad Ryandrie Satria Diputra");
        PhoneNumber phone1 = new PhoneNumber();
        phone1.setPhoneNumber("08566204080");
        contact.addPerson(person1);
        person1.addPhoneNumber(PhoneNumber.MOBILE_PHONE_NUMBER_TYPE, phone1);
        Event event1 = new Event();
        event1.setDate("11-11-2011");
        person1.addEvent(Event.BIRTHDAY_TYPE, event1);
        
        Person person2 = new Person();
        person2.setFullName("Aditya Chamim Pratama");
        PhoneNumber phone2 = new PhoneNumber();
        phone2.setPhoneNumber("0811643165");
        contact.addPerson(person2);
        person1.addPhoneNumber(PhoneNumber.WORK_PHONE_NUMBER_TYPE, phone2);
        Event event2 = new Event();
        event2.setDate("30-3-2026");
        person2.addEvent(Event.ANNIVERSARY_TYPE, event2);
        
        Person person3 = new Person();
        person3.setFullName("Muhammad Ryan Firmansyah");
        PhoneNumber phone3 = new PhoneNumber();
        phone3.setPhoneNumber("0857654321");
        contact.addPerson(person3);
        person1.addPhoneNumber(PhoneNumber.FAX_NUMBER_TYPE, phone3);
        
        Person person4 = new Person();
        person4.setFullName("Anugrah Rasis Putra");
        PhoneNumber phone4 = new PhoneNumber();
        phone4.setPhoneNumber("0812346789");
        contact.addPerson(person4);
        person1.addPhoneNumber(PhoneNumber.MOBILE_PHONE_NUMBER_TYPE, phone4);
        
        Person person5 = new Person();
        person5.setFullName("Muhammad Taufiq Aryadi");
        PhoneNumber phone5 = new PhoneNumber();
        phone5.setPhoneNumber("085987631");
        contact.addPerson(person5);
        person1.addPhoneNumber(PhoneNumber.MOBILE_PHONE_NUMBER_TYPE, phone5);
        
        contact.showPerson();
        System.out.println("");

        //Group
        Group group1=new Group();
        group1.setGroupName("Family");
        group1.setGroupMember(person5);
        group1.setGroupMember(person2);
        group1.setGroupMember(person3);
        contact.addGroup(group1);
        Group group2 = new Group();
        group2.setGroupName("xxx");
        group2.setGroupMember(person1);
        group2.setGroupMember(person3);
        contact.addGroup(group2);
        contact.showGroup();
        System.out.println("");
        
        //find person
        contact.findPerson("Ad");
        
        
    }
}
