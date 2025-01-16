package controllers;

import entitys.TiketEntity;
import models.TiketModel;

import java.util.ArrayList;

public class TiketController {
    public int getIndexTiket(String idTiket){
        return TiketModel.getIndexTiket(idTiket);
    }
    public static boolean addTiket(TiketEntity tiket) {
        return TiketModel.addTiket(tiket);
    }
    public ArrayList<TiketEntity> getListTiket(){
        return TiketModel.getListTiket();
    }
    public int editNamaMall(String idTiket, String namaMall){
        int status = TiketModel.editNamaMall(idTiket, namaMall);
        return status;
    }
    public int editNamaTiket(String idTiket, String namaFilm){
        int status = TiketModel.editNamaTiket(idTiket, namaFilm);
        return status;
    }
    public int editTanggalPenayanganTiket(String idTiket, String tanggalPenayangan){
        int status = TiketModel.editTanggalPenayanganTiket(idTiket, tanggalPenayangan);
        return status;
    }
    public int editWaktuPenayanganTiket(String idTiket, String waktuPenayangan){
        int status = TiketModel.editWaktuPenayanganTiket(idTiket, waktuPenayangan);
        return status;
    }
    public int editHargaTiket(String idTiket, int hargaTiket){
        int status = TiketModel.editHargaTiket(idTiket, hargaTiket);
        return status;
    }
    public boolean removeTiket(String idTiket){
        return TiketModel.removeTiket(idTiket);
    }
}