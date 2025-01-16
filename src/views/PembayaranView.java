package views;

import entitys.PembayaranEntity;
import controllers.PembayaranController;

import java.util.ArrayList;
import java.util.Scanner;

public class PembayaranView {
    PembayaranController pembayaranController = new PembayaranController();
    private int gagalDebitCounter = 0;

    public void PembayaranMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=========================");
            System.out.println("  MENU PEMBAYARAN ");
            System.out.println("=========================");
            System.out.println(" 1. Create Pembayaran ");
            System.out.println(" 2. Read Pembayaran ");
            System.out.println(" 3. Update Pembayaran ");
            System.out.println(" 4. Delete Pembayaran ");
            System.out.println(" 5. Keluar ");
            System.out.println("=========================");
            System.out.println("Masukkan Pilihan :");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1 -> inputPembayaran();
                case 2 -> viewListPembayaran();
                case 3 -> System.out.println("FITUR UPDATE TIDAK TERSEDIA");
                case 4 -> System.out.println("FITUR DELETE TIDAK TERSEDIA");
                case 5 -> System.out.println("Selesai..");
                default -> {
                    System.out.println(" Masukkan Pilihan Dengan Benar ! ");
                    System.out.println("");
                }
            }
        } while (pilihan != 5);
    }

    public void inputPembayaran() {
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan ID Pembayaran : ");
        String idPembayaran = input.nextLine();
        System.out.print(" Masukkan Total Pembayaran : ");
        double totalPembayaran = input.nextDouble();
        input.nextLine();
        String metodePembayaran;
        while (true) {
            System.out.print(" Masukkan Metode Pembayaran \n");
            System.out.print("  [Cash | Debit]  : ");
            metodePembayaran = input.nextLine();
            if (metodePembayaran.equalsIgnoreCase("Cash") || metodePembayaran.equalsIgnoreCase("Debit")) {
                break;
            } else {
                System.out.println("Metode Pembayaran tidak valid. Harap masukkan 'Cash' atau 'Debit'.");
            }
        }
        System.out.print(" Masukkan Status Pembayaran  \n");
        System.out.print("    [Berhasil | Gagal]  : ");
        String statusInput = input.nextLine();

        boolean statusPembayaran;
        if (statusInput.equalsIgnoreCase("Berhasil")) {
            statusPembayaran = true;
            gagalDebitCounter = 0;
        } else {
            statusPembayaran = false;
            if (metodePembayaran.equalsIgnoreCase("Debit")) {
                gagalDebitCounter++;
                if (gagalDebitCounter >= 3) {
                    System.out.println("Transaksi menggunakan Debit telah gagal sebanyak 3 kali. Transaksi otomatis dibatalkan dan dihapus.");
                    pembayaranController.hapusDataGagalDebit();
                    return;
                }
            }
        }
        boolean status = PembayaranController.addPembayaran(new PembayaranEntity(idPembayaran, totalPembayaran, metodePembayaran, statusPembayaran));
        if (status) {
            System.out.println("===========================");
            System.out.println(" DATA BERHASIL DITAMBAHKAN ");
            System.out.println("");
        } else {
            System.out.println("=========================");
            System.out.println("  DATA GAGAL DITAMBAHKAN ");
            System.out.println("");
        }
    }

    public void viewPembayaran(PembayaranEntity pembayaranEntity) {
        if (pembayaranEntity == null) {
            System.out.println(" Data Kosong ");
        } else {
            System.out.println(" Id Pembayaran : " + pembayaranEntity.getIdPembayaran());
            System.out.println(" Total Pembayaran : " + pembayaranEntity.getTotalPembayaran());
            System.out.println(" Metode Pembayaran : " + pembayaranEntity.getMetodePembayaran());
            System.out.println(" Status Pembayaran : " + (pembayaranEntity.isStatusPembayaran() ? "Berhasil" : "Gagal"));
            System.out.println("");
        }
    }

    public void viewListPembayaran() {
        ArrayList<PembayaranEntity> pembayaranEntityArrayList = pembayaranController.getListPembayaran();
        if (pembayaranEntityArrayList.isEmpty()) {
            System.out.println(" Data Kosong ");
        } else {
            for (PembayaranEntity pembayaranEntity : pembayaranEntityArrayList) {
                viewPembayaran(pembayaranEntity);
            }
        }
    }
}
