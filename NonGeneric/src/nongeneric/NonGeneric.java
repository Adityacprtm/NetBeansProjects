package nongeneric;

class NonGen {

    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getob() {
        return ob;
    }

    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getSimpleName());
    }
}

public class NonGeneric {

    public static void main(String[] args) {
        NonGen integer_object = new NonGen(88);
        integer_object.showType();
        int v = (Integer) integer_object.getob();
        System.out.println("value: " + v);

        NonGen string_object = new NonGen("Non-Generics Test");
        string_object.showType();
        String str = (String) string_object.getob();
        System.out.println("value: " + str);

        integer_object = string_object;
        v = (Integer) integer_object.getob();
        System.out.println("value baru: " + v);
    }
}
