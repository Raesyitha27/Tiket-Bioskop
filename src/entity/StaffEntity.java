package entity;

public class StaffEntity {
    private String id_Staff;
    private String nama_Staff;
    private String password;


    public StaffEntity(String id_Staff, String nama_Staff, String password) {
        this.id_Staff = id_Staff;
        this.nama_Staff = nama_Staff;
        this.password = password;
    }

    public String getId_staff() {
        return id_Staff;
    }

    public void setId_Staff(String id_Staff) {
        this.id_Staff = id_Staff;
    }

    public String getNama() {
        return nama_Staff;
    }

    public void setNama(String nama) {
        this.nama_Staff = nama_Staff;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
