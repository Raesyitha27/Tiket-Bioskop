package entitiy;

public class Staff  {
    private String id_staff;
    private String nama;
    private String username = "elga";
    private String password= "123";


    public Staff(String id_staff, String nama) {
        this.id_staff = id_staff;
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public String getId_staff() {
        return id_staff;
    }

    public void setId_staff(String id_staff) {
        this.id_staff = id_staff;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
