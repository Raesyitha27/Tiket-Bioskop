package entitiy;

public class Pembayaran {
    private String metodePembayaran;
    private double jumlahPembayaran;
    private boolean statusPembayaran;

    // Constructor
    public Pembayaran(String metodePembayaran, double jumlahPembayaran) {
        this.metodePembayaran = metodePembayaran;
        this.jumlahPembayaran = jumlahPembayaran;
        this.statusPembayaran = false; // Pembayaran belum dikonfirmasi saat pertama kali dibuat
    }

    // Getter dan Setter
    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public double getJumlahPembayaran() {
        return jumlahPembayaran;
    }

    public void setJumlahPembayaran(double jumlahPembayaran) {
        this.jumlahPembayaran = jumlahPembayaran;
    }

    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(boolean statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }


    public void prosesPembayaran() {
        // Logika untuk memproses pembayaran bisa ditambahkan di sini.
        // Misalnya, verifikasi pembayaran ke server bank, dll.
        System.out.println("Memproses pembayaran sebesar " + jumlahPembayaran + " menggunakan metode " + metodePembayaran);
    }

    public void konfirmasiPembayaran() {
        this.statusPembayaran = true;
        System.out.println("Pembayaran telah dikonfirmasi.");
    }

    public void batalkanPembayaran() {
        if (statusPembayaran) {
            statusPembayaran = false;
            System.out.println("Pembayaran dibatalkan.");
        } else {
            System.out.println("Pembayaran belum dilakukan atau sudah dibatalkan sebelumnya.");
        }
    }
}