package entitiy;

public class Film {
    String id_film;
    String judul;
    String tanggalTayang;
    String durasi;
    int harga ;
    String id_jadwal;
    String waktuTayang;

    public Film( String nama_film,String judul,String tanggalTayang ,String durasi){
        this.id_film = nama_film;
        this.judul = judul ;
        this.tanggalTayang = tanggalTayang;
        this.durasi = durasi;
        this.harga = harga ;
        this.id_jadwal = id_jadwal;
        this.waktuTayang = waktuTayang;
    }

    public Film() {

    }

    public String getId_film() {
        return id_film;
    }

    public void setId_film(String id_film) {
        this.id_film = id_film;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggalTayang() {
        return tanggalTayang;
    }

    public void setTanggalTayang(String tanggalTayang) {
        this.tanggalTayang = tanggalTayang;
    }

    public String getDurasi() {
         return durasi;
    }

    public void setDurasi(String durasi) {this.durasi = durasi;}

    public int getHarga() { return harga;}

    public void setHarga(int harga) {this.harga = harga;}

    public String getId_jadwal() {
        return id_jadwal;
    }

    public void setId_jadwal(String id_jadwal) {
        this.id_jadwal = id_jadwal;
    }

    public String getWaktuTayang() {return waktuTayang;}

    public void setWaktuTayang(String waktuTayang) {this.waktuTayang = waktuTayang;}
}
