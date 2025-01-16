package views;

import controllers.StudioController;
import entitys.StudioEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class StudioView {
    StudioController studioController = new StudioController();

    public void StudioMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=========================");
            System.out.println(" MENU STUDIO");
            System.out.println("=========================");
            System.out.println(" 1. Create Studio ");
            System.out.println(" 2. Read Studio ");
            System.out.println(" 3. Update Studio ");
            System.out.println(" 4. Delete Studio ");
            System.out.println(" 5. Keluar ");
            System.out.println("=========================");
            System.out.println("Masukkan Pilihan :");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1 -> inputStudio();
                case 2 -> viewListStudio();
                case 3 -> System.out.println("FITUR UPDATE TIDAK TERSEDIA");
                case 4 -> deleteListStudio();
                case 5 -> System.out.println("Selesai..");
                default -> {
                    System.out.println(" Masukkan Pilihan Dengan Benar ! ");
                    System.out.println("");
                }
            }
        } while (pilihan != 5);
    }
    public void inputStudio() {
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan ID Pelanggan : ");
        String idPelanggan = input.nextLine();
        System.out.print(" Masukkan Jumlah Tiket Yang Dibeli : ");
        int jumlahTiket = input.nextInt();
        input.nextLine();
        System.out.print(" Masukkan Nomor Ruangan Studio Yang Akan Digunakan : ");
        String nomorStudio  = input.nextLine();
        System.out.print(" Masukkan Nomor Kursi Yang akan Digunakan : ");
        String nomorKursi = input.nextLine();
        System.out.print(" Masukkan Nomor Baris Kursi Yang akan Digunakan : ");
        String nomorBaris = input.nextLine();
        System.out.println("");
        boolean status = StudioController.addStudio(new StudioEntity(idPelanggan, jumlahTiket, nomorStudio, nomorKursi, nomorBaris));
        if (status) {
            System.out.println("DATA BERHASIL DITAMBAHKAN");
        } else {
            System.out.println("DATA GAGAL DITAMBAHKAN");
        }
    }

    //        public StudioView() {
//        StudioModel.dataStudioTemplate();
//    }
    public void viewStudio(StudioEntity studioEntity) {
        if ( studioEntity == null) {
            System.out.println(" Data Kosong ");
        } else {
            System.out.println(" ID Pelanggan : " + studioEntity.getIdPelanggan());
            System.out.println(" Jumlah Tiket : " + studioEntity.getJumlahTiket());
            System.out.println(" Studio : " + studioEntity.getNomorStudio());
            System.out.println(" Seat : " + studioEntity.getNomorKursi());
            System.out.println(" Row : " + studioEntity.getNomorBaris());
            System.out.println("");
        }
    }
    public void viewListStudio() {
        ArrayList<StudioEntity> studioEntityArrayList = studioController.getListStudio();
        if (studioEntityArrayList.isEmpty()) {
            System.out.println(" Data Kosong ");
        } else {
            for (StudioEntity studioEntity : studioEntityArrayList) {
                viewStudio(studioEntity);
            }
        }
    }
    public void deleteListStudio() {
        ArrayList<StudioEntity> studioEntityArrayList = studioController.getListStudio();
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan Id Pelanggan Yang ingin Di Hapus : ");
        String idPelanggan = input.nextLine();
        int index = studioController.getIndexStudio(idPelanggan);
        if (index == -1) {
            System.out.print(" Id Pelanggan Tidak Di Temukan \n");
        } else {
            System.out.println(" Apakah Yakin Data ID Pelanggan " + studioEntityArrayList.get(index).getIdPelanggan() + " Ingin Di Hapus (Y/N) : ");
            char konfirmasi = input.next().charAt(0);
            if (konfirmasi == 'y' || konfirmasi == 'Y') {
                studioController.removeStudio(idPelanggan);
                System.out.println("");
                viewListStudio();
            } else {
                System.out.println(" Data Id Pelanggan Tidak Jadi Di Hapus ");
            }
        }
    }
}
