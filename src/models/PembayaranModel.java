package models;

import entitys.PembayaranEntity;

import java.util.ArrayList;

public class PembayaranModel {
    static ArrayList<PembayaranEntity> pembayaranEntityArrayList = new ArrayList<>();

    public static boolean addPembayaran(PembayaranEntity pembayaranEntity) {
        boolean status = false;
        if (pembayaranEntity != null) {
            pembayaranEntityArrayList.add(pembayaranEntity);
            status = true;
        }
        return status;
    }

    public static ArrayList<PembayaranEntity> getListPembayaran() {
        return pembayaranEntityArrayList;
    }
}
