package entitys;

public  abstract class AbstractStaff {
    String usernameStaff;
    String passwordStaff;

    public AbstractStaff(String usernameStaff, String passwordStaff){
        this.usernameStaff = usernameStaff;
        this.passwordStaff = passwordStaff;

    }

    public String getUsernameStaff() {
        return usernameStaff;
    }

    public void setUsernameStaff(String usernameStaff) {
        this.usernameStaff = usernameStaff;
    }

    public String getPasswordStaff() {
        return passwordStaff;
    }

    public void setPasswordStaff(String passwordStaff) {
        this.passwordStaff = passwordStaff;
    }
}