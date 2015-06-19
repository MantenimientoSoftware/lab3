/**
 * Created by usuario on 19/06/2015.
 */
public class Administrator extends User {
    String[] Permissions;
    String[] Role;

    public Administrator() {
        this.Permissions = null;
        this.Role = null;
    }

    public Administrator(String[] permissions, String[] role) {
        this.Permissions = permissions;
        this.Role = role;
    }

    public String[] getPermissions() {
        return Permissions;
    }

    public void setPermissions(String[] permissions) {
        Permissions = permissions;
    }

    public String[] getRole() {
        return Role;
    }

    public void setRole(String[] role) {
        Role = role;
    }
}
