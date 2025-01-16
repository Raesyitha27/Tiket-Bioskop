package entitys;


public class TiketEntity {
    private final String idTiket;
    private String namaMall;
    private String namaFilm;
    private String tanggalPenayangan;
    private String waktuPenayangan;
    private int hargaTiket;

    public TiketEntity(String idTiket, String namaMall, String namaFilm, String tanggalPenayangan, String waktuPenayangan, int hargaTiket) {
        this.idTiket = idTiket;
        this.namaMall = namaMall;
        this.namaFilm = namaFilm;
        this.tanggalPenayangan = tanggalPenayangan;
        this.waktuPenayangan = waktuPenayangan;
        this.hargaTiket = hargaTiket;
    }

    public String getIdTiket() {
        return idTiket;
    }


    public String getNamaMall() {
        return namaMall;
    }

    public void setNamaMall(String namaMall) {
        this.namaMall = namaMall;
    }

    public String getNamaFilm() {
        return namaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
    }

    public String getTanggalPenayangan() {
        return tanggalPenayangan;
    }

    public void setTanggalPenayangan(String tanggalPenayangan) {
        this.tanggalPenayangan = tanggalPenayangan;
    }

    public String getWaktuPenayangan() {
        return waktuPenayangan;
    }

    public void setWaktuPenayangan(String waktuPenayangan) {
        this.waktuPenayangan = waktuPenayangan;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
}