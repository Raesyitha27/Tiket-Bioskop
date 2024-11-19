package main;

import entity.FilmEntity;
import entity.PembayaranEntity;
import entity.TiketEntity;
import entity.StaffEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<FilmEntity> films = new ArrayList<>();
        ArrayList<TiketEntity> pemesanans = new ArrayList<>();
        List<StaffEntity> staff = new ArrayList<>();
        staff.add(new StaffEntity("123", "elga", "11"));
        staff.add(new StaffEntity("12", "rara", "12"));

        Scanner scanner = new Scanner(System.in);

        // LOGIN
        System.out.println("=== Login Staff ===");
        System.out.print("ID Staff: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Mendapatkan staff yang berhasil login
        StaffEntity staffLogin = login(username, password, staff);

        if (staffLogin != null) {
            // Menampilkan pesan sambutan setelah login berhasil
            System.out.println("Selamat datang, " + staffLogin.getNama() + "!");
            boolean exit = false;

            while (!exit) {
                System.out.println("\n=== Elga CINEMA ===");
                System.out.println("1. Lihat Film");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. Lihat Tiket");
                System.out.println("4. Pembayaran");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");
                int pilih;

                // Validasi input opsi
                try {
                    pilih = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    continue;
                }

                switch (pilih) {
                    case 1:
                        // Menampilkan daftar film
                        System.out.println("\n=== DAFTAR FILM ===");
                        System.out.println("Nama Film\tJadwal Tayang");
                        System.out.println("Spiderman\t10.00 - 12.00 - 14.00");
                        System.out.println("IronMan  \t11.00 - 13.30 - 16.30");
                        break;

                    case 2:
                        // Memesan tiket
                        System.out.print("\nMasukkan nama film: ");
                        String nama_Film = scanner.nextLine();

                        System.out.print("Masukkan jumlah tiket: ");
                        int jumlah_Tiket;
                        try {
                            jumlah_Tiket = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Jumlah tiket harus berupa angka.");
                            break;
                        }

                        System.out.print("Pilih jam tayang: ");
                        String jam_Tayang = scanner.nextLine();

                        System.out.print("Masukkan nomor kursi: ");
                        String no_Kursi = scanner.nextLine();

                        System.out.print("Masukkan nomor baris: ");
                        String no_Baris = scanner.nextLine();

                        for (int i = 0; i < jumlah_Tiket; i++) {
                            String id_Tiket = "E" + (pemesanans.size() + 1);
                            pemesanans.add(new TiketEntity(id_Tiket, nama_Film, no_Kursi, no_Baris, "11-07-25", jam_Tayang, "14.00"));
                        }

                        System.out.println(jumlah_Tiket + " tiket berhasil dipesan.");
                        break;

                    case 3:
                        // Menampilkan tiket yang sudah dipesan
                        if (pemesanans.isEmpty()) {
                            System.out.println("Belum ada tiket yang dipesan.");
                        } else {
                            System.out.println("\n=== TIKET PESANAN ===");
                            for (TiketEntity pemesanan : pemesanans) {
                                System.out.println("------------------------");
                                System.out.println("ID Tiket    : " + pemesanan.getId_Tiket());
                                System.out.println("Film        : " + pemesanan.getNama_Film());
                                System.out.println("Kursi       : " + pemesanan.getNo_Kursi());
                                System.out.println("Baris       : " + pemesanan.getNo_Baris());
                                System.out.println("Tanggal     : " + pemesanan.getTanggal_Tayang());
                                System.out.println("Waktu       : " + pemesanan.getWaktu_Tayang());
                                System.out.println("Harga       : " + pemesanan.getHarga_Tiket());
                                System.out.println("------------------------");
                            }
                        }
                        break;

                    case 4:
                        // Proses pembayaran
                        System.out.println("\n=== PEMBAYARAN ===");

                        if (pemesanans.isEmpty()) {
                            System.out.println("Belum ada tiket yang dipesan. Silakan pesan tiket terlebih dahulu.");
                            break;
                        }

                        System.out.print("Masukkan ID Pembayaran: ");
                        String idPembayaran = scanner.nextLine();

                        System.out.print("Masukkan Metode Pembayaran (Transfer/Cash): ");
                        String metodePembayaran = scanner.nextLine();

                        System.out.print("Masukkan Jumlah Tiket: ");
                        int jumlahTiketDibayar;
                        try {
                            jumlahTiketDibayar = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Jumlah tiket harus berupa angka.");
                            break;
                        }

                        if (jumlahTiketDibayar > pemesanans.size()) {
                            System.out.println("Jumlah tiket tidak valid. Anda hanya memesan " + pemesanans.size() + " tiket.");
                            break;
                        }

                        double totalHarga = jumlahTiketDibayar * 40000;
                        System.out.println("Total Harga: Rp " + totalHarga);

                        System.out.print("Masukkan Jumlah Pembayaran: ");
                        double jumlahPembayaran;
                        try {
                            jumlahPembayaran = Double.parseDouble(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Jumlah pembayaran harus berupa angka.");
                            break;
                        }

                        boolean statusPembayaran = jumlahPembayaran >= totalHarga;

                        PembayaranEntity pembayaran = new PembayaranEntity(
                                idPembayaran,
                                metodePembayaran,
                                jumlahTiketDibayar,
                                jumlahPembayaran,
                                statusPembayaran
                        );

                        System.out.println("\n=== INFORMASI PEMBAYARAN ===");
                        pembayaran.tampilkanInfoPembayaran();

                        if (statusPembayaran) {
                            System.out.println("Pembayaran berhasil!");
                        } else {
                            System.out.println("Pembayaran gagal. Jumlah pembayaran kurang dari total harga.");
                        }
                        break;

                    case 5:
                        // Keluar dari program
                        exit = true;
                        System.out.println("Terima kasih! Sampai jumpa.");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        } else {
            System.out.println("Login gagal. ID atau password salah.");
        }

        scanner.close();
    }

    private static StaffEntity login(String idStaff, String password, List<StaffEntity> staffList) {
        for (StaffEntity staff : staffList) {
            if (staff.getId_staff().equals(idStaff) && staff.getPassword().equals(password)) {
                return staff;
            }
        }
        return null;
    }
}
