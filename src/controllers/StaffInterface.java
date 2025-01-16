package controllers;

import entitys.StaffEntity;

import java.util.ArrayList;

public interface StaffInterface {
    boolean cekStaff(String usernameStaff, String passwordStaff);
    int getIndexStaff(String idStaff);
    boolean addStaff(StaffEntity staff);
    ArrayList<StaffEntity> getListStaff();
    int editNamaStaff(String idStaff, String namaStaff);
    int editUsernameStaff(String idStaff, String usernameStaff);
    int editPasswordStaff(String idStaff, String passwordStaff);
    boolean removeStaff(String idStaff);
}