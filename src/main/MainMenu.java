package main;

import views.*;

import java.util.Scanner;

public class MainMenu {

    public void mainMenu() {
        StaffView staff = new StaffView();
        FilmView film = new FilmView();
        StudioView studio = new StudioView();
        PembayaranView pembayaran = new PembayaranView();
        TiketView tiket = new TiketView();


        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.println("\n SELAMAT DATANG DI SISTEM BIOSKOP");
        do {
            System.out.println("==================");
            System.out.println("1. Login staff.. ");
            System.out.println("0. Exit.. ");
            System.out.println("==================");
            System.out.println("Masukkan Pilihan :");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.print(" Username :");
                String usernameStaff = input.next();
                System.out.print(" Password :");
                String passwordStaff = input.next();
                if (staff.loginStaff(usernameStaff, passwordStaff)) {
                    do {
                        System.out.println("===========================");
                        System.out.println(" Menu Data Sistem Bioskop ");
                        System.out.println(" 1. Staff ");
                        System.out.println(" 2. Film ");
                        System.out.println(" 3. Studio ");
                        System.out.println(" 4. Pembayaran ");
                        System.out.println(" 5. Tiket ");
                        System.out.println(" 6. Keluar ");
                        System.out.println("===========================");
                        System.out.println("Masukkan Pilihan :");
                        pilihan = input.nextInt();
                        switch (pilihan) {
                            case 1 -> staff.StaffMenu();
                            case 2 -> film.FilmMenu();
                            case 3 -> studio.StudioMenu();
                            case 4 -> pembayaran.PembayaranMenu();
                            case 5 -> tiket.TiketMenu();
                            case 6 -> System.out.println("Terima Kasih..");
                            default -> System.out.println(" Pilihan Tidak Ada.. ");
                        }
                    } while (pilihan != 6);
                } else {
                    System.out.println("USERNAME DAN PASSWORD TIDAK COCOK..!!");
                }
            }
        }while (pilihan !=0);
        System.out.println("SAMPAI JUMPA LAGI..");
    }
}


