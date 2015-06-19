/**
 * Created by usuario on 19/06/2015.
 */
public class User {
    String name;
    String email;
    String username;
    String password;
    String loginstatus;

    public User() {
        this.name = "";
        this.email = "";
        this.username = "";
        this.password = "";
        this.loginstatus = "";
    }

    public User(String name, String email, String username, String password, String loginstatus) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.loginstatus = loginstatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(String loginstatus) {
        this.loginstatus = loginstatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean verifylogin(String uname , String pass){
        if(uname.equals(this.username)&&pass.equals(this.password))return true;
        return false;
    }
}
