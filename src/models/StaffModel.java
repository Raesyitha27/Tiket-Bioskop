package models;

import entitys.StaffEntity;

import java.util.ArrayList;

public class StaffModel {
    private static final ArrayList<StaffEntity> staffEntityArrayList = new ArrayList<>();
    public static void init(){
        if (staffEntityArrayList.isEmpty()){
            staffEntityArrayList.add(new StaffEntity("001", "Elga Rolobessy", "Elga","2704"));
        }
    }
    public static int getIndexStaff(String idStaff) {
        int index = -1;
        if (staffEntityArrayList.isEmpty()) {
            System.out.println(" Data Kosong \n");
        } else {
            for (StaffEntity staff : staffEntityArrayList) {
                if (staff.getIdStaff().equals(idStaff)) {
                    index = staffEntityArrayList.indexOf(staff);
                }
            }
        }
        return index;
    }

    public static boolean addStaff(StaffEntity staffEntity){
        boolean status = false;
        if (staffEntity != null){
            staffEntityArrayList.add(staffEntity);
            status = true;
        }
        return status;
    }

    public static ArrayList<StaffEntity> getListStaff() {
        return staffEntityArrayList;
    }

    public static int editNamaStaff(String idStaff, String namaStaff){
        int index = getIndexStaff(idStaff);
        staffEntityArrayList.get(index).setNamaStaff(namaStaff);
        return index;
    }

    public static int editUsernameStaff(String idStaff, String usernameStaff){
        int index = getIndexStaff(idStaff);
        staffEntityArrayList.get(index).setUsernameStaff(usernameStaff);
        return index;
    }

    public static int editPasswordStaff(String idStaff, String passwordStaff){
        int index = getIndexStaff(idStaff);
        staffEntityArrayList.get(index).setPasswordStaff(passwordStaff);
        return index;
    }

    public static boolean removeStaff(String idStaff){
        int index = getIndexStaff(idStaff);
        boolean status = false;
        if (index != -1) {
            staffEntityArrayList.remove(index);
            status = true;
        }
        return status;
    }
}