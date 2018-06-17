package Contact;

import java.util.Date;

public class Group {

    private String groupName;
    private int id;
    private Person[] groupMember = new Person[5];
    private static int groupMemberCount = 0;

    public void finalize() throws Throwable {

    }

    public Group() {

    }
    public void setGroupMember (Person person) {
        
        this.groupMember[groupMemberCount] = person;
        groupMemberCount++;
    }
    public Person[] getGroupMember (){
        return groupMember;
    }
    public String getGroupName() {
        return this.groupName;
    }

    /**
     *
     * @param groupname
     */
    public void setGroupName(String groupname) {
        this.groupName = groupname;
    }

}
