package entitiy;

public class Pemesanan   {
    private String judul_film;
    private String no_kursi;
    private Kursi kursi;
    private int jumlahTiket;
    private double totalHarga;
    private String metodePembayaran;
    private String statusPembayaran;
    private String tanggalTayang; // Format: "YYYY-MM-DD"
    private String waktuTayang;   // Format: "HH:MM"
    private String tanggalPemesanan;

    public Pemesanan(String movieName, int seatNumber) {
        this.judul_film = judul_film;
        this.no_kursi = no_kursi;
        this.kursi = kursi;
        this.jumlahTiket = jumlahTiket;
        this.totalHarga = totalHarga;
        this.metodePembayaran = metodePembayaran;
        this.statusPembayaran = statusPembayaran;
        this.tanggalTayang = tanggalTayang;
        this.waktuTayang = waktuTayang;
        this.tanggalPemesanan = tanggalPemesanan;
    }

    public String getNama_film() {
        return judul_film;
    }

    public void setNama_film(String nama_film) {
        this.judul_film = nama_film;
    }

    public String getNo_kursi() {
        return no_kursi;
    }

    public void setNo_kursi(String no_kursi) {
        this.no_kursi = no_kursi;
    }

    public Kursi getKursi() {
        return kursi;
    }

    public void setKursi(Kursi kursi) {
        this.kursi = kursi;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public String getTanggalTayang() {
        return tanggalTayang;
    }

    public void setTanggalTayang(String tanggalTayang) {
        this.tanggalTayang = tanggalTayang;
    }

    public String getWaktuTayang() {
        return waktuTayang;
    }

    public void setWaktuTayang(String waktuTayang) {
        this.waktuTayang = waktuTayang;
    }

    public String getTanggalPemesanan() {
        return tanggalPemesanan;
    }

    public void setTanggalPemesanan(String tanggalPemesanan) {
        this.tanggalPemesanan = tanggalPemesanan;
    }
}

