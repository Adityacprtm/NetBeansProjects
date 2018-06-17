package Tugas1;

import java.util.Date;

public class UserLogin {

    public String id;
    public Mahasiswa mhs = new Mahasiswa();
    public String password;
    public Date lastTimeLogin;
    public Date lastTimeLogout;
    public Date lastTimeWrongPassword;
    public int countWrongPassword;
    public boolean isBanned;
    public boolean isOnline;

    public UserLogin(Mahasiswa mahasiswa, String password) {
        this.mhs.nim = mahasiswa.nim;
        this.password = password;
    }

    public void setID(String s) {
        id = s;
    }

    public void setMhs(Mahasiswa s) {
        mhs.nim = s.nim;
    }

    public void setPassword(String s) {
        password = s;
    }

    public void login() {
        if (mhs.passwordLogin != password) {
            countWrongPassword++;
            lastTimeWrongPassword = new Date();
        }
        if (countWrongPassword == 3) {
            isBanned = true;
        }
        lastTimeLogin = new Date();
        isOnline = true;

    }

    public void logout() {
        lastTimeLogout = new Date();
        isOnline = false;
    }

    public boolean changePassword(String oldPass, String newPass, String renewPass) {
        boolean b = false;
        if (password == oldPass) {
            if (newPass == renewPass) {
                password = newPass;
                b = true;
            }

        } else {
            b = false;
        }
        return b;
    }
}
