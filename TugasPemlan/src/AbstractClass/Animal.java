package AbstractClass;

import java.util.Date;

public abstract class Animal {

    private String name;
    private Date birthDate;

    public Animal() {
        this.name = "";
        this.birthDate = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public abstract void breath();
    public abstract void eat();
    public abstract void sleep();
    public abstract void reproduce();
}
