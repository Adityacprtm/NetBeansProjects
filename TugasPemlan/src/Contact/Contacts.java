package Contact;

public class Contacts {

    private Group[] groups = new Group[10];
    private static int personCount;
    private Person[] persons = new Person[5];
    private Person[] findPerson = new Person[5];
    private static int groupCount;

    public void finalize() throws Throwable {

    }

    public Contacts() {

    }

    public void findPerson(String name) {
        PhoneNumber[] findPhoneNumber = new PhoneNumber[personCount];
        int j = 0;
        for (int i = 0; i < personCount; i++) {
            if (this.persons[i].getFullName().contains(name)) {
                this.findPerson[j++] = this.persons[i];
            }
            for (int k = 0; k < personCount; k++) {
                findPhoneNumber = persons[i].hasPhoneNumber();
                if (findPhoneNumber[k] == null) {
                    continue;
                }

                if (findPhoneNumber[k].getPhoneNumber().contains(name)) {
                    this.findPerson[j++] = this.persons[i];
                }

            }
        }
        showFindPerson();
    }

    private void showFindPerson() {
        System.out.println("Show found : ");
        for (int i = 0; i <= 5; i++) {
            if (this.findPerson[i] == null) {
                break;
            }
            System.out.println((i + 1) + ". " + this.findPerson[i].getFullName());
        }
    }

    public void showPerson() {
        System.out.println("Show persons : ");
        for (int i = 0; i < 5; i++) {
            if (this.persons[i] == null) {
                break;
            }
            System.out.println((i + 1) + ". " + this.persons[i].getFullName());
        }
    }

    public void showGroup() {
        Person[] member = new Person[10];
        System.out.println("Show group : ");
        for (int i = 0; i < groups.length; i++) {
            if (this.groups[i] == null) {
                break;
            }
            System.out.println((i + 1) + ". " + this.groups[i].getGroupName());
            for (int j = 0; j < 5; j++) {
                member = groups[i].getGroupMember();
                if (member[j] == null) {
                    continue;
                }

                System.out.println("   - " + member[j].getFullName());

            }
        }
    }

    public void addPerson(Person addperson) {
        this.persons[personCount] = addperson;
        personCount++;
    }

    public void deletePerson(int index) {
        this.persons[index] = null;
        for (int i = index; i < personCount - 1; i++) {
            persons[i] = persons[i + 1];
        }
        persons[personCount - 1] = null;
        personCount--;
    }

    public void editPerson(int index, String fullName, String phoneNumber) {
        persons[index].setFullName(fullName);
    }

    public String getPerson(int index) {
        return persons[index].getFullName();
    }

    public void addGroup(Group group) {
        this.groups[groupCount] = group;
        groupCount++;
    }

    public void delGroup(int delgroup) {
        this.groups[delgroup] = null;
        for (int i = 0; i < groupCount - 1; i++) {

            groups[i] = groups[i + 1];

        }
        groups[groupCount - 1] = null;
        groupCount--;
    }

    public void editGroup(int index, String groupName) {
        groups[index].setGroupName(groupName);
    }

}
