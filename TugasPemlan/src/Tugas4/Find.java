package Tugas4;

import java.util.ArrayList;

public class Find {

    public static int find(ArrayList list, Object o) {

        try {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).getClass().equals(o.getClass())) {
                    throw new ClassMismatchException(list.get(i).getClass().getName(), o.getClass().getName());
                }
                if (list.get(i).equals(o)) {
                    return i;
                }else{
                    return -1;
                }
            }
        } catch (ClassMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return -1;
    }

    public static <E> int findGeneric(ArrayList list, E o) {

        try {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).getClass().equals(o.getClass())) {
                    throw new ClassMismatchException(list.get(i).getClass().getName(), o.getClass().getName());
                }
                if (list.get(i).equals(o)) {
                    return i;
                }
            }
        } catch (ClassMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return -1;
    }

    public static <E extends Number> int findGenericNumber(ArrayList list, E o) {

        try {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).getClass().equals(o.getClass())) {
                    throw new ClassMismatchException(list.get(i).getClass().getName(), o.getClass().getName());
                }
                if (list.get(i).equals(o)) {
                    return i;
                }
            }
        } catch (ClassMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return -1;
    }

}
