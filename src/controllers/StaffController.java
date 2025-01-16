package controllers;

import entitys.StaffEntity;
import models.StaffModel;

import java.util.ArrayList;

public class StaffController implements StaffInterface {
    public boolean cekStaff(String usernameStaff, String passwordStaff) {
        boolean status = false;
        StaffModel.init();
        ArrayList<StaffEntity> staffEntities = StaffModel.getListStaff();
        for (StaffEntity staff : staffEntities) {
            if ((staff.getUsernameStaff().equals(usernameStaff)) && (staff.getPasswordStaff().equals(passwordStaff))) {
                status = true;
                System.out.println("\n LOGIN BERHASIL..");
            }
            else {
                System.out.println("\n LOGIN GAGAL..");
            }
        }
        return status;
    }
    public int getIndexStaff(String idStaff) {
        return StaffModel.getIndexStaff(idStaff);
    }
    public boolean addStaff(StaffEntity staff) {
        return StaffModel.addStaff(staff);
    }
    public ArrayList<StaffEntity> getListStaff() {
        return StaffModel.getListStaff();
    }
    public int editNamaStaff(String idStaff, String namaStaff) {
        int status = StaffModel.editNamaStaff(idStaff, namaStaff);
        return status;
    }
    public int editUsernameStaff(String idStaff, String usernameStaff) {
        int status = StaffModel.editUsernameStaff(idStaff, usernameStaff);
        return status;
    }
    public int editPasswordStaff(String idStaff, String passwordStaff) {
        int status = StaffModel.editPasswordStaff(idStaff, passwordStaff);
        return status;
    }
    public boolean removeStaff(String idStaff) {
        return StaffModel.removeStaff(idStaff);
    }
}