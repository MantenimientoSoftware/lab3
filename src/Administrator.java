/**
 * Created by usuario on 19/06/2015.
 */
public class Administrator extends User {
    private String[] Permissions;
    private String[] Role;
    private int counterRole;
    private int counterPermission;

    public Administrator() {
        this.Permissions = null;
        this.Role = null;
        this.counterRole = 0;
        this.counterPermission = 0;
    }

    public Administrator(String[] permissions, String[] role) {
        this.Permissions = permissions;
        this.Role = role;
        this.counterRole = 0;
        this.counterPermission = 0;
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

    public void addRole(String role){
        Role[counterRole]= role;
        counterRole++;
    }

    public void removeRole(String role){

    }

    public void addPermission(String permission){
        Permissions[counterPermission] = permission;
        counterPermission++;
    }

    public void removePermission(String permission){

    }
}

