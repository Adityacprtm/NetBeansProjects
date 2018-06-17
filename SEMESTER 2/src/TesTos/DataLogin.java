package TesTos;

public class DataLogin {

    public DataUser user;
    public int id;
    
    public DataLogin(int newIdLogin, String newNama, int newIdUser){
        this.user = new DataUser(newNama,newIdUser);
        this.id = newIdLogin;
        
        System.out.println("id login : " + newIdLogin);
        
    }
    
    
}
