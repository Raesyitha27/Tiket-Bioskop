package entity;


public class TiketEntity {
    private String id_Tiket;
    private String nama_Film;
    private String rating_Usia;
    private String tanggal_Tayang;
    private String waktu_Tayang;
    private String no_Kursi;
    private String no_Baris;
    private  int harga_Tiket;


    public TiketEntity(String idTiket, String id_Tiket, String nama_Film, String rating_Usia, String tanggal_Tayang, String waktu_Tayang, String no_Kursi) {
        this.id_Tiket = id_Tiket;
        this.nama_Film = nama_Film;
        this.rating_Usia = rating_Usia;
        this.tanggal_Tayang = tanggal_Tayang;
        this.waktu_Tayang = waktu_Tayang;
        this.no_Kursi = no_Kursi;
        this.no_Baris = no_Baris;
        this.harga_Tiket = harga_Tiket;

    }


    public String getId_Tiket() {
        return id_Tiket;
    }

    public void setId_Tiket(String id_Tiket) {
        this.id_Tiket = id_Tiket;
    }

    public String getNama_Film() {
        return nama_Film;
    }

    public void setNama_Film(String nama_Film) {
        this.nama_Film = nama_Film;
    }

    public String getRating_Usia() {
        return rating_Usia;
    }

    public void setRating_Usia(String rating_Usia) {
        this.rating_Usia = rating_Usia;
    }

    public String getTanggal_Tayang() {
        return tanggal_Tayang;
    }

    public void setTanggal_Tayang(String tanggal_Tayang) {
        this.tanggal_Tayang = tanggal_Tayang;
    }

    public String getWaktu_Tayang() {
        return waktu_Tayang;
    }

    public void setWaktu_Tayang(String waktu_Tayang) {
        this.waktu_Tayang = waktu_Tayang;
    }

    public String getNo_Kursi() {
        return no_Kursi;
    }

    public void setNo_Kursi(String no_Kursi) {
        this.no_Kursi = no_Kursi;
    }

    public String getNo_Baris() {
        return no_Baris;
    }

    public void setNo_Baris(String no_Baris) {
        this.no_Baris = no_Baris;
    }

    public int getHarga_Tiket() {
        return harga_Tiket;
    }

    public void setHarga_Tiket(int harga_Tiket) {
        this.harga_Tiket = harga_Tiket;
    }
}