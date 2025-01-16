package views;

import controllers.PembayaranController;
import controllers.TiketController;
import entitys.PembayaranEntity;
import entitys.StudioEntity;
import entitys.TiketEntity;
import controllers.StudioController;

import java.util.ArrayList;
import java.util.Scanner;

public class TiketView {

    TiketController tiketController = new TiketController();
    StudioController studioController = new StudioController();
    PembayaranController pembayaranController = new PembayaranController();
    StudioView studioView = new StudioView();
    PembayaranView pembayaranView = new PembayaranView();
    public void TiketMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=========================");
            System.out.println(" Menu Tiket ");
            System.out.println("=========================");
            System.out.println(" 1. Create Tiket ");
            System.out.println(" 2. Read Tiket ");
            System.out.println(" 3. Update Tiket ");
            System.out.println(" 4. Delete Tiket ");
            System.out.println(" 5. Keluar ");
            System.out.println("=========================");
            System.out.println(" Masukkan Pilihan :");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1 -> inputTiket();
                case 2 -> viewListTiket();
                case 3 -> updateTiket();
                case 4 -> deleteListTiket();
                case 5 -> System.out.println("Selesai..");
                default -> {
                    System.out.println(" Masukkan Pilihan Dengan Benar ! ");
                    System.out.println("");
                }
            }
        } while (pilihan != 5);
    }
    public void inputTiket() {
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan ID Tiket : ");
        String idTiket = input.nextLine();
        System.out.print(" Masukkan Nama Mall : ");
        String namaMall = input.nextLine();
        System.out.print(" Masukkan Nama Film : ");
        String namaFilm = input.nextLine();
        System.out.print(" Masukkan Tanggal Penayangan Film : ");
        String tanggalPenayangan = input.nextLine();
        System.out.print(" Masukkan Waktu Penayangan Film : ");
        String waktuPenayangan = input.nextLine();
        System.out.print(" Masukkan Harga Tiket Film : ");
        int hargaTiket = input.nextInt();
        System.out.println("");
        boolean status = TiketController.addTiket(new TiketEntity(idTiket,namaMall, namaFilm, tanggalPenayangan, waktuPenayangan, hargaTiket));
        if (status) {
            System.out.println("DATA BERHASIL DITAMBAHKAN");
        } else {
            System.out.println("DATA GAGAL DITAMBAHKAN");
        }
    }
    public void viewTiket(TiketEntity tiketEntity) {
        if ( tiketEntity == null) {
            System.out.println(" Data Kosong ");
        } else {
            System.out.println(" Id Tiket : " + tiketEntity.getIdTiket());
            System.out.println(" Nama Mall : " + tiketEntity.getNamaMall());
            System.out.println(" Nama Film : " + tiketEntity.getNamaFilm());
            System.out.println(" Tanggal Penayangan Film : " + tiketEntity.getTanggalPenayangan());
            System.out.println(" Waktu Penayangan Film : " + tiketEntity.getWaktuPenayangan());
            System.out.println(" Harga Tiket Film : " +tiketEntity.getHargaTiket());
            System.out.println("");
        }
    }
    public void viewListTiket() {
        ArrayList<TiketEntity> tiketEntityArrayList = tiketController.getListTiket();
        if (tiketEntityArrayList.isEmpty()) {
            System.out.println(" Data Kosong ");
        } else {
            for (TiketEntity tiketEntity : tiketEntityArrayList) {
                viewTiket(tiketEntity);

                ArrayList<StudioEntity> studioEntities = studioController.getListStudio();
                if (!studioEntities.isEmpty()) {
                    System.out.println("== Data Studio Terkait Tiket ==");
                    for (StudioEntity studio : studioEntities) {
                        if (studio.getIdPelanggan().equalsIgnoreCase(tiketEntity.getIdTiket())) {
                            studioView.viewStudio(studio);
                        }
                    }
                }
                ArrayList<PembayaranEntity> pembayaranEntities = pembayaranController.getListPembayaran();
                if (!pembayaranEntities.isEmpty()) {
                    System.out.println("== Data Pembayaran Terkait Tiket ==");
                    for (PembayaranEntity pembayaran : pembayaranEntities) {
                        if (pembayaran.getIdPembayaran().equalsIgnoreCase(tiketEntity.getIdTiket())) {
                            pembayaranView.viewPembayaran(pembayaran);
                        }
                    }
                }
            }
        }
    }

    public void updateTiket() {
        ArrayList<TiketEntity> tiketEntities = tiketController.getListTiket();
        Scanner input = new Scanner(System.in);
        if (tiketEntities.isEmpty()) {
            System.out.println(" Data Tidak Ada ");
        } else {
            System.out.print(" Masukkan ID Tiket Yang Ingin Diubah : ");
            String idTiket = input.nextLine();
            int indeks = tiketController.getIndexTiket(idTiket);
            if (indeks != -1) {
                boolean isRunning = true;
                while (isRunning) {
                    System.out.println("===========================");
                    System.out.println("  MENU UPDATE : ");
                    System.out.println("1. ID Tiket ");
                    System.out.println("2. Nama Mall ");
                    System.out.println("3. Nama Film ");
                    System.out.println("4. Tanggal Penayangan Film ");
                    System.out.println("5. Waktu Penayangan Film ");
                    System.out.println("6. Harga Tiket Film ");
                    System.out.println("7. Keluar ");
                    System.out.println("===========================");
                    System.out.print(" Masukkan Pilihan : ");
                    int pilih = input.nextInt();
                    input.nextLine();
                    switch (pilih) {
                        case 1 -> System.out.println(" Data ID Tiket Tidak Bisa Di Ubah");
                        case 2 -> {
                            System.out.print(" Masukkan Nama Mall Baru : ");
                            String namaMall = input.nextLine();
                            tiketController.editNamaMall(idTiket, namaMall);
                        }
                        case 3 -> {
                            System.out.print(" Masukkan Nama Film Baru : ");
                            String namaFilm = input.nextLine();
                            tiketController.editNamaTiket(idTiket, namaFilm);
                        }
                        case 4 -> {
                            System.out.print(" Masukkan Tanggal Penayangan Film Baru : ");
                            String tanggalPenayangan = input.nextLine();
                            tiketController.editTanggalPenayanganTiket(idTiket, tanggalPenayangan);
                        }
                        case 5 -> {
                            System.out.print(" Masukkan Waktu Penayangan Film Baru : ");
                            String waktuPenayangan = input.nextLine();
                            tiketController.editWaktuPenayanganTiket(idTiket, waktuPenayangan);
                        }
                        case 6 -> {
                            System.out.print(" Masukkan Harga Tiket Film Baru : ");
                            int hargaTiket = input.nextInt();
                            tiketController.editHargaTiket(idTiket, hargaTiket);
                        }
                        case 7 -> {
                            System.out.println(" KEMBALI KE MENU TIKET..");
                            isRunning = false;
                        }
                        default -> System.out.println(" Pilihan tidak valid. Silakan coba lagi.");
                    }
                }
            } else {
                System.out.println(" ID TIDAK TERDAFTAR");
            }
        }
    }
    public void deleteListTiket() {
        ArrayList<TiketEntity> tiketEntityArrayList = tiketController.getListTiket();
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan ID Tiket Yang ingin Di Hapus : ");
        String idTiket = input.nextLine();
        int index = tiketController.getIndexTiket(idTiket);
        if (index == -1) {
            System.out.print(" ID Tiket Tidak Di Temukan ");
        } else {
            System.out.println(" Apakah Yakin Data ID Tiket " + tiketEntityArrayList.get(index).getIdTiket().toUpperCase() + " Ingin Di Hapus (Y/N) : ");
            char konfirmasi = input.next().charAt(0);
            if (konfirmasi == 'y' || konfirmasi == 'Y') {
                tiketController.removeTiket(idTiket);
                System.out.println("");
                viewListTiket();
            } else {
                System.out.println(" Data ID Tiket Tidak Jadi Di Hapus ");
            }
        }
    }
}
