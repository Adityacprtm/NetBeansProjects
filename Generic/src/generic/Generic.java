package generic;

class Gen<T> {

    T ob; // declare an object of type T

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

public class Generic {

    public static void main(String[] args) {
        Gen<Integer> integer_object = new Gen<>(88);
        integer_object.showType();
        int v = integer_object.getob();
        System.out.println("value: " + v);

        Gen<String> string_object = new Gen<>("Generics Test");
        string_object.showType();
        String str = string_object.getob();
        System.out.println("value: " + str);

//        integer_object = string_object;
//        v = (Integer) integer_object.getob();
//        System.out.println("value baru: " + v);
    }
}
