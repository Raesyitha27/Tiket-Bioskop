package models;

import entitys.StudioEntity;

import java.util.ArrayList;

public class StudioModel {
    //    private final static String[] idPelanggan = {"050"};
//    private final static int[] jumlahTiket = {50};
//    private final static String[] nomorStudio = {"1-5"};
//    private final static String[] nomorKursi = {"1-11"};
//    private final static String[] nomorBaris = {"A-K"};


//    public static void dataStudioTemplate() {
//        for (int i = 0; i<idPelanggan.length; i++) {
//            StudioEntity studioEntity = new StudioEntity(idPelanggan[i],jumlahTiket[i],nomorStudio[i], nomorKursi[i], nomorBaris[i]);
//            studioEntityArrayList.add(studioEntity);
//        }
//    }

    static ArrayList<StudioEntity> studioEntityArrayList = new ArrayList<>();
    public static int getIndexStudio(String idPelanggan) {
        int index = -1;
        if (studioEntityArrayList.isEmpty()) {
            System.out.println(" Data Kosong ");
        } else {
            for (StudioEntity studioEntity : studioEntityArrayList) {
                if (studioEntity.getIdPelanggan().equals(idPelanggan)) {
                    index = studioEntityArrayList.indexOf(studioEntity);
                }
            }
        }
        return index;
    }

//    public static StudioEntity getPelangganById(String idPelanggan){
//        StudioEntity studio = null;
//        for (StudioEntity studioEntity  : studioEntityArrayList) {
//            if (studioEntity.getIdPelanggan().equals(idPelanggan)){
//                studio = studioEntity;
//            }
//        }
//        return studio;
//    }

    public static boolean addStudio(StudioEntity studioEntity){
        boolean status = false;
        if (studioEntity != null){
            studioEntityArrayList.add(studioEntity);
            status = true;
        }
        return status;
    }
    public static ArrayList<StudioEntity> getListStudio()    {
        return studioEntityArrayList;
    }

    public static boolean removeStudio(String idPelanggan){
        int index = getIndexStudio(idPelanggan);
        boolean status = false;
        if (index != -1){
            studioEntityArrayList.remove(index);
            status = true;
        }
        return status;
    }
}
