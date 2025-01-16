package views;

import controllers.FilmController;
import models.FilmModel;
import entitys.FilmEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class FilmView {
    FilmController filmController = new FilmController();
    public void FilmMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=========================");
            System.out.println(" \n MENU FILM ");
            System.out.println("=========================");
            System.out.println(" 1. Create Film ");
            System.out.println(" 2. Read Film ");
            System.out.println(" 3. Update Film ");
            System.out.println(" 4. Delete Film ");
            System.out.println(" 5. Keluar ");
            System.out.println("=========================");
            System.out.println("Masukkan Pilihan :");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1 -> inputFilm();
                case 2 -> viewListFilm();
                case 3 -> updateFilm();
                case 4 -> deleteListFilm();
                case 5 -> System.out.println("Selesai..");
                default -> {
                    System.out.println(" Masukkan Pilihan Dengan Benar ! ");
                    System.out.println("");
                }
            }
        } while (pilihan != 5);
    }

    public void inputFilm() {
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan ID Film : ");
        String idFilm = input.nextLine();
        System.out.print(" Masukkan Nama Film : ");
        String namaFilm = input.nextLine();
        System.out.print(" Masukkan Durasi Film : ");
        String durasi = input.nextLine();
        System.out.print(" Masukkan Waktu Tayang Film : ");
        String waktuTayang = input.nextLine();
        System.out.print(" Masukkan Rating Usia Film : ");
        String ratingUsia = input.nextLine();
        System.out.print(" Masukkan Genre Film : ");
        String genreFilm = input.nextLine();
        System.out.println("");
        boolean status = FilmController.addFilm(new FilmEntity(idFilm, namaFilm, durasi, waktuTayang, ratingUsia, genreFilm));
        if (status) {
            System.out.println("DATA BERHASIL DITAMBAHKAN");
        } else {
            System.out.println("DATA GAGAL DITAMBAHKAN");
        }
    }

    public FilmView() {
        FilmModel.dataFilmTemplate();
    }

    public void viewFilm(FilmEntity filmEntity) {
        if ( filmEntity == null) {
            System.out.println(" Data Kosong ");
        } else {
            System.out.println(" Id Film : " + filmEntity.getIdFilm());
            System.out.println(" Nama Film : " + filmEntity.getNamaFilm());
            System.out.println(" Durasi Film : " + filmEntity.getDurasiFilm());
            System.out.println(" Waktu Tayang Film : " + filmEntity.getWaktuTayang());
            System.out.println(" Rating Usia Film : " + filmEntity.getRatingUsia());
            System.out.println(" Genre Film : " + filmEntity.getGenreFilm());
            System.out.println("");
        }
    }

    public void viewListFilm() {
        ArrayList<FilmEntity>filmEntityArrayList = filmController.getListFilm();
        if (filmEntityArrayList.isEmpty()) {
            System.out.println(" Data Kosong ");
        } else {
            for (FilmEntity filmEntity : filmEntityArrayList) {
                viewFilm(filmEntity);
            }
        }
    }

    public void updateFilm() {
        ArrayList<FilmEntity> filmEntities = filmController.getListFilm();
        Scanner input = new Scanner(System.in);
        if (filmEntities.isEmpty()) {
            System.out.println("Data Tidak Ada");
        } else {
            System.out.print(" Masukkan ID Film Yang Ingin Diubah : ");
            String idFilm = input.nextLine();
            int indeks = filmController.getIndexFilm(idFilm);
            if (indeks != -1) {
                boolean isRunning = true;
                while (isRunning) {
                    System.out.println("===========================");
                    System.out.println("\t MENU UPDATE : ");
                    System.out.println("1. ID Film ");
                    System.out.println("2. Nama Film ");
                    System.out.println("3. Durasi Film ");
                    System.out.println("4. Waktu Tayang Film ");
                    System.out.println("5. Rating Usia Film ");
                    System.out.println("6. Rating Genre Film ");
                    System.out.println("7. Keluar ");
                    System.out.println("===========================");
                    System.out.print(" Masukkan Pilihan : ");
                    int pilih = input.nextInt();
                    input.nextLine();
                    switch (pilih) {
                        case 1 -> System.out.println(" Data ID Film Tidak Bisa Di Ubah");
                        case 2 -> {
                            System.out.print(" Masukkan Nama Film Baru : ");
                            String namaFilm = input.nextLine();
                            filmController.editNamaFilm(idFilm, namaFilm);
                        }
                        case 3 -> {
                            System.out.print(" Masukkan Durasi Film Baru : ");
                            String durasi = input.nextLine();
                            filmController.editDurasiFilm(idFilm, durasi);
                        }
                        case 4 -> {
                            System.out.print(" Masukkan Waktu Tayang Film Baru : ");
                            String waktuTayang = input.nextLine();
                            filmController.editWaktuTayangFilm(idFilm, waktuTayang);
                        }
                        case 5 -> {
                            System.out.print(" Masukkan Rating Usia Film Baru : ");
                            String ratingUsia = input.nextLine();
                            filmController.editRatingUsiaFilm(idFilm, ratingUsia);
                        }
                        case 6 -> {
                            System.out.print(" Masukkan Genre Film Baru : ");
                            String genreFilm = input.nextLine();
                            filmController.editGenreFilm(idFilm, genreFilm);
                        }
                        case 7 -> {
                            System.out.println(" KEMBALI KE MENU FILM..");
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
    public void deleteListFilm() {
        ArrayList<FilmEntity> filmEntityArrayList = filmController.getListFilm();
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan ID Film Yang ingin Di Hapus : \n");
        String idFilm = input.nextLine();
        int index = filmController.getIndexFilm(idFilm);
        if (index == -1) {
            System.out.print(" ID Film Tidak Di Temukan \n");
        } else {
            System.out.println(" Apakah Yakin Data ID Film " + filmEntityArrayList.get(index).getIdFilm().toUpperCase() + " Ingin Di Hapus (Y/N) : ");
            char konfirmasi = input.next().charAt(0);
            if (konfirmasi == 'y' || konfirmasi == 'Y') {
                filmController.removeFilm(idFilm);
                System.out.println("");
                viewListFilm();
            } else {
                System.out.println(" Data ID Film Tidak Jadi Di Hapus ");
            }
        }
    }
}