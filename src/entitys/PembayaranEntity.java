package entitys;


public class PembayaranEntity {
    private String idPembayaran;
    private double totalPembayaran;
    private String metodePembayaran;
    private boolean statusPembayaran;

    public PembayaranEntity(String idPembayaran, double totalPembayaran, String metodePembayaran, boolean statusPembayaran) {
        this.idPembayaran = idPembayaran;
        this.totalPembayaran = totalPembayaran;
        this.metodePembayaran = metodePembayaran;
        this.statusPembayaran = statusPembayaran;
    }

    public String getIdPembayaran() {
        return idPembayaran;
    }
    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public double getTotalPembayaran() {
        return totalPembayaran;
    }
    public void setTotalPembayaran(double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }
    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }
    public void setStatusPembayaran(boolean statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
}


