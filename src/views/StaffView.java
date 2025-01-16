package views;

import entitys.StaffEntity;
import controllers.StaffController;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StaffView {
    StaffController staffController = new StaffController();

    public void StaffMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("======================");
            System.out.println(" MENU STAFF ");
            System.out.println("======================");
            System.out.println(" 1. Create Staff ");
            System.out.println(" 2. Read Staff ");
            System.out.println(" 3. Update Staff ");
            System.out.println(" 4. Delete Staff ");
            System.out.println(" 5. Keluar ");
            System.out.println("======================");
            System.out.println("Masukkan Pilihan :");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1 -> inputStaff();
                case 2 -> viewListStaff();
                case 3 -> updateStaff();
                case 4 -> deleteListStaff();
                case 5 -> System.out.println("Selesai..");
                default -> System.out.println("Masukkan Pilihan Dengan Benar..!");
            }
        } while (pilihan != 5);
    }

    public boolean loginStaff(String usernameStaff, String passwordStaff) {
        return staffController.cekStaff(usernameStaff, passwordStaff);
    }

    public void inputStaff() {
        System.out.println("=== MENU INSERT ===");
        Scanner input = new Scanner(System.in);
        try {
            System.out.print(" Masukkan Id Staff  : ");
            String idStaff = input.nextLine();
            System.out.print(" Masukkan Nama Staff : ");
            String namaStaff = input.nextLine();
            System.out.print(" Masukkan Username Staff : ");
            String usernameStaff = input.nextLine();
            System.out.print(" Masukkan Password Staff : ");
            String passwordStaff = input.nextLine();
            boolean status = staffController.addStaff(new StaffEntity(idStaff, namaStaff, usernameStaff, passwordStaff));
            if (status) {
                System.out.println("\n DATA BERHASIL DITAMBAHKAN");
            } else {
                System.out.println("\n DATA GAGAL DITAMBAHKAN");
            }
        } catch (InputMismatchException ex) {
            System.out.println("\n Masukkan Inputan Dengan Benar" + ex);
        }
    }

    public void viewStaff(StaffEntity staffEntity) {
        if (staffEntity == null) {
            System.out.println(" Data Kosong ");
        } else {
            System.out.println(" Id Staff : " + staffEntity.getIdStaff());
            System.out.println(" Nama Staff : " + staffEntity.getNamaStaff());
            System.out.println(" Username Staff : " +staffEntity.getUsernameStaff());
            System.out.println(" Password Staff : " + staffEntity.getPasswordStaff());
            System.out.println("");
        }
    }

    public void viewListStaff() {
        ArrayList<StaffEntity> staffEntityArrayList = staffController.getListStaff();
        if (staffEntityArrayList.isEmpty()) {
            System.out.println(" Data Kosong ");
        } else {
            for (StaffEntity staffEntity : staffEntityArrayList) {
                viewStaff(staffEntity);
            }
        }
    }

    public void updateStaff() {
        ArrayList<StaffEntity> staffEntities = staffController.getListStaff();
        Scanner input = new Scanner(System.in);
        if (staffEntities.isEmpty()) {
            System.out.println("Data Tidak Ada");
        } else {
            System.out.print(" Masukkan Id Staff Yang Ingin Diubah : ");
            String idStaff = input.nextLine();
            int index = staffController.getIndexStaff(idStaff);
            if (index != -1) {
                System.out.println("===========================");
                System.out.println(" MENU UPDATE ");
                System.out.println("1. Id Staff ");
                System.out.println("2. Nama Staff ");
                System.out.println("3. Username Staff ");
                System.out.println("4. Password Staff ");
                System.out.println("===========================");
                System.out.println(" Masukkan Pilihan :");
                int pilih = input.nextInt();
                input.nextLine();
                switch (pilih) {
                    case 1 -> System.out.println(" Data Id Staff Tidak Bisa Di Ubah ");
                    case 2 -> {
                        System.out.print(" Masukkan Nama Staff Baru : ");
                        String namaStaff = input.nextLine();
                        staffController.editNamaStaff(idStaff, namaStaff);
                    }
                    case 3 -> {
                        System.out.print(" Masukkan Usernamw Staff Baru : ");
                        String usernameStaff = input.nextLine();
                        staffController.editUsernameStaff(idStaff, usernameStaff);
                    }
                    case 4 -> {
                        System.out.print(" Masukkan Password Staff Baru : ");
                        String passwordStaff = input.nextLine();
                        staffController.editPasswordStaff(idStaff, passwordStaff);
                    }
                }
            }else{
                System.out.println("TIDAK TERDAFTAR");
            }
        }
    }

    public void deleteListStaff() {
        ArrayList<StaffEntity> staffEntityArrayList = staffController.getListStaff();
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan Id Staff Yang Ingin Di Hapus : \n");
        String idStaff = input.nextLine();
        int index = staffController.getIndexStaff(idStaff);
        if (index == -1) {
            System.out.print(" Id Staff Tidak Di Temukan \n");
        } else {
            System.out.println(" Apakah Yakin Data Id Staff " + staffEntityArrayList.get(index).getIdStaff().toUpperCase() + " Ingin Di Hapus (Y/N) : ");
            char kofirmasi = input.next().charAt(0);
            if (kofirmasi == 'y' || kofirmasi == 'Y') {
                staffController.removeStaff(idStaff);
                System.out.println("");
                viewListStaff();
            } else {
                System.out.println(" Data Tidak Jadi Di Hapus ");
            }
        }
    }
}