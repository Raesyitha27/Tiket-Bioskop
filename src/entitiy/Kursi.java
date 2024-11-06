package entitiy;

public class Kursi {
    private String nomorKursi;
    private boolean tersedia;

    // Constructor
    public Kursi(String nomorKursi, boolean tersedia) {
        this.nomorKursi = nomorKursi;
        this.tersedia = tersedia;
    }

    // Getter dan Setter
    public String getNomorKursi() {
        return nomorKursi;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Metode untuk mengubah status ketersediaan
    public void pesanKursi() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Kursi " + nomorKursi + " berhasil dipesan.");
        } else {
            System.out.println("Kursi " + nomorKursi + " tidak tersedia.");
        }
    }

    public void batalkanPesanan() {
        if (!tersedia) {
            tersedia = true;
            System.out.println("Kursi " + nomorKursi + " berhasil dibatalkan.");
        } else {
            System.out.println("Kursi " + nomorKursi + " sudah tersedia.");
        }
    }
}
