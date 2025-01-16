package entitys;


public class StaffEntity extends AbstractStaff {

    private String idStaff;
    private String namaStaff;


    public StaffEntity(String idStaff, String namaStaff, String usernameStaff, String passwordStaff) {
        super(usernameStaff, passwordStaff);
        this.idStaff = idStaff;
        this.namaStaff = namaStaff;
    }


    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public String getNamaStaff() {
        return namaStaff;
    }

    public void setNamaStaff(String namaStaff) {
        this.namaStaff = namaStaff;
    }
}
