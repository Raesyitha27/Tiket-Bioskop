package controllers;

import entitys.PembayaranEntity;
import models.PembayaranModel;

import java.util.ArrayList;
import java.util.Iterator;

public class PembayaranController {
    public static boolean addPembayaran(PembayaranEntity pembayaran) {
        return PembayaranModel.addPembayaran(pembayaran);
    }

    public ArrayList<PembayaranEntity> getListPembayaran() {
        return PembayaranModel.getListPembayaran();
    }

    public void hapusDataGagalDebit() {
        ArrayList<PembayaranEntity> pembayaranEntityArrayList = PembayaranModel.getListPembayaran();
        Iterator<PembayaranEntity> iterator = pembayaranEntityArrayList.iterator();
        while (iterator.hasNext()) {
            PembayaranEntity pembayaranEntity = iterator.next();
            if (pembayaranEntity.getMetodePembayaran().equalsIgnoreCase("Debit") && !pembayaranEntity.isStatusPembayaran()) {
                iterator.remove();
            }
        }
        System.out.println("Data transaksi menggunakan Debit yang telah gagal 3x telah dihapus.");
    }
}

