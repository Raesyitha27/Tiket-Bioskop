package entity;

public class FilmEntity {
    String id_Film;
    String nama_Film;
    String durasi;
    String tanggal_Tayang;
    String waktu_Tayang;
    String rating_Usia;

    public FilmEntity(String id_Film, String nama_Film, String durasi) {
        this.id_Film = id_Film;
        this.nama_Film = nama_Film;
        this.durasi = durasi;
        this.tanggal_Tayang = tanggal_Tayang;
        this.waktu_Tayang = waktu_Tayang;
        this.rating_Usia = rating_Usia;
    }

    public String getId_Film() {
        return id_Film;
    }

    public void setId_Film(String id_Film) {
        this.id_Film = id_Film;
    }

    public String getNama_Film() {
        return nama_Film;
    }

    public void setNama_Film(String nama_Film) {
        this.nama_Film = nama_Film;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
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

    public String getRating_Usia() {
        return rating_Usia;
    }

    public void setRating_Usia(String rating_Usia) {
        this.rating_Usia = rating_Usia;
    }
}