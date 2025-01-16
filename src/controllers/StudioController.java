package controllers;

import entitys.StudioEntity;
import models.StudioModel;

import java.util.ArrayList;

public class StudioController {

    //    public StudioEntity getIdByPelanggan(String idPelanggan){
//        return StudioModel.getPelangganById(idPelanggan);
//    }
    public int getIndexStudio(String idPelanggan){
        return StudioModel.getIndexStudio(idPelanggan);
    }
    public static boolean addStudio(StudioEntity studio) {
        return StudioModel.addStudio(studio);
    }
    public ArrayList<StudioEntity> getListStudio(){
        return StudioModel.getListStudio();
    }
    public boolean removeStudio(String idPelanggan){
        return StudioModel.removeStudio(idPelanggan);
    }
}
