package entity;

import java.util.List;

public class PembayaranEntity {
    private String id_Pembayaran;
    private String metode_Pembayaran;
    private int jumlah_Tiket;
    private double jumlah_Pembayaran;
    private boolean status_Pembayaran;

    public PembayaranEntity(String id_Pembayaran, String metode_Pembayaran, int jumlah_Tiket, double jumlah_Pembayaran, boolean status_Pembayaran) {
        this.id_Pembayaran = id_Pembayaran;
        this.metode_Pembayaran = metode_Pembayaran;
        this.jumlah_Tiket = jumlah_Tiket;
        this.jumlah_Pembayaran = jumlah_Pembayaran;
        this.status_Pembayaran = status_Pembayaran;
    }

    public String getId_Pembayaran() {
        return id_Pembayaran;
    }

    public void setId_Pembayaran(String id_Pembayaran) {
        this.id_Pembayaran = id_Pembayaran;
    }

    public String getMetode_Pembayaran() {
        return metode_Pembayaran;
    }

    public void setMetode_Pembayaran(String metode_Pembayaran) {
        this.metode_Pembayaran = metode_Pembayaran;
    }

    public int getJumlah_Tiket() {

        return jumlah_Tiket;
    }

    public void setJumlah_Tiket(int jumlah_Tiket) {
        this.jumlah_Tiket = jumlah_Tiket;
    }

    public double getJumlah_Pembayaran() {
        return jumlah_Pembayaran;
    }

    public void setJumlah_Pembayaran(double jumlah_Pembayaran) {
        this.jumlah_Pembayaran = jumlah_Pembayaran;
    }

    public boolean isStatus_Pembayaran() {
        return status_Pembayaran;
    }

    public void setStatus_Pembayaran(boolean status_Pembayaran) {
        this.status_Pembayaran = status_Pembayaran;
    }
    public void tampilkanInfoPembayaran() {
        System.out.println("\n===== Informasi Pembayaran =====");
        System.out.println("ID Pembayaran: " + id_Pembayaran);
        System.out.println("Metode Pembayaran: " + metode_Pembayaran);
        System.out.println("Jumlah Tiket: " + jumlah_Tiket);
        System.out.println("Jumlah Pembayaran: " + jumlah_Pembayaran);
        System.out.println("Status Pembayaran: " + (status_Pembayaran ? "Lunas" : "Belum Lunas"));
    }
}


