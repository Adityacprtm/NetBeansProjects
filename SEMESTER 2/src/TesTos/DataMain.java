package TesTos;

public class DataMain {

    public static void main(String[] args) {

//        DataUser orang1 = new DataUser();
//        orang1.nama = "QWERTY";
//        DataLogin login1 = new DataLogin();
//        login1.user = new DataUser();
//        login1.id = 1234;
//        login1.user = "";
//        System.out.println("id : " + login1.id);
//        System.out.println("nama : " + login1.user.nama);
        // 1234 = id user
        // new user = nama user
        // 0 = id login
        DataLogin login2 = new DataLogin(1234, "new user", 0);
        System.out.println("id login : " + login2.id);
        System.out.println("nama user : " + login2.user.nama);
        System.out.println("id user : " + login2.user.id);
    }
}
