package Tugas4;

public class ClassMismatchException extends Exception {

    public ClassMismatchException(String className, String expectedClassName) {
        super("Class name: " + className + ", expected class name: " + expectedClassName);
    }
}
