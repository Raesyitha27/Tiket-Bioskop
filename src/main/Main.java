package main;

import entitiy.Film;
import entitiy.Pemesanan;
import entitiy.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Film> films = new ArrayList<>();
        ArrayList<Pemesanan> pemesanans = new ArrayList<>();


        List<Staff> staff = new ArrayList<>();
        staff.add(new Staff("123", "elga"));

        Scanner scanner = new Scanner(System.in);

        // LOGIN
        System.out.println("=== Login Staff ===");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (login(username, password, staff)) {
            boolean exit = false;
            while (!exit) {
                System.out.println("\n=== Elga CIMENA ===");
                System.out.println("1. Lihat Film");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. lihat tiket ");
                System.out.println("4. Keluar");
                System.out.print("Pilih opsi: ");
                int pilih = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (pilih) {
                    case 1:
                        System.out.println("nama film\tjadwal tayang         \tHarga \n");
                        System.out.println("spiderman\t10.00-12.00-14.00     \t45.000");
                        System.out.println("IronMan  \t11.00-13.30-16.30     \t45.000");

                        break;
                    case 2:
                        System.out.print("Masukkan nama film: ");
                        String movieName = scanner.nextLine();
                        System.out.print("Masukkan nomor kursi: ");
                        int seatNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        pemesanans.add(new Pemesanan(movieName, seatNumber));
                        System.out.println("Tiket berhasil dipesan.");

                        break;

                    case 3 :

                        System.out.println("Daftar Tiket:");
                        for (Pemesanan pemesanan : pemesanans) {
                            System.out.println(pemesanan);
                        }
                    case 4:
                        exit = true;
                        System.out.println("Terima kasih! Sampai jumpa.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

        scanner.close();
    }

    private static boolean login(String username, String password, List<Staff> users) {
        for (Staff staff : users) {
            if (staff.getUsername().equals(username) && staff.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
