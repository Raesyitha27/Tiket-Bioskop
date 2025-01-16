package models;

import entitys.TiketEntity;

import java.util.ArrayList;


public class TiketModel {
    static ArrayList<TiketEntity> tiketEntityArrayList = new ArrayList<>();
    public static int getIndexTiket(String idTiket) {
        int index = -1;
        if (tiketEntityArrayList.isEmpty()) {
            System.out.println(" Data Kosong ");
        } else {
            for (TiketEntity tiketEntity : tiketEntityArrayList) {
                if (tiketEntity.getIdTiket().equals(idTiket)) {

                    index = tiketEntityArrayList.indexOf(tiketEntity);
                }
            }
        }
        return index;
    }
    public static boolean addTiket(TiketEntity tiketEntity){
        boolean status = false;
        if (tiketEntity != null){
            tiketEntityArrayList.add(tiketEntity);
            status = true;
        }
        return status;
    }
    public static ArrayList<TiketEntity> getListTiket() {
        return tiketEntityArrayList;
    }

    public static int editNamaMall(String idTiket, String namaMall){
        int index = getIndexTiket(idTiket);
        tiketEntityArrayList.get(index).setNamaMall(namaMall);
        return index;
    }

    public static int editNamaTiket(String idTiket, String namaFilm){
        int index = getIndexTiket(idTiket);
        tiketEntityArrayList.get(index).setNamaFilm(namaFilm);
        return index;
    }

    public static int editTanggalPenayanganTiket(String idTiket, String tanggalPenayangan){
        int index = getIndexTiket(idTiket);
        tiketEntityArrayList.get(index).setTanggalPenayangan(tanggalPenayangan);
        return index;
    }

    public static int editWaktuPenayanganTiket(String idTiket, String waktuPenayangan){
        int index = getIndexTiket(idTiket);
        tiketEntityArrayList.get(index).setWaktuPenayangan(waktuPenayangan);
        return index;
    }

    public static int editHargaTiket(String idTiket, int hargaTiket){
        int index = getIndexTiket(idTiket);
        tiketEntityArrayList.get(index).setHargaTiket(hargaTiket);
        return index;
    }
    public static boolean removeTiket(String idTiket){
        int index = getIndexTiket(idTiket);
        boolean status = false;
        if (index != -1){
            tiketEntityArrayList.remove(index);
            status = true;
        }
        return status;
    }
}